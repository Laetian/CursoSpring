package spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	@RequestMapping("/processForm2")
	public String anotherProcessForm(HttpServletRequest request, Model model) {
		
		String name=request.getParameter("namePupil");
		name+=" is the best pupil";
		
		String finalMessage="Who is the best pupil? "+ name;
		
		//agregando info al modelo
		
		model.addAttribute("finalMessage", finalMessage);
		
		return "HiPupilSpring";
	}
}
