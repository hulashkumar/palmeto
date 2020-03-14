

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Runnable1
 */
@WebServlet("/Runnable1")
public class Runnable1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Runnable1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public interface Mathematics{
    	public int add(int a,int b);
    	
    }
   
    
    //Thread t=new Thread(m);
    //t.start();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 {
			 Mathematics m=(a,b)-> a+b;
		 
	    	//int  sum=m.add(10,20);
	    	System.out.println(m.add(10,20));
		 }
		 }	
		/*Runnable r=()->{
			for(int i=1;i<=10;i++)
				System.out.println(i);
			};
			Thread t=new Thread(r);
			t.start();
		}*/
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
