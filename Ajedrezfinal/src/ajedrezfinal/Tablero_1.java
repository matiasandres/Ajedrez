
package ajedrezfinal;

public class Tablero_1 {
    public String[][] Tablero;
    public String Casilla="|___|";
    public void crear(){
        Tablero = new String[8][8];

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                Tablero[i][j] = Casilla;
            }
        }
    }
    public void mostrar(){
        int cord = 8;
        System.out.println(" A       B       C       D       E       F       G       H");
        for(int i=0; i < 8; i++){
            for(int j=0; j < 8; j++){
                System.out.print(Tablero[i][j] + "\t");
            }
            System.out.println(cord+"\n");
            cord--;
        }
        System.out.println(" A       B       C       D       E       F       G       H");
    }
    public void Rellenar(){
        
        //Peon
        for(int x=0 ; x < 8; x++){
            Cordenada CordenadaPeonN = new Cordenada(1, x);
            Peon PeonN = new Peon(CordenadaPeonN, "Negro");   
            Tablero[CordenadaPeonN.i][CordenadaPeonN.j]=PeonN.Nombre;
        }
        for(int x=0 ; x < 8; x++){
            Cordenada CordenadaPeonB = new Cordenada(6, x);
            Peon PeonB = new Peon(CordenadaPeonB, "Blanco");   
            Tablero[CordenadaPeonB.i][CordenadaPeonB.j]=PeonB.Nombre;
        }
        
        //Torre
        Cordenada CordenadaTorreN = new Cordenada(0, 0);
        Torre TorreN = new Torre(CordenadaTorreN, "Negro");
        Tablero[CordenadaTorreN.i][CordenadaTorreN.j]=TorreN.Nombre;
        CordenadaTorreN.i=0;
        CordenadaTorreN.j=7;
        Tablero[CordenadaTorreN.i][CordenadaTorreN.j]=TorreN.Nombre;
        Cordenada CordenadaTorreB = new Cordenada(7, 0);
        Torre TorreB = new Torre(CordenadaTorreB, "Blanco");
        Tablero[CordenadaTorreB.i][CordenadaTorreB.j]=TorreB.Nombre;
        CordenadaTorreB.i=7;
        CordenadaTorreB.j=7;
        Tablero[CordenadaTorreB.i][CordenadaTorreB.j]=TorreB.Nombre;
        
        //Caballo
        Cordenada CordenadaCaballoN = new Cordenada(0, 1);
        Caballo CaballoN = new Caballo(CordenadaCaballoN, "Negro");
        Tablero[CordenadaCaballoN.i][CordenadaCaballoN.j]=CaballoN.Nombre;
        CordenadaCaballoN.i=0;
        CordenadaCaballoN.j=6;
        Tablero[CordenadaCaballoN.i][CordenadaCaballoN.j]=CaballoN.Nombre;
        Cordenada CordenadaCaballoB = new Cordenada(7, 1);
        Caballo CaballoB = new Caballo(CordenadaCaballoB, "Blanco");
        Tablero[CordenadaCaballoB.i][CordenadaCaballoB.j]=CaballoB.Nombre;
        CordenadaCaballoB.i=7;
        CordenadaCaballoB.j=6;
        Tablero[CordenadaCaballoB.i][CordenadaCaballoB.j]=CaballoB.Nombre;
        
        //Alfil
        Cordenada CordenadaAlfilN = new Cordenada(0, 2);
        Alfil AlfilN = new Alfil(CordenadaAlfilN, "Negro");
        Tablero[CordenadaAlfilN.i][CordenadaAlfilN.j]=AlfilN.Nombre;
        CordenadaAlfilN.i=0;
        CordenadaAlfilN.j=5;
        Tablero[CordenadaAlfilN.i][CordenadaAlfilN.j]=AlfilN.Nombre;
        Cordenada CordenadaAlfilB = new Cordenada(7, 2);
        Alfil AlfilB = new Alfil(CordenadaAlfilB, "Blanco");
        Tablero[CordenadaAlfilB.i][CordenadaAlfilB.j]=AlfilB.Nombre;
        CordenadaAlfilB.i=7;
        CordenadaAlfilB.j=5;
        Tablero[CordenadaAlfilB.i][CordenadaAlfilB.j]=AlfilB.Nombre;
        
        //Reina
        Cordenada CordenadaReinaN = new Cordenada(0, 3);
        Reina ReinaN = new Reina(CordenadaReinaN, "Negro");
        Tablero[CordenadaReinaN.i][CordenadaReinaN.j]=ReinaN.Nombre;
        Cordenada CordenadaReinaB = new Cordenada(7, 3);
        Reina ReinaB = new Reina(CordenadaReinaB, "Blanco");
        Tablero[CordenadaReinaB.i][CordenadaReinaB.j]=ReinaB.Nombre;
        
        //Rey
        Cordenada CordenadaReyN = new Cordenada(0, 4);
        Rey ReyN = new Rey(CordenadaReyN, "Negro");
        Tablero[CordenadaReyN.i][CordenadaReyN.j]= ReyN.Nombre;
        Cordenada CordenadaReyB = new Cordenada(7, 4);
        Rey ReyB = new Rey(CordenadaReyB, "Blanco");
        Tablero[CordenadaReyB.i][CordenadaReyB.j]= ReyB.Nombre;
        }
    }