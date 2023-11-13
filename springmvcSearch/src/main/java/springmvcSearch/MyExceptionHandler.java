package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String exception()
	{
		System.out.println("done");
		return "null_page";
	}
	
//	@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exception1()
//	{
//		return "null_page";
//	}
	
//	@ResponseStatus(value=HttpStatus.NOT_FOUND)
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exception2()
//	{
//		return "null_page";
//	}
	
	@ResponseStatus(value=HttpStatus.PRECONDITION_FAILED)
	@ExceptionHandler(value=Exception.class)
	public String exception3()
	{
		return "null_page";
	}
}
