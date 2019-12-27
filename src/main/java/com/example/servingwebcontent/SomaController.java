package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SomaController {

	@GetMapping("/soma")
	public String somar(
            @RequestParam(name="a", required=true) int valA, 
            @RequestParam(name="b", required=true) int valB, 
            Model model) {

		model.addAttribute("valA", valA);
        model.addAttribute("valB", valB);
        model.addAttribute("result", valA + valB);
        
        return "soma";
	}

}