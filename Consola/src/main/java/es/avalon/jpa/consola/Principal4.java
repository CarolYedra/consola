package es.avalon.jpa.consola;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.avalon.jpa.negocio.Libro;

public class Principal4 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadLibros");

		EntityManager em = emf.createEntityManager(); 
		
		Libro l2=em.find(Libro.class, "java");
		System.out.println(l2.getTitulo());
		System.out.println(l2.getAutor());
		System.out.println(l2.getPagina());
		
		l2.setPagina(800);
		em.getTransaction().begin();
		em.merge(l2);
		em.getTransaction().commit();

	}

}
