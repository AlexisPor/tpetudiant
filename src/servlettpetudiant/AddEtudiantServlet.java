package servlettpetudiant;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabeans.EtudiantJavaBean;
import persistence.dao.EtudiantImpl;
import persistence.entities.TEtudiant;

/**
 * Servlet implementation class AddEtudiantServlet
 */
@WebServlet("/AddEtudiantServlet")
public class AddEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codeE = Integer.parseInt(request.getParameter("code"));
		String nomE = request.getParameter("nom");
		double moyE = Double.parseDouble(request.getParameter("moyenne"));
		
		EtudiantImpl eImpl = new EtudiantImpl();
		TEtudiant etudiant = new TEtudiant();
		
		etudiant.setECode(new BigDecimal(codeE));
		etudiant.setENom(nomE);
		etudiant.setEMoyenne(moyE);
		
		eImpl.add(etudiant);
		
		request.setAttribute("code",etudiant.getECode());
		request.setAttribute("nom", etudiant.getENom());
		request.getRequestDispatcher("/etudiantajoute.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
