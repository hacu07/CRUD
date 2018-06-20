
package DAO;

import Conexion.Conexion;
import DTO.InterfazDto;
import java.sql.ResultSet;
import java.sql.SQLException;

/*Comentario de prueba para colaboración en proyecto GitHub*/

public class InterfazDao {
    
    //Consulta en la BD nombreMascota, nombreCriadero, nombrePropietario
    public InterfazDto consultar(InterfazDto objetoInterfaz){
        ResultSet rs = Conexion.ejecutarConsulta(objetoInterfaz.consultar());
        InterfazDto per = null;
        try{    
            while(rs.next()){
                per= new InterfazDto(rs.getString(1),rs.getString(2),rs.getString(3));//Envia el nombre de la mascota al constructor que solo recibe el string del nombreMascota
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return per;
    }
    
    public InterfazDto consultarNombresCriaderos(InterfazDto objetoInterfaz){
        ResultSet rs = Conexion.ejecutarConsulta(objetoInterfaz.consultarNombresCriaderos());
        InterfazDto per = null;
        try{    
            while(rs.next()){
                per = new InterfazDto(rs.getString("nombreCriadero"),1);//Envia el nombre de la mascota al constructor que solo recibe el string del nombreMascota
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return per;
    }
    
    //Elimina la mascota
    public Boolean eliminar(InterfazDto objetoInterfaz){
        return Conexion.ejecutarActualizacion(objetoInterfaz.eliminar()) == 1;
    }
    
    //Actualiza el nombre del propietario de la mascota
    public Boolean actualizar(InterfazDto objetoInterfaz){
        return Conexion.ejecutarActualizacion(objetoInterfaz.actualizar()) == 1;
    }
}
