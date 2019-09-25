
package ajedrez;

public class Jugador {

    public String nombre;
    public String apellido;

    public String Inicio(){
        return "Bienvenido "+nombre+" "+apellido+"¿Estas preparado?";
    }
    public String Empate(){
        return "Han empatado, los dos han sido igual de buenos";
    }
    
    
    
    
    public final String Fin(){
        return "En hora buena ha ganado "+nombre+" "+apellido;
    }
}
