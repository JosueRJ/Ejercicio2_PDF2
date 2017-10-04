package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador c = new Contador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        int cont = sc.nextInt();
        c.setContador(cont);
        
        //Incrementar
        System.out.println("---------------------------");
        c.incrementar(cont);
        System.out.println("El contador incrementado es: ");
        System.out.println(c.getContador(cont)+1);
        
        //Decrementar
        System.out.println("---------------------------");
        c.decrementar(cont);
        System.out.println("El contador decrementado es: ");
        System.out.println(c.getContador(cont)-1);
    }
    
}
