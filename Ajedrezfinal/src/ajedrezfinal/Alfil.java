
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
    @Override
    void Movimiento(Cordenada CordenadaFinal){
        CordenadaIJ= CordenadaFinal;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if ("AlfilB".equals(Tablero[i][j])){
                    Tablero[i][j]="|___|";
                }
            }
        }
    }
}
