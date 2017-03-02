package com.test.controller;

import com.test.Utilities.ActivitiServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		String path = "";
		File tempPath ;
		ActivitiServer.startActiviti();
		try {
            File f = new File("test.txt");
            f.createNewFile();
			path = f.getAbsolutePath();
            tempPath = new File("");
            model.addAttribute("sitePath", tempPath);

        } catch (Exception e) {
               e.printStackTrace();
        }
        model.addAttribute("greeting", "For Azure +\n" + path);
        return "welcome";
	}


	@RequestMapping(value="/azure", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {

		model.addAttribute("greeting", "For Azure...../azure ");
		return "welcome";
	}

}
