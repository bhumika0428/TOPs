

import java.io.BufferedOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProfileDetailsDao;
import Pojo.ProfileDetails;

/**
 * Servlet implementation class printphoto
 */
@WebServlet("/jsp/printphoto")
public class printphoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public printphoto() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		  {
			  int id=Integer.parseInt(request.getParameter("id")); 
			  ProfileDetails obj=ProfileDetailsDao.getbyIdProfileDetails(id);
			  ServletOutputStream outputStream = response.getOutputStream();
			  response.setContentType("image/png");
			  response.setHeader("Content-disposition","inline" );
			  response.setHeader("Cache-Control","no-cache");
			  response.setHeader("Pragma","no-cache");
			  BufferedOutputStream bos = new BufferedOutputStream(outputStream);
			  bos.write(obj.getPhoto());
			  bos.close();
		  } 
		  catch (Exception e) 
		  {
			  e.printStackTrace();
		  }}

	
}
