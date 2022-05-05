package com.zohocrmpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmpractice.entities.Lead;
import com.zohocrmpractice.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;

	@RequestMapping("/view")
	public String viewLead() {
		
		return"create_lead";
	}

	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		
		return "lead_info";
		
		
	}
}
