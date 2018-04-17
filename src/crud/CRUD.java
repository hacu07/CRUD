
package crud;
import Conexion.Conexion;
import GUI.Interfaz;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CRUD {
    
    //Constructor
    public CRUD() throws SQLException, ClassNotFoundException{
        Conexion.obtener();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CRUD crud = new CRUD();
        Interfaz objetoInterfaz = new Interfaz();
        objetoInterfaz.setVisible(true); //Muestra la ventana
        
    }
    
}
