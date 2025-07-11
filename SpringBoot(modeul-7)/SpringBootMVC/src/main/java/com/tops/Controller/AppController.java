package com.tops.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tops.Model.ProductDetails;
import com.tops.Model.UserDetails;
import com.tops.Services.ProductServices;
import com.tops.Services.UserServices;

@Controller
@ComponentScan(basePackages = "com.tops.Services")

public class AppController {
	
	  @Autowired 
	  private ProductServices productServices;
	  @Autowired
	  private UserServices userServices;
	  
	  
 @GetMapping("/")
 	public String index()
 	{
 		return "index";
 	}
 @GetMapping("/addproduct")
	public String ShowProductPage(Model model)
	{
	 	model.addAttribute("product",new ProductDetails() );
		return "AddProduct";
	}
 
 @PostMapping("/AddProduct")
 public String Save(@ModelAttribute ProductDetails productDetails,Model model)
 {
	productServices.save(productDetails);
	  List<ProductDetails> list=productServices.getAllProduct();
	  model.addAttribute("list",list);
	return "ListProduct";
 }
	

 	@GetMapping("/ListProduct") 
 	public String ListProductdetails(Model model) 
 	{
	  List<ProductDetails> list=productServices.getAllProduct();
	  model.addAttribute("list",list);
	   return "ListProduct"; 
	  }
 	@GetMapping("/Editproduct/{id}")
 	public ModelAndView updateProduct(@PathVariable("id") int id)
 	{
 		Optional<ProductDetails> optional= productServices.getbyidProduct(id);
 		ModelAndView mav=new ModelAndView();
 		mav.addObject("product", optional);
 		mav.setViewName("UpdateProduct");
 		return mav;
 	}
	 @GetMapping("/DeleteProduct/{id}")
	 public String DeleteProduct(@PathVariable("id") int id,Model model)
	 {
		 productServices.delete(id);
		 List<ProductDetails> list=productServices.getAllProduct();
		  model.addAttribute("list",list);
		 return "ListProduct"; 
	 }
	 
	 @GetMapping("/showuser")
	 public String RegistrationUser(Model model)
	  {
		 model.addAttribute("user", new UserDetails());
		 return "RegistrationUser";
	 }
	 
	 @PostMapping("/addUser")
	 public String save(@ModelAttribute UserDetails userDetails,Model model)
	 {
		userServices.Save(userDetails);
		 List<UserDetails> list=userServices.getAllUserDetails();
		 model.addAttribute("list", list);
		
		return "ListUser";
	 }
	 
	 @GetMapping("/ListUser")
	 public String getAllUser(Model model)
	 {
		 List<UserDetails> list=userServices.getAllUserDetails();
		 model.addAttribute("list", list);
		 return "ListUser";
	 }
}
