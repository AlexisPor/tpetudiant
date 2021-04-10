package persistence.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.entities.TEtudiant;
import persistence.util.HibernateUtil;

public class EtudiantImpl 
{
	public TEtudiant findById(int code) 
	{
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		TEtudiant e = s.get(TEtudiant.class, new BigDecimal(code));
		
		s.close();
		
		return e;
		
	}
	
	public void add(TEtudiant e) 
	{
		 Session s = HibernateUtil.getSessionFactory().openSession(); // Ouvrir une session s
	        
		 Transaction tx = s.beginTransaction();// Commencer une transaction
	        
		 s.save(e);
		 tx.commit();// Valider la transaction
		 s.close();// Ferme la session
	}
	
	public List<TEtudiant> findAllEtudiant() {
		
		List<TEtudiant> listeEtudiant = new ArrayList<TEtudiant>();
    	
    	Session s = HibernateUtil.getSessionFactory().openSession();
    	
    	listeEtudiant = s.createQuery("from TEtudiant").list();
    	
    	s.close();
    	
    	return listeEtudiant;
		
	}
	
	public void delete(TEtudiant o) {
		Session s = HibernateUtil.getSessionFactory().openSession();
    	Transaction tx = s.beginTransaction();
    	
    	s.delete(o);// supprimer
    	tx.commit();
    	s.close();
	}
}
