package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import Model.Airport;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Airport airport = new Airport("jhgjg Name", "Departure City", "Arrival City", "Country");
        entityManager.persist(airport);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Record Saved Successfully!");
    }
}
