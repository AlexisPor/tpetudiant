package javabeans;

import persistence.dao.EtudiantImpl;
import persistence.entities.TEtudiant;

public class EtudiantJavaBean 
{
	private int code;
	private String nom;
	private float moyenne;
	
	EtudiantImpl eImpl = new EtudiantImpl();
	TEtudiant etudiant = new TEtudiant();
	
	public int getCode() {
		return this.code;
	}
	public void setCode(int code) {
		this.code = code;
		etudiant=eImpl.findById(code);
		
	}
	
	public String getNom() {
		return etudiant.getENom();
	}
	public void setNom(String nom) {
		this.nom= nom;
	}
	public float getMoyenne() {
		return etudiant.getEMoyenne().floatValue();
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	public boolean aReussi() {
        
		return getMoyenne()>=10 ? true:false;
        
    }
	
}
