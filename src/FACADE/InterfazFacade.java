
package FACADE;

import DAO.InterfazDao;
import DTO.InterfazDto;

public class InterfazFacade {
    
    public InterfazDto consultar(String nombreMascota){
        InterfazDto dto = new InterfazDto(nombreMascota);
        InterfazDao dao = new InterfazDao();
        return dao.consultar(dto);
    }
    
    public boolean eliminar(String nombreMascota){
        InterfazDto dto = new InterfazDto(nombreMascota);
        InterfazDao dao = new InterfazDao();
        return dao.eliminar(dto);
    }
    
    public boolean actualizar(String nombreMascota){
        InterfazDto dto = new InterfazDto(nombreMascota);
        InterfazDao dao = new InterfazDao();
        return dao.actualizar(dto);
    }
}
