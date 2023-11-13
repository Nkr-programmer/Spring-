package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import springmvcSearch.modal.Student;

@Controller
public class Complex_FormController {

	@RequestMapping("/complex")
	public String complex_form()
	{
		return "complex_form";	
	}
	
	@RequestMapping(path="/handle", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute(value="student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex_form";
		}
		System.out.println(student);
		return "success";
	}
	
}
