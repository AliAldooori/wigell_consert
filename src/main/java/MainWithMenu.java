import dao.AddressDao;
import dao.ArenaDao;
import dao.ConcertDao;
import dao.CustomerDao;

import java.util.Scanner;

public class MainWithMenu {

    public static void main(String[] args) {

        PrintOut print = new PrintOut();

        AddressDao addressDao = new AddressDao();
        ArenaDao arenaDao = new ArenaDao();
        ConcertDao concertDao = new ConcertDao();
        CustomerDao customerDao = new CustomerDao();

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        int choice;

        while (isRunning){

            print.showMainMenu();
            choice = input.nextInt();

            switch (choice){
                case 1 -> {
                    print.showAddressMenu();
                    choice = input.nextInt();
                    switch (choice){
                        case 1-> addressDao.insertAddress(input);
                        case 2-> addressDao.editAddress(input);
                        case 3-> addressDao.deleteAddress(input);
                        case 4-> System.out.println(addressDao.getAddress(input));
                        case 5-> addressDao.printAllAddresses();
                        case 6 -> {break;}
                        default -> System.out.println("Soory choose froom 1-6 ");
                    }
                }
                case 2 -> {
                    print.showArenaMenu();
                    choice = input.nextInt();
                    switch (choice){
                        case 1 -> arenaDao.insertArena(input);
                        case 2 -> arenaDao.editArena(input);
                        case 3 -> arenaDao.deleteArena(input);
                        case 4 -> System.out.println(arenaDao.getArena(input));
                        case 5 -> arenaDao.printAllArenas();
                        case 6 -> {break;}
                        default-> System.out.println("Soory choose froom 1-6 ");
                    }
                }
                case 3 -> {
                    print.showConcertMenu();
                    choice = input.nextInt();
                    switch (choice){
                        case 1-> concertDao.insertConcert(input);
                        case 2-> concertDao.editConcert(input);
                        case 3-> concertDao.deleteConcert(input);
                        case 4-> System.out.println(concertDao.getConcert(input));
                        case 5-> concertDao.printAllConcerts();
                        case 6-> concertDao.addCustomerToConcert(input);
                        case 7-> {break;}
                        default -> System.out.println("Soory choose froom 1-7 ");
                    }
                }
                case 4 -> {
                    print.showCustomerMenu();
                    choice = input.nextInt();
                    switch (choice){
                        case 1-> customerDao.insertCustomer(input);
                        case 2-> customerDao.editCustomer(input);
                        case 3-> customerDao.deleteCustomer(input);
                        case 4-> System.out.println(customerDao.getCustomer(input));
                        case 5-> customerDao.printAllCustomer();
                        case 6-> {break;}
                        default-> System.out.println("Soory choose froom 1-6 ");
                    }
                }
                case 5 -> isRunning = false;
            }
        }

        input.close();
    }
}
