package co.edu.sena.javaformulario.servlets;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.getConnection(
                "jdbc:mysql://aws.connect.psdb.cloud/myapp?sslMode=VERIFY_IDENTITY",
                "13tf2gtar3na1cvmwzuv",
                "pscale_pw_90uxgoTSPQyXqjCnfCgB5hN3K8JPWk0bG7p0rOw6k7w");
    }
}