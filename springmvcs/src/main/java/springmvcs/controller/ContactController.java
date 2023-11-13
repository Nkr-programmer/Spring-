package springmvcs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcs.controller.model.User;
import springmvcs.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonData(Model model)
	{
		model.addAttribute("Header","Learing arangement");
		model.addAttribute("desc","Good Luck with that");
		System.out.println("common data");
	}
	
	
	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("now its contact view file");
		return "contact";
	}
	
//	@RequestMapping(path="/processForm",method=RequestMethod.POST)
//	public String processForm(HttpServletRequest request,Model model)
//	{
//		String email=request.getParameter("email");
//		String userName=request.getParameter("name");
//		String pass=request.getParameter("password");
//		System.out.println("emailS "+email+" name "+userName+" password "+pass);
//		
//		//processing here we do stuff like transfering the data back to view or store in db
//		model.addAttribute("email",email);
//		model.addAttribute("user",userName);
//		model.addAttribute("password",pass);
//		return "success";
//	}

	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String processForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user.toString());
		//processing here we do stuff like transfering the data back to view or store in db
		this.userService.createUser(user);
		return "success";
	}	
	
	
//	@RequestMapping(path="/processForm",method=RequestMethod.POST)
//	public String processForm(@RequestParam(name="email", required=true) String email,
//							  @RequestParam("name") String userName,
//							  @RequestParam("password") String pass,Model model)
//	{
//		User user =new User();
//		user.setEmail(email);
//		user.setName(userName);
//		user.setPassword(pass);
//		System.out.println(user.toString());
//		
//		//processing here we do stuff like transfering the data back to view or store in db
////		model.addAttribute("email",email);
////		model.addAttribute("user",userName);
////		model.addAttribute("password",pass); //Alternative of addAllAttribute
//		model.addAttribute("user",user);
//		return "success";
//	}
	
	
}
