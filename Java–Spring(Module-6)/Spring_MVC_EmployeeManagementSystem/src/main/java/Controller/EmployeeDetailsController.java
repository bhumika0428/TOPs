package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Dao.EmployeesDetailsDao;
import Model.EmployeesDetails;


@Controller
public class EmployeeDetailsController {

	@Autowired
	private EmployeesDetailsDao employeesDetailsDao;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/register")
	public String insertEmployee(@ModelAttribute EmployeesDetails emp,Model m)
	{
		System.out.println(emp);
		employeesDetailsDao.insertEmployeeDetails(emp);
java.util.List<EmployeesDetails> list=employeesDetailsDao.getAllEmployee();
		
		m.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("/list")
	public String List(Model m)
	{
		
		java.util.List<EmployeesDetails> list=employeesDetailsDao.getAllEmployee();
		
		m.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable ("id") int id)
	{
		EmployeesDetails emp=this.employeesDetailsDao.getbyIDEmployee(id);
		ModelAndView m=new ModelAndView();
		m.addObject("emp",emp);
		m.setViewName("update");
		return m;
	}
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable ("id") int id,Model m)
	{
		System.out.println("delete");
		this.employeesDetailsDao.deleteEmployee(id);
java.util.List<EmployeesDetails> list=employeesDetailsDao.getAllEmployee();
		
		m.addAttribute("list", list);
		return "list";
	}
}
