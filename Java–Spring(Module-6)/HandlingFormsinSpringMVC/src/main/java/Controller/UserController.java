package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.UserDetails;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@GetMapping("/")
	public String ShowForm(Model model)
	
	{
		model.addAttribute("user",new UserDetails());
		return "register";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submitForm(@Valid @ModelAttribute("user") UserDetails user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";  // Return the form page with validation errors
        }
        return "success";  // Redirect to success page if valid
    }
}
