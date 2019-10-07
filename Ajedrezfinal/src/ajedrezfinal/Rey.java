
package ajedrezfinal;

class Rey extends Pieza{
    public String Nombre = "Rey";
    public Rey(Cordenada CordenadaIJ, String Color){
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
