package com.keerthivasanspring.demoproject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class keerthiController {
	@GetMapping ("/api2")
	public String myMethod(Model model) {
		model.addAttribute("name","keerthivasan");
		model.addAttribute("age",23);
		model.addAttribute("city","salem");
		model.addAttribute("state","Tamil Nadu");
		return "index";
	}
	@GetMapping ("/api/v3")
	public String itemMethod(Model model)
	{
		Person p1=new Person("Keerthi",23);
		Person p2=new Person("Kabilan",23);
		Person p3=new Person("Hardhar",23);
		Person p4=new Person("Mohan",23);
		Person p5=new Person("Kamil",23);
		
		List<Person> plist=Arrays.asList(p1,p2,p3,p4,p5);
		model.addAttribute("personslist",plist);
		
		return "myfile";	
	}
	@GetMapping("/api/v4")
	public String jspmethod(Model model)
	{
		return "pro";
	}
}