package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/", method= RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="/iniciar", method= RequestMethod.GET)
	public String welcome(Model m){
		m.addAttribute("habilita", "disabled=\"disabled\"");
		return "home";
	}
}
