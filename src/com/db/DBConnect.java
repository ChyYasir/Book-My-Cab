/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.db;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author MINHAJ
 */
public class DBConnect {
    private static Connection conn;
    public static Connection getConn()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://3306/car rent","root","5156");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
