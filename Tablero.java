
package ajedrez;

public class Tablero {
    public char[][] Tablero;

    public void crear(){
        Tablero = new char[7][7];
        
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                Tablero[i][j] = '|';
            }
        }
    }
    public void mostrar(){
        for(int i=0; i < 7; i++){
            for(int j=0; j < 7; j++){
                System.out.print(Tablero[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }        
}