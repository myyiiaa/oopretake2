import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CinemaSystem cinemaSystem = new CinemaSystem();

        while (true) {
            System.out.println("Hello, You have the following available functions:");
            System.out.println("1) To add a new movie;");
            System.out.println("2) To show all available movies;");
            System.out.println("3) To add a new user;");
            System.out.println("4) To buy a ticket;");
            System.out.println("5) To cancel a purchase of the ticket.");
            System.out.println("0) To exit.");


            int choice;
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter movie genre: ");
                    String movieGenre = scanner.nextLine();
                    System.out.print("Enter age restriction: ");
                    int ageRestriction = scanner.nextInt();
                    scanner.nextLine();
                    Movie movie = new Movie(movieName, movieGenre, ageRestriction);
                    cinemaSystem.addMovie(movie);
                    break;
                case 2:
                    cinemaSystem.showAllMovies();
                    break;
                case 3:
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter user age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter user balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.println("Choose subscription type:");
                    System.out.println("1) Ordinary");
                    System.out.println("2) Premium");
                    int subscriptionChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    SubscriptionType subscriptionType = (subscriptionChoice == 2) ? SubscriptionType.PREMIUM : SubscriptionType.ORDINARY;

                    User user = new User(userName, age, balance, subscriptionType);
                    cinemaSystem.addUser(user);
                    break;

                case 4:
                    System.out.print("Enter user name: ");
                    String buyerName = scanner.nextLine();
                    System.out.print("Enter movie ID: ");
                    int movieId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter date (dd/mm/yyyy): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter time (hh:mm): ");
                    String time = scanner.nextLine();
                    cinemaSystem.buyTicket(buyerName, movieId, date, time);
                    break;
                case 5:
                    System.out.print("Enter ticket ID to cancel: ");
                    int ticketId = scanner.nextInt();
                    scanner.nextLine();
                    cinemaSystem.cancelTicket(ticketId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again");
            }

        }
    }

}