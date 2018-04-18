package GUI;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Interfaz extends JFrame  {
    
    //Componentes de la vista
    private JLabel lblNomMascota,lblNomDueño,lblNomCriadero; //Etiquetas
    private JTextField txtNomMascota, txtNomDueño, txtNomCriadero; //Cajas de texto - input
    private JButton btnBuscar, btnRegistrar, btnActualizar, btnEliminar; //Botones
    
    
    public Interfaz(){
        inicializar();              //Instancia los objetos
        setTitle("MASCOTAS ADSI");
        setSize(400,400);           //Tamaño de la ventana
        setLocationRelativeTo(null);//Aparece en la mitad de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para cerrar dando clic en la 'X'
        getContentPane().add(panelPrincipal()); //Agregamos el PanelPrincipal a la ventana
    }

    //Incializamos los elementos graficos
    private void inicializar() {
        //Etiquetas
        lblNomMascota = new JLabel("Nombre Mascota");
        lblNomDueño = new JLabel("Nombre del Dueño");
        lblNomCriadero = new JLabel("Nombre del Criadero");
        
        //Cajas de Texto - INPUTS
        txtNomMascota = new JTextField(50);
        txtNomDueño = new JTextField(50);
        txtNomCriadero = new JTextField(50);
        
        //Botones
        btnBuscar = new JButton("Buscar");
        btnRegistrar = new JButton("Registrar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        
        //ToolTipText
        btnBuscar.setToolTipText("Clic para buscar Mascota");
    }
    
    public JPanel panelPrincipal(){
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelTrabajoCentro(),BorderLayout.CENTER);
        panelPrincipal.add(panelTrabajoSur(),BorderLayout.SOUTH);
        
        return panelPrincipal;
        
    }
    
    public JPanel panelTrabajoCentro(){
        JPanel pPrincipal = new JPanel();
        pPrincipal.setLayout(new GridLayout(3,2));
        pPrincipal.add(lblNomMascota);  pPrincipal.add(txtNomMascota);
        pPrincipal.add(lblNomDueño);  pPrincipal.add(txtNomDueño);
        pPrincipal.add(lblNomCriadero);  pPrincipal.add(txtNomCriadero);
        return pPrincipal;
    }
    
    public JPanel panelTrabajoSur(){
        JPanel pPrincipal = new JPanel();
        pPrincipal.setLayout(new GridLayout(1,4));
        pPrincipal.add(btnBuscar);
        pPrincipal.add(btnRegistrar);
        pPrincipal.add(btnActualizar);
        pPrincipal.add(btnEliminar);
        return pPrincipal;
    }
    
}
