import java.util.ArrayDeque;
import java.util.Stack;


public class Ejercicio2 {
     public boolean esPalindromo(String texto){
        Stack<Character> pila = new Stack<>();
        
        texto.toCharArray();
        boolean dato;
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
            
        }
        String invertido="";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
            
        }
        
        if (texto.equalsIgnoreCase(invertido)) {
           dato=true;
        }else{
            dato=false;
        }
        return dato;
    }
    
}
