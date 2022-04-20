package entityDao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;
public class adressDao {

  public static final   EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");
  Scanner input = new Scanner(System.in);
    public void insetAdress(Scanner input){

        EntityManagerFactory entityManagerFactory = (EntityManagerFactory) ENTITY_MANAGER_FACTORY.createEntityManager();

    }


}
