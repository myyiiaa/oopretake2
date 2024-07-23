CREATE TABLE users (    id SERIAL PRIMARY KEY,
    name VARCHAR(50),    age INT,
    balance DECIMAL(10, 2));
CREATE TABLE movies (
    id SERIAL PRIMARY KEY,    movieName VARCHAR(50),
    movieGenre VARCHAR(50),    ageRestriction INT
);
CREATE TABLE tickets (    id SERIAL PRIMARY KEY,
    movieName VARCHAR(50),    date DATE,
    time TIME,    price DECIMAL(10, 2),
    userId INT,    FOREIGN KEY (userId) REFERENCES users(id)
);
//this is part of database code for connection


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/cinema";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0000";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
//this is the part of DatabaseConnection Class code, I couldn't commit this class to src, so I wrote it here 
