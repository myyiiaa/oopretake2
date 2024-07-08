import java.util.ArrayList;

public class CinemaSystem {
    private ArrayList<User> users;
    private ArrayList<Movie> movies;
    private ArrayList<Ticket> tickets;
    private int ticketIdCounter = 1;

    public CinemaSystem() {
        users = new ArrayList<>();
        movies = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void showAllMovies() {
        for (Movie movie : movies) {
            System.out.println("Name: " + movie.getMovieName() + ", Genre: " + movie.getMovieGenre() + ", Age Restriction: " + movie.getAgeRestriction());
        }
    }

    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public void buyTicket(String userName, int movieId, String date, String time) {
        User user = findUser(userName);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        Movie movie = movies.get(movieId);
        if (user.getAge() < movie.getAgeRestriction()) {
            System.out.println("User is too young for this movie.");
            return;
        }

        double price = 10.0; // Example price
        if (user.getBalance() < price) {
            System.out.println("Insufficient balance.");
            return;
        }

        user.setBalance(user.getBalance() - price);
        Ticket ticket = new Ticket(ticketIdCounter++, movie.getMovieName(), date, time, price);
        user.addTicket(ticket);
        addTicket(ticket);
        System.out.println("Ticket purchased successfully.");
    }

    public void cancelTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId) {
                tickets.remove(ticket);
                System.out.println("Ticket cancelled successfully.");
                return;
            }
        }
        System.out.println("Ticket not found.");
    }
}
