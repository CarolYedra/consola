package es.avalon.jpa.consola;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.avalon.jpa.negocio.Capitulo;

public class Principal3 {

	public static void main(String[] args) {

				
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadLibros"); 
	
	EntityManager em = emf.createEntityManager();
	Capitulo c1 = em.find(Capitulo.class, "Cap.1 Java");
	c1.setPaginas(10);
	
	try {
		em.getTransaction().begin();
		em.persist(c1); //merge actualiza // persist añade //remove borrar
		em.getTransaction().commit();
	} catch (Exception e) {

		e.printStackTrace();
	} finally {
		em.close();

}}}