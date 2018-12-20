package com.softsquare.ms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softsquare.ms.dto.RelatorioDto;
import com.softsquare.ms.services.RelatorioService;

@RestController
public class RelatorioController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private RelatorioService relatorioService;

	@RequestMapping("/relatorio/{start}/{end}")
	public List<RelatorioDto> relatorio(@PathVariable("start") Long start, @PathVariable("end") Long end) {
		
		logger.info("/relatorio called with parameters : Start: " + start + " " + " End: " + end);
		return relatorioService.relatorio(start, end);
	}
	
	@RequestMapping("/relatorio/csv/{start}/{end}")
	public List<String> relatorioCsv(@PathVariable("start") Long start, @PathVariable("end") Long end) {
		
		logger.info("/relatorio/csv called with parameters : Start: " + start + " " + " End: " + end);
		return relatorioService.relatorioCsv(start, end);
	}

}
