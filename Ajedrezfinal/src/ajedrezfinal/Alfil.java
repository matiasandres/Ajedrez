
package ajedrezfinal;

public class Alfil extends Pieza{
    public String Nombre = "Alfil";
    public Alfil(Cordenada CordenadaIJ, String Color){
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
