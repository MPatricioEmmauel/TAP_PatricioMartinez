
package src;

/**
 *
 * @author Patricio
 */
public class Persona {
    private String Nombre;
    private String Telefono;
    private String Correo;
    private String Cumple;

    public Persona(){
    } 
    public Persona(String nom, String tel, String corr, String cum){
        Nombre=nom;
        Telefono=tel;
        Correo=corr;
        Cumple=cum;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public String getCumple(){
        return Cumple;
    }
    public void setCumple(String cumple){
        this.Cumple = cumple;
    }
}
