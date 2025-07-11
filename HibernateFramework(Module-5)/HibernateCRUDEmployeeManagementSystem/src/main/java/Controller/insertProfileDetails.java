package Controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Dao.EmployeeDetailsDao;
import Dao.ProfileDetailsDao;
import Pojo.EmployeeDetails;
import Pojo.ProfileDetails;

/**
 * Servlet implementation class insertProfileDetails
 */


@WebServlet("/EmployeeManagementSystem/insertProfileDetails")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024 * 512)

public class insertProfileDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public insertProfileDetails() {
        super();
        
    }
    private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String savePath = "E:\\javaEEIDE\\HibernateCRUDEmployeeManagementSystem\\src\\main\\webapp\\images";   
			File fileSaveDir=new File(savePath);
	        if(!fileSaveDir.exists()){
	            fileSaveDir.mkdir();
	        }
	        Part file1 = request.getPart("image");
		 	String fileName=extractfilename(file1);
		    file1.write(savePath + File.separator + fileName);
		    String filePath= savePath + File.separator + fileName ;
		    
		    String savePath2 = "E:\\javaEEIDE\\HibernateCRUDEmployeeManagementSystem\\src\\main\\webapp\\images";
	        File imgSaveDir=new File(savePath2);
	        if(!imgSaveDir.exists()){
	            imgSaveDir.mkdir();
	        }
	        int eid=Integer.parseInt(request.getParameter("ename"));
	        EmployeeDetails eobj=EmployeeDetailsDao.getbyIdEmployeeDetails(eid);
	        
	        ProfileDetails p = new ProfileDetails();
	        p.setPhoto(fileName);
	        p.setEmployeeDetails(eobj);
		       
	       ProfileDetailsDao.insertProfileDetails(p);
	        
	        
	        response.sendRedirect("ListProfileDetails.jsp");
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
