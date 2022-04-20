
import java.util.Scanner;
import dao.AddressDao;
import dao.ArenaDao;
import dao.ConcertDao;
import dao.CustomerDao;
import wc.Concert;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AddressDao addressDao = new AddressDao();
       //  addressDao.insertAddress(input);
        //addressDao.editAddress(input);
        // addressDao.deleteAddress(input);
      //  System.out.println(addressDao.getAddress(input));
        // addressDao.printAllAddresses(addressDao.getAllAddresses());

        ArenaDao arenaDao = new ArenaDao();
     //   arenaDao.insertArena(input);
      //  arenaDao.editArena(input);

        CustomerDao customerDao = new CustomerDao();
     //   customerDao.insertCustomer(input);

        ConcertDao concertDao = new ConcertDao();
        //concertDao.insertConcert(input);
      //  concertDao.addCustomerToConcert(input);

        concertDao.addCustomerToConcert(input);
    }
}
