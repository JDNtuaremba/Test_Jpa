package dev.excutable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dev.bibliotheque.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		TypedQuery<Livre> query = em.createQuery("select l from Livre l where l.Auteur='Léon Tolstoï'", Livre.class);
		
		Livre l = query.getResultList().get(0);
		 System.out.println(l.toString());
		
		em.close();

	}

}
