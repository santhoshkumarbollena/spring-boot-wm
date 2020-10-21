package com.example.DMS.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import com.example.DMS.Models.Dog;

import com.example.DMS.repository.DogRepository;

@Controller
public class DogController {
//	ModelAndView mv = new ModelAndView();
	@Autowired
	DogRepository dogRepo;
	
	@RequestMapping("dogHome")
	public String home() 
	{
//		mv.setViewName("home");
		Iterable<Dog> dogList = dogRepo.findAll();
		
		Dog d1=new Dog();
		d1.setId(1);
		d1.setName("new with per 1");
		d1.setBreed("demo0006");
		Dog d2=new Dog();
		d2.setId(2);
		d2.setBreed("demo0000006");
		d2.setName("new with per 2");
		ArrayList<Dog> ai=new ArrayList<Dog>();
		ai.add(d1);
		ai.add(d2);
		System.out.println(ai);
		dogRepo.saveAll(ai);
		System.out.println(dogList);
		
//		mv.addObject("dogs", dogList);
		return "demos";
	}
	
//	@RequestMapping("edit")
//	public ModelAndView edit(@RequestParam("id") int id) 
//	{
//		mv.setViewName("editDog.html");
//		Dog dogFound = dogRepo.findById(id).orElse(new Dog());
//		mv.addObject(dogFound);
//		return mv;
//	}
//	@RequestMapping("editDog")
//	public ModelAndView editDog(Dog dog) 
//	{
//
//		dogRepo.save(dog);
//		mv.setViewName("home");
//		Iterable<Dog> dogList = dogRepo.findAll();
////		System.out.println(dogList);
//		
//		mv.addObject("dogs", dogList);
//		
//		return mv;
//	}

}
