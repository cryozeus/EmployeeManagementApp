package com.licious.app.config;

import com.licious.app.utils.Constants;
import java.sql.*;
import java.sql.DriverManager;

//Database operations
public final class DbUtils {

    //Default Constructor
    public DbUtils() {}

    //volatile because can be available to multiple threads
    private static volatile Connection conn = null;

    //Register the Driver
    static
    {
        String url = Constants.connectionUrl;
        String user = Constants.username;
        String pass = Constants.password;
        try {
            Class.forName(Constants.jdbcDriver);
            conn = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        return conn;
    }


    public static void closeConnection(Connection con) throws SQLException{
        if(conn != null)
            conn.close();
    }

    public static void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }

    public static void closeStatement(Statement stmt) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
    }
    /*
    public static void commitAndCloseConnection(Connection conn) throws SQLException {
        if (conn != null) {
            try {
                conn.commit();
            } finally {
                conn.close();
            }
        }
    }
    */


    public static void rollbackConnection(Connection conn) throws SQLException {
        if (conn != null) {
            conn.rollback();
        }
    }

    public static void rollbackAndCloseConnection(Connection conn) throws SQLException {
        if (conn != null) {
            try {
                conn.rollback();
            } finally {
                conn.close();
            }
        }
    }







}
