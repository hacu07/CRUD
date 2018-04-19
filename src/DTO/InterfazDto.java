
package DTO;

import java.util.ArrayList;

public class InterfazDto implements IDTO {
    //Propiedades - Atributos - Variables
    private int codMascota,codCriadero;
    private String nombreMascota,propietario,nombreCriadero;
    private ArrayList<String> nombresCriaderos = new ArrayList<String>();
    
    //Contructor
    public InterfazDto(){
        super();
    }
    
    //Constructor que recibe como parametro el nombre de la mascota
    public InterfazDto(String nombreMascota){
        super();
        this.nombreMascota = nombreMascota;
    }
    
    //Contructor que recibe como parametro la lista de los nombres de los criaderos
    public InterfazDto(String nombreCriadero, int num){
        super();
        this.nombresCriaderos.add(nombreCriadero);
    }
    
    //Contructor con parametros
    public InterfazDto( String nombreMascota, String nombreCriadero, String propietario){
        super();
        this.nombreMascota = nombreMascota;
        this.nombreCriadero = nombreCriadero;
        this.propietario = propietario;
    }
    
    
    

    public int getCodMascota() {
        return codMascota;
    }

    public void setCodMascota(int codMascota) {
        this.codMascota = codMascota;
    }

    public int getCodCriadero() {
        return codCriadero;
    }

    public void setCodCriadero(int codCriadero) {
        this.codCriadero = codCriadero;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNombreCriadero() {
        return nombreCriadero;
    }

    public void setNombreCriadero(String nombreCriadero) {
        this.nombreCriadero = nombreCriadero;
    }

    public ArrayList<String> getNombresCriaderos() {
        return nombresCriaderos;
    }

    public void setNombresCriaderos(ArrayList<String> nombresCriaderos) {
        this.nombresCriaderos = nombresCriaderos;
    }
    
    

    @Override
    public String insertar() {
       String sql = "";
       return sql;
   }

    //Actualiza el nombre del propietario unicamente
    @Override
    public String actualizar() {
       String sql = "UPDATE mascotas set propietario='"+propietario+"' where nombreMascota='"+nombreMascota+"' ";
       System.out.println(sql);//imprime por consola la consulta que se ejecuta en la BD 
       return sql;
    }

    @Override
    public String eliminar() {
       String sql = "delete from mascotas where nombreMascota= '"+nombreMascota+"' ";
       System.out.println(sql);
       return sql;
    }

    @Override
    public String consultar() {
        String sql = "SELECT mascotas.nombreMascota, criaderos.nombreCriadero, mascotas.propietario "
                + "FROM mascotas JOIN criaderos ON mascotas.codCriadero = criaderos.codCriadero "
                + "WHERE nombreMascota LIKE '" + nombreMascota + "'";
        System.out.println(sql);
       return sql;
    }
    
    public String consultarNombresCriaderos(){
        String sql = "SELECT nombreCriadero FROM criaderos";
        System.out.println(sql);
        return sql;
    }
    
}
