package com.dao;

//package com.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class DatabaseTest {
//  public static void main(String[] args) {
//      // JDBC connection parameters
//      String jdbcUrl = "jdbc:mysql://localhost:6630/job_portal";
//      String username = "root";
//      String password = "1234";
//
//      Connection connection = null;
//      PreparedStatement statement = null;
//
//      try {
//          // Load the JDBC driver
//          Class.forName("com.mysql.cj.jdbc.Driver");
//
//          // Create a connection
//          connection = DriverManager.getConnection(jdbcUrl, username, password);
//
//          // Prepare the SQL statement
//          String sql = ""
//          		+ "INSERT INTO job_application (name, email, phone, message) VALUES (?, ?, ?, ?)";
//          statement = connection.prepareStatement(sql);
//          statement.setString(1, "John Doe");
//          statement.setString(2, "john.doe@example.com");
//          statement.setString(3, "1234567890");
//          statement.setString(4, "Test message");
//
//          // Execute the SQL statement
//          int rowsAffected = statement.executeUpdate();
//
//          // Check the result
//          if (rowsAffected > 0) {
//              System.out.println("Data inserted successfully.");
//          } else {
//              System.out.println("Data insertion failed.");
//          }
//      } catch (ClassNotFoundException e) {
//          e.printStackTrace();
//      } catch (SQLException e) {
//          e.printStackTrace();
//      } finally {
//          // Close the resources
//          try {
//              if (statement != null) {
//                  statement.close();
//              }
//              if (connection != null) {
//                  connection.close();
//              }
//          } catch (SQLException e) {
//              e.printStackTrace();
//          }
//      }
//  }
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseTest {
  public static void main(String[] args) {
      // JDBC connection parameters
      String jdbcUrl = "jdbc:mysql://localhost:6630/job_portal";
      String username = "root";
      String password = "1234";

      Connection connection = null;
      PreparedStatement statement = null;
      ResultSet resultSet = null;

      try {
          // Load the JDBC driver
          Class.forName("com.mysql.cj.jdbc.Driver");

          // Create a connection
          connection = DriverManager.getConnection(jdbcUrl, username, password);

          // Prepare the SQL statement for data insertion
          String insertSql = "INSERT INTO job_application (name, email, phone, message) VALUES (?, ?, ?, ?)";
          statement = connection.prepareStatement(insertSql);
          statement.setString(1, "Ishwa");
          statement.setString(2, "ishwa@gmail.com");
          statement.setString(3, "1234567890");
          statement.setString(4, "Thank you for considiring my application.");

          // Execute the INSERT statement
          int rowsAffected = statement.executeUpdate();

          if (rowsAffected > 0) {
              System.out.println("Data inserted successfully.");
          } else {
              System.out.println("Data insertion failed.");
          }

          // Prepare the SQL statement for data retrieval
          String selectSql = "SELECT * FROM job_application";
          statement = connection.prepareStatement(selectSql);

          // Execute the SELECT statement
          resultSet = statement.executeQuery();

          // Process the result set
          while (resultSet.next()) {
              String name = resultSet.getString("name");
              String email = resultSet.getString("email");
              String phone = resultSet.getString("phone");
              String message = resultSet.getString("message");

              System.out.println("Name: " + name);
              System.out.println("Email: " + email);
              System.out.println("Phone: " + phone);
              System.out.println("Message: " + message);
              System.out.println();
          }
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          // Close the resources
          try {
              if (resultSet != null) {
                  resultSet.close();
              }
              if (statement != null) {
                  statement.close();
              }
              if (connection != null) {
                  connection.close();
              }
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
  }
}
