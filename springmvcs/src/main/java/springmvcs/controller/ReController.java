package springmvcs.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one()
	{
		System.out.println("runnung one method");
		return "redirect:/two";
	}
	@RequestMapping("/two")
	public RedirectView two()
	{
		System.out.println("running two method");
		RedirectView redirect=new RedirectView();
		redirect.setUrl("contact");
		return redirect;
	}
	@RequestMapping("/three")
	public void three(HttpServletResponse response) throws IOException
	{
		System.out.println("running three method");
		response.sendRedirect("two");
	}
}
