
package Ctrl;

import DTO.InterfazDto;
import FACADE.InterfazFacade;
import GUI.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
        }
    }
    
}
