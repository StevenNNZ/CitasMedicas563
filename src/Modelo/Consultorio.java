
package Modelo;


public class Consultorio {
     private String Ident;
     private String Nombre;
public Consultorio (String Ident, String Nombre){
    this.Ident = Ident;
    this.Nombre = Nombre;
}
    public String getIdent() {
        return Ident;
    }

    public void setIdent(String Ident) {
        this.Ident = Ident;
    }

    public String getNombre() {
        return Nombre;
    }

   public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
   