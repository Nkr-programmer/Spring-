package springmvcSearch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathVariableAnnotationAndExceptionHandling {

	@RequestMapping("/book/{id}")
	public String ids(@PathVariable("id") int id)
	{
		System.out.println(id);
		String x=null;
		System.out.println(x.length());
		return "home";	
	}
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
//	public String exception()
//	{
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exception1()
//	{
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.NOT_FOUND)
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exception2()
//	{
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.PRECONDITION_FAILED)
//	@ExceptionHandler(value=Exception.class)
//	public String exception3()
//	{
//		return "null_page";
//	}
}
