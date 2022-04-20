import dao.AddressDao;
import dao.ArenaDao;
import dao.ConcertDao;
import dao.CustomerDao;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintOut print = new PrintOut();
        print.showMainMenu();
        int choice = input.nextInt();

        boolean exit = false;

        while (!exit) {
            switch (choice) {
                case 1 ->{
                    AddressDao addressDao = new AddressDao();
                    print.showAddressMenu();
                    input.nextLine();
                    int addressFunctions = input.nextInt();
                    switch (addressFunctions) {
                        case 1-> addressDao.insertAddress(input);
                        case 2-> addressDao.editAddress(input);
                        case 3-> addressDao.deleteAddress(input);
                        case 4-> System.out.println(addressDao.getAddress(input));
                        case 5-> addressDao.printAllAddresses();
                        case 6-> print.showMainMenu();
                        default-> System.out.println("Soory choose froom 1-6 ");
                    }
                }

                case 2 ->{
                    ArenaDao arenaDao = new ArenaDao();
                   print.showArenaMenu();
                    int ArenaFunctions = input.nextInt();
                    switch (ArenaFunctions){
                        case 1 -> arenaDao.insertArena(input);
                        case 2 -> arenaDao.editArena(input);
                        case 3 -> arenaDao.deleteArena(input);
                        case 4 -> System.out.println(arenaDao.getArena(input));
                        case 5 -> arenaDao.printAllArenas();
                        case 6 -> {break;}
                        default-> System.out.println("Soory choose froom 1-6 ");
                    }
                    }
                case 3->{
                    ConcertDao concertDao = new ConcertDao();
                    print.showConcertMenu();
                    int ConcertFunction = input.nextInt();
                    switch (ConcertFunction){
                        case 1-> concertDao.insertConcert(input);
                        case 2-> concertDao.editConcert(input);
                        case 3-> concertDao.deleteConcert(input);
                        case 4-> System.out.println(concertDao.getConcert(input));
                        case 5-> concertDao.printAllConcerts();
                        case 6-> concertDao.addCustomerToConcert(input);
                        case 7-> {break;}
                        default-> System.out.println("Soory choose froom 1-7 ");

                    }
                    }

                case 4 ->{
                    CustomerDao customerDao = new CustomerDao();
                    print.showCustomerMenu();
                    int CustomerFunction = input.nextInt();
                    switch (CustomerFunction){
                        case 1-> customerDao.insertCustomer(input);
                        case 2-> customerDao.editCustomer(input);
                        case 3-> customerDao.deleteCustomer(input);
                        case 4-> System.out.println(customerDao.getCustomer(input));
                        case 5-> customerDao.printAllCustomer();
                        case 6-> {break;}
                        default-> System.out.println("Soory choose froom 1-6 ");

                    }
                    }
                    case 5 -> {
                        exit = true;
                    }
            }
        }

    }

}
