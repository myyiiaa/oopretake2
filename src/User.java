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
    public enum SubscriptionType {
        ORDINARY,
        PREMIUM
    }
    private SubscriptionType subscriptionType; // Add this field to store the subscription type.

    // Modify the constructor to include the subscription type.
    public User(String name, int age, double balance, SubscriptionType subscriptionType) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.orderHistory = new ArrayList<>();
        this.subscriptionType = subscriptionType;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public double getDiscountedPrice(double price) {
        if (subscriptionType == SubscriptionType.PREMIUM) {
            return price * 0.8; // 20% discount for Premium users
        }
        return price;
    }


}
