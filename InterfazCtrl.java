
package Ctrl;

import DTO.InterfazDto;
import FACADE.InterfazFacade;
import GUI.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
public class InterfazCtrl implements ActionListener {
    //propiedades - Atributos - variables
    private Interfaz objetoInterfaz;
    private InterfazFacade objetoFacade;
    
    //Contructor 
    //recibe como parametros un elemento de clase Interfaz y otro de clase InterfazFacade
    public InterfazCtrl(Interfaz gui, InterfazFacade facade){
        //asignamos a las variables globales los valores recibidos como parametross
        this.objetoFacade = facade;
        this.objetoInterfaz = gui;
    }
    
    //Consulta los nombres de los criaderos de la BD y los muestra en un combobox para el usuario
    public void consultarNombresCriaderos(){
        objetoFacade.consultarNombresCriaderos();
        InterfazDto dto = new InterfazDto();
        for(int i = 0; i<dto.getNombresCriaderos().size(); i++){
            objetoInterfaz.getComboCriadero().addItem(dto.getNombresCriaderos().get(i));
        }
    }
    
    //Acciones que se ejecutan al dar clic en cada boton
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Miramos que boton fue el presionado 'clic'
        
        if(ae.getSource()==objetoInterfaz.getBtnBuscar()){ //Si dio clic en el boton buscar
            try{//ejecuta
                
                InterfazDto dto = objetoFacade.consultar(String.valueOf(objetoInterfaz.getTxtNomMascota().getText()));
                objetoInterfaz.getTxtNomDueño().setText(dto.getPropietario());
                objetoInterfaz.getTxtNomCriadero().setText(dto.getNombreCriadero());
            }catch(Exception e){//Si algo falla en la ejecucion del 'try'
                //Muestra mensaje en caso de error
                JOptionPane.showMessageDialog(null,"Ha ocurrio un error","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }else if(ae.getSource()==objetoInterfaz.getBtnActualizar()){
            try{
                objetoFacade.actualizar(String.valueOf(objetoInterfaz.getTxtNomMascota().getText()),
                                        String.valueOf(objetoInterfaz.getTxtNomCriadero().getText()),
                                        String.valueOf(objetoInterfaz.getTxtNomDueño().getText()));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrio un error","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else if(ae.getSource()==objetoInterfaz.getBtnEliminar()){
            try{
                objetoFacade.eliminar(String.valueOf(objetoInterfaz.getTxtNomMascota().getText()));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrio un error","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
