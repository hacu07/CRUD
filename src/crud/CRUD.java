
package crud;
import Conexion.Conexion;
import Ctrl.InterfazCtrl;
import DAO.InterfazDao;
import DTO.InterfazDto;
import FACADE.InterfazFacade;
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
        
        //dto
        InterfazDto dto =  new InterfazDto();
        //dao
        InterfazDao dao =  new InterfazDao();
        //facade
        InterfazFacade fd =  new InterfazFacade();
        //Vista
        Interfaz interfaz = new Interfaz();
        //Controlador
        InterfazCtrl ctrl = new InterfazCtrl(interfaz,fd);
        //FijarEscuchas
        interfaz.fijarEscuchas(ctrl);
        
        ctrl.consultarNombresCriaderos();
        interfaz.setVisible(true); //Muestra la ventana
        
    }
    
}
