package entityDao;

import wc.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataEntity {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");


    public void insertAdress() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            Address address = new Address();


        }catch (Exception e ){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
      finally {
            entityManager.close();
        }
    }
}