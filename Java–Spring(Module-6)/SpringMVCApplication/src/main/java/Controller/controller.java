package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class controller {
	@GetMapping("/")
	public ModelAndView index(Model model)
	{
		ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("message", "Hello, Welcome to Spring MVC!");
		
		return mav;
		
	}
}
