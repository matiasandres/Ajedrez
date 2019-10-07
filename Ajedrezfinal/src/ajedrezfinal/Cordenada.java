
package ajedrezfinal;

public class Cordenada extends Tablero_1{
    public int i;
    public int j;
    public Cordenada(int i, int j){
        this.i = i;
        this.j = j;
    }
    public Cordenada(char j, int i){
        //Cordenada i
        this.i=(8-i);
        //Cordenada j
        if (j=='A'){
            this.j = 0;
        }
        if (j=='B'){
            this.j = 1;
        }
        if (j=='C'){
            this.j = 2;
        }
        if (j=='D'){
            this.j = 3;
        }
        if (j=='E'){
            this.j = 4;
        }
        if (j=='F'){
            this.j = 5;
        }
        if (j=='G'){
            this.j = 6;
        }
        if (j=='H'){
            this.j = 7;
        }
    }
}
