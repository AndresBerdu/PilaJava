package listatipopila;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        tamano = 0;
    }

    //Metodo para saber cuado la pila esta vacia
    public boolean pilaVacia() {
        return UltimoValorIngresado == null;
    }

    //Metodo para insertar un nodo en la pila
    public void insertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }

    //Metodo para eliminar un nodo de la pila
    public int eliminarNodo() {
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }

    //Metodo para conocer cual es el ultimo valor ingresado
    public int mostrarUtilimoValorIngresdo() {
        return UltimoValorIngresado.informacion;
    }

    //Metodo para conocer el tamaño de la pila
    public int tamanoPila() {
        return tamano;
    }
    
    //Metodo para vaciar la pila
    public void vaciarPila() {
        while(!pilaVacia()) {
            eliminarNodo();
        }
    }
    
    //Metodo para mostrar el contenido de la pila
    public void mostrarValores() {
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null) {
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
