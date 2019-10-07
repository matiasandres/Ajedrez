
package ajedrezfinal;

public class Peon extends Pieza{
    public String Nombre = "Peon";
    public Peon(Cordenada CordenadaIJ, String Color){
        this.CordenadaIJ = CordenadaIJ;
        this.Color = Color;
        if(Color=="Blanco"){
            Nombre = Nombre +"B";
        }
        if(Color=="Negro"){
            Nombre = Nombre + "N";
        }
    }
}
