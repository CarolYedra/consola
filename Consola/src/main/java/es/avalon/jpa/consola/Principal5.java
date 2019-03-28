package es.avalon.jpa.consola;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.avalon.jpa.negocio.Capitulo;
import es.avalon.jpa.negocio.Libro;

public class Principal5 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadLibros");

		EntityManager em = emf.createEntityManager(); 
		
		Libro libroJava=em.find(Libro.class, "java");
		
		for (Capitulo c:libroJava.getCapitulos()) {
			System.out.println(c.getTitulo());
			System.out.println(c.getPaginas());
		}

		
	}

}
