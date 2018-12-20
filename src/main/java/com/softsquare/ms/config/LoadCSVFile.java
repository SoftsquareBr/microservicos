package com.softsquare.ms.config;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.softsquare.ms.services.RelatorioService;

@Configuration
public class LoadCSVFile {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private RelatorioService relatorioService;
	
	@PostConstruct
    public void afterPropertiesSet() throws Exception {

		//Gets the XML file under src/main/resources folder
        Resource resource = new ClassPathResource("SVREL35.zip");
        File file = resource.getFile();
        logger.info("Reading file: {}", file.getAbsolutePath());
        
        byte[] buffer = new byte[8192];
        
        ZipInputStream zin = new ZipInputStream(new BufferedInputStream(resource.getInputStream()));
        ZipEntry entry = zin.getNextEntry();
       	
        // TODO: better way to implement this load CSV on startup
//        System.out.println("Extracting: " + entry + " size: " + entry.getSize());
//		int tamanho = zin.read(buffer);
//		StringBuilder sb = new StringBuilder();
//		while(tamanho > 0) {
//			// sb.append(new String(buffer));
//			tamanho = zin.read(buffer);
//		}
		
		//relatorioService.carregaArquivo(sb);
    }	
}
