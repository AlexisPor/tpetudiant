package servlettpetudiant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabeans.EtudiantJavaBean;

/**
 * Servlet implementation class ServletEtudiant
 */
@WebServlet("/ServletEtudiant")
public class ServletEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEtudiant() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codeEtudiant = Integer.parseInt(request.getParameter("code"));
		EtudiantJavaBean eBean = new EtudiantJavaBean();
		eBean.setCode(codeEtudiant);
		request.setAttribute("nom",eBean.getNom());
		if(eBean.aReussi()) 
		{
			request.getRequestDispatcher("/admis.jsp").forward(request, response);
		}
		else 
		{
			request.getRequestDispatcher("/refuse.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
