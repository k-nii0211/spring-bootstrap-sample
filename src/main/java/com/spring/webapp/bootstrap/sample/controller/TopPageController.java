package com.spring.webapp.bootstrap.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopPageController {

	private static final Logger log = LoggerFactory.getLogger(TopPageController.class);

	@RequestMapping(value="web/top", method=RequestMethod.GET)
	public String getTopPage() {
		log.info("topPage Comming");
		return "index";
	}
}
