
package ajedrezfinal;

public class Reina extends Pieza{
    public String Nombre = "Reina";
    public Reina(Cordenada CordenadaIJ, String Color){
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
