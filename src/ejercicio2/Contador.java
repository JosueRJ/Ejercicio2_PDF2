
package ejercicio2;

public class Contador {
    //Atributos
    private int contador;
        
    //Constructores
    //Por defecto
    public Contador() {
    }
    //Con parametros

    public Contador(int contador) {
        this.contador = contador;
    }
    
    //Copia
    public Contador(Contador contadores){
        this.contador = contadores.contador;
    }
    
    //Getters y setters

    public int getContador(int cont) {
        return cont;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    //Metodos
    public void incrementar(int contador1){
        contador1++;
    }
    public void decrementar(int contador1){
        contador1--;
        if (contador1 < 0){
            contador1 = 0;
        }
    }
}
