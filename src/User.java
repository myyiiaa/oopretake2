import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private double balance;
    private ArrayList<Ticket> orderHistory;

    public User(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Ticket> getOrderHistory() {
        return orderHistory;
    }

    public void addTicket(Ticket ticket) {
        orderHistory.add(ticket);
    }
}
