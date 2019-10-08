
package ajedrezfinal;

public abstract class Pieza extends Tablero_1{
    public Cordenada CordenadaIJ;
    public String Color;
    
    void Movimiento(Cordenada CordenadaFinal){
        CordenadaIJ.i = CordenadaFinal.i;
        CordenadaIJ.j = CordenadaFinal.j;
    }
}
