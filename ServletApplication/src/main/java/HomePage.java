import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class HomePage extends GenericServlet{
		public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
			PrintWriter pw=res.getWriter();
			
		}
}
