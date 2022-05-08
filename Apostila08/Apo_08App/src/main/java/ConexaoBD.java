/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bohrs
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306"; 
    private static String db = "db_apo08"; 
    private static String usuario = "root"; 
    private static String senha = "root";
    
    public static Connection obterConexao () throws Exception{
    String url = String.format(
    "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
            host,
            porta,
            db
        );
    return DriverManager.getConnection(url, usuario, senha);
    }    
    
}
