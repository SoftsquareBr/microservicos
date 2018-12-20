package com.softsquare.ms.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.softsquare.ms.business.TipoRelatorio;
import com.softsquare.ms.dto.RelatorioDto;

@Service
public class RelatorioService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private List<RelatorioDto> relatorioVendas = new ArrayList<>();
	
	private File arquivoCSV = new File("C:\\SVREL35.csv");

	private List<String> relatorioVendasCsv = new ArrayList<>();
	
	public List<RelatorioDto> relatorio(Long start, Long end) {
		if(relatorioVendas.isEmpty()) {
			carregaArquivo();
		}
		
		List<RelatorioDto> result = new ArrayList<>();
		
		if(validRange(start, end, TipoRelatorio.JSON)) {
			result = relatorioVendas.subList(start.intValue(), end.intValue());
		}
		
		return result;
	}

	private boolean validRange(Long start, Long end, TipoRelatorio tipoRelatorio) {
		if(start < 0) {
			return false;
		}
		
		if(end < 0) {
			return false;
		}
		
		if(start > end) {
			return false;
		}
		
		Long maxSize = 0L;
		
		if(tipoRelatorio == TipoRelatorio.JSON) {
			maxSize = (long) relatorioVendas.size();
		}
		
		if(tipoRelatorio == TipoRelatorio.CSV) {
			maxSize = (long) relatorioVendasCsv.size();
		}
		
		if(start > maxSize) {
			return false;
		}
		
		if(end > maxSize) {
			return false;
		}
		
		return true;
	}

	public void carregaArquivo() {
		logger.info("Carregando arquivo " + arquivoCSV.getAbsolutePath());
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV));
			String linha  = null;
			while(true) {
				linha = reader.readLine();
				if(linha == null) 
					break;
				relatorioVendas.add(new RelatorioDto(linha));
				relatorioVendasCsv.add(linha);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			logger.error("FileNotFoundException Erro lendo arquivo: " + this.arquivoCSV.getAbsoluteFile());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("IOException Erro lendo arquivo: " + this.arquivoCSV.getAbsoluteFile());
			e.printStackTrace();
		} finally {}
		
		logger.info("Fim Carga do arquivo " + arquivoCSV.getAbsolutePath());
	}

	public List<String> relatorioCsv(Long start, Long end) {
		if(relatorioVendasCsv.isEmpty()) {
			carregaArquivo();
		}
		
		List<String> result = new ArrayList<>();
		
		if(validRange(start, end, TipoRelatorio.CSV)) {
			result = relatorioVendasCsv.subList(start.intValue(), end.intValue());
		}
		
		return result;
	}

	public void carregaArquivo(StringBuilder mensagem) {
		String[] linhas = mensagem.toString().split("\n");
		for(String linha : linhas) {
			relatorioVendas.add(new RelatorioDto(linha));
			relatorioVendasCsv.add(linha);
		}
	}	

}
