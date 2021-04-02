package servlettpetudiant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabeans.EtudiantJavaBean;
import persistence.dao.EtudiantImpl;
import persistence.entities.TEtudiant;

/**
 * Servlet implementation class AfficherListeEtudiant
 */
@WebServlet("/AfficherListeEtudiant")
public class AfficherListeEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherListeEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EtudiantImpl eImpl = new EtudiantImpl();
		List<TEtudiant>listE = new ArrayList<TEtudiant>();
		List<EtudiantJavaBean> listEJB = new ArrayList<EtudiantJavaBean>();
		listE = eImpl.findAllEtudiant();
		for (TEtudiant tEtudiant : listE) {
			EtudiantJavaBean eBean = new EtudiantJavaBean();
			eBean.setCode(tEtudiant.getECode().intValue());
			eBean.getNom();
			eBean.getMoyenne();
			listEJB.add(eBean);
		}
		
		
		
		request.setAttribute("liste", listEJB);
		
		request.getRequestDispatcher("/listeEtudiant.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
