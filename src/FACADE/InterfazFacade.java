
package FACADE;

import DAO.InterfazDao;
import DTO.InterfazDto;

public class InterfazFacade {
    
    public InterfazDto consultar(String nombreMascota){
        InterfazDto dto = new InterfazDto(nombreMascota);
        InterfazDao dao = new InterfazDao();
        return dao.consultar(dto);
    }
    
    public InterfazDto consultarNombresCriaderos(){
        InterfazDto dto = new InterfazDto();
        InterfazDao dao = new InterfazDao();
        return dao.consultarNombresCriaderos(dto);
    }
    
    public boolean eliminar(String nombreMascota){
        InterfazDto dto = new InterfazDto(nombreMascota);
        InterfazDao dao = new InterfazDao();
        return dao.eliminar(dto);
    }
    
    public boolean actualizar(String nombreMascota,String nombreCriadero, String propietario){
        InterfazDto dto = new InterfazDto(nombreMascota,nombreCriadero,propietario);
        InterfazDao dao = new InterfazDao();
        return dao.actualizar(dto);
    }
    
    
}
