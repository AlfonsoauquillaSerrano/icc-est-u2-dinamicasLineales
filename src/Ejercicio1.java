import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    //Metodo devuelve una cadena de texto invertida
    //texto -> COMPUTACION
    //retorna NOICATUPMOC
    //Usando solo pilas
    public String invertString(String texto){
        Deque<Character> pila = new ArrayDeque<>();

        texto.toCharArray();

        for (char letra : texto.toCharArray()) {
            pila.push(letra);
            
        }
        String invertido="";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
            
        }
        return invertido;
    }
    
}
