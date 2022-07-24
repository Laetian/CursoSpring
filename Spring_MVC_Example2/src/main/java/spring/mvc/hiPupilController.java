package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hiPupilController {

	@RequestMapping("/showForm")
	public String showForm() {
		
		//proporciona el formulario
		
		return "HiPupilForm";
	}
	
	@RequestMapping("processForm")
	public String proccesForm() {
		
		return "HiPupilSpring";
		
	}
}
