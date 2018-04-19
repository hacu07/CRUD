package GUI;


import Ctrl.InterfazCtrl;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Interfaz extends JFrame  {
    
    //Componentes de la vista
    private JLabel lblNomMascota,lblNomDueño,lblNomCriadero; //Etiquetas
    private JTextField txtNomMascota, txtNomDueño, txtNomCriadero; //Cajas de texto - input
    private JButton btnBuscar, btnRegistrar, btnActualizar, btnEliminar; //Botones
    private JComboBox comboCriadero;
    //private ArrayList<String> nombresCriaderos = new ArrayList();//Lista que contiene los nombres de los criaderos
    
    
    public Interfaz(){
        inicializar();              //Instancia los objetos
        setTitle("MASCOTAS ADSI");
        setSize(400,200);           //Tamaño de la ventana
        setLocationRelativeTo(null);//Aparece en la mitad de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para cerrar dando clic en la 'X'
        getContentPane().add(panelPrincipal()); //Agregamos el PanelPrincipal a la ventana
    }
    
    public void fijarEscuchas(InterfazCtrl c){
        btnBuscar.addActionListener(c);
        btnActualizar.addActionListener(c);
        btnEliminar.addActionListener(c);
        btnRegistrar.addActionListener(c);
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
        
        //ComboBox
        comboCriadero = new JComboBox();
        
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
        pPrincipal.setLayout(new GridLayout(3,2));//3 filas, 2 columnas
        pPrincipal.add(lblNomMascota);  pPrincipal.add(txtNomMascota);
        pPrincipal.add(lblNomDueño);  pPrincipal.add(txtNomDueño);
        pPrincipal.add(lblNomCriadero);  pPrincipal.add(comboCriadero);
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

    public JTextField getTxtNomMascota() {
        return txtNomMascota;
    }

    public void setTxtNomMascota(JTextField txtNomMascota) {
        this.txtNomMascota = txtNomMascota;
    }

    public JTextField getTxtNomDueño() {
        return txtNomDueño;
    }

    public void setTxtNomDueño(JTextField txtNomDueño) {
        this.txtNomDueño = txtNomDueño;
    }

    public JTextField getTxtNomCriadero() {
        return txtNomCriadero;
    }

    public void setTxtNomCriadero(JTextField txtNomCriadero) {
        this.txtNomCriadero = txtNomCriadero;
    }

    public JComboBox getComboCriadero() {
        return comboCriadero;
    }

    public void setComboCriadero(JComboBox comboCriadero) {
        this.comboCriadero = comboCriadero;
    }
    
    

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }
    
    
    
}
