package springmvcSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm()
	{
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m)
	{
		System.out.println("fILE UPLOADED");
		System.out.println(file.getSize()+" "+file.getContentType()+" "+
		file.getName()+" "+file.getOriginalFilename()+" "+file.getStorageDescription());
		byte[] data=file.getBytes();
		//If doubt is there why we dont include src/main/webapp in path because in 
		//the copy of original which is deployed one that have image stored that have
		//structure like this /springmvcSearch/WEB-INF/resources/image/
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("successfull");
			m.addAttribute("msg","upload successfull");
			m.addAttribute("filename",file.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("failed");
			m.addAttribute("msg","upload failed");
		}
		
		return "fileSuccess";
	}
	
}
