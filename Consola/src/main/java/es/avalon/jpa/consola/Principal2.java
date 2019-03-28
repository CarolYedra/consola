package es.avalon.jpa.consola;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.avalon.jpa.negocio.Libro;

public class Principal2 {

	public static void main(String[] args) {

				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadLibros"); 
		
		EntityManager em = emf.createEntityManager();
		Libro l2 = em.find(Libro.class, "Java JPA");
		l2.setPagina(500);
		
		try {
			em.getTransaction().begin();
			em.remove(l2); //merge actualiza // persist añade //remove borrar
			em.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();

		}
		
	}
	

}