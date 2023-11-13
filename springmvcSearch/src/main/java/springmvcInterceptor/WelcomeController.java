package springmvcInterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class WelcomeController {

	@RequestMapping("/office")
	public String office()
	{
		System.out.println("office");
		return "office";	
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("username") String username,Model m){
		System.out.println("welcome");
		m.addAttribute("username", username);
		return "welcome";
	}
	
	
}
