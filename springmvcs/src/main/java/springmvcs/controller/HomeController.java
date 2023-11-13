package springmvcs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//requestMapping on class level by that url have one layer
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is home url");
		return "home";
	}
	
	//about Model object to sent data from controller to  view
	@RequestMapping("/about")
	public String about(Model model)
	{
		System.out.println("this is about url");
		model.addAttribute("name","Nikhil");
		model.addAttribute("id",569);
		model.addAttribute("age",21);
		model.addAttribute("type","shy");
		List<String> friend=new ArrayList<String>();
		List<String> problems=new ArrayList<String>();
		friend.add("jake");friend.add("jakal");friend.add("joker");
		problems.add("negativity");problems.add("luck");problems.add("confidence");
		model.addAttribute("frie",friend);
		model.addAttribute("probs",problems);
		return "about";
	}
	
	//about ModelAndView object to sent data from controller to view
	//about RequestMethod here GET can be change to PUT,DELETE,POST etc as per request from view or url
	@RequestMapping(path="/help", method=RequestMethod.GET)
	public ModelAndView help()
	{
		System.out.println("this is help url");
		ModelAndView model=new ModelAndView();
		model.addObject("namei","kumar");
		model.addObject("idi",69);
		List<String> friend=new ArrayList<String>();
		friend.add("ake");friend.add("akal");friend.add("oker");
		model.addObject("frie",friend);
		model.setViewName("help");
		return model;
	}
	
}
