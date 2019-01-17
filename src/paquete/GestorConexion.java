package paquete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Gonzalo Izuzquiza
 */
public class GestorConexion {

    Connection conn1;

    public GestorConexion() {

        conn1 = null;

        try {
            String url1 = "jdbc:mysql://localhost:3306/disco?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String password = "root";
            conn1 = DriverManager.getConnection(url1, user, password);

            if (conn1 != null) {
                System.out.println("Conectado a disco…");
            }

        } catch (SQLException ex) {
            System.out.println("ERROR: dirección o usuario/clave no válida");
            ex.printStackTrace();
        }
    }

    public void annadir() {
        try {

            Statement sta = conn1.createStatement();
            sta.executeUpdate("ALTER TABLE album ADD...tipo");
            sta.close();
            System.out.println("Añadido correctamente");

        } catch (Exception ex) {
            System.out.println("ERROR:al añadir");
            ex.printStackTrace();
        }
    }

    public void insertar() {
        try {

            Statement sta = conn1.createStatement();
            sta.executeUpdate("INSERT INTO album VALUES (2,'Greatest Hits','Queen')");
            sta.close();
            System.out.println("Insertado correctamente");

        } catch (SQLException ex) {
            System.out.println("ERROR:al insertar");
            ex.printStackTrace();
        }
    }

    public void eliminar() {
        try {
            Statement sta = conn1.createStatement();
            sta.executeUpdate("DROP TABLE album");
            sta.close();
            System.out.println("Eliminado correctamente");
            
        } catch (Exception ex) {
            System.out.println("ERROR:al eliminar");
            ex.printStackTrace();
        }
    }

    public void cerrar_conexion() {
        try {
            conn1.close();
            System.out.println("Conexion cerrada");

        } catch (SQLException ex) {
            System.err.println("Error al cerrar conexion");
            ex.printStackTrace();
        }
    }

}
