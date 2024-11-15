package listatipopila;

import javax.swing.JOptionPane;

public class ListaTipoPila {

    public static void main(String[] args) {

        int opcion = 0;
        int nodo = 0;

        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1.Insertar un nodo\n"
                        + "2.Eliminar un nodo\n"
                        + "3.Verificar si la pila esta vacia\n"
                        + "4.Ultimo valor ingresado a la pila\n"
                        + "5.Tamaño de la pila\n"
                        + "6.Eliminar todos los nodos\n"
                        + "7.Mostrar contenido de la pila\n"
                        + "8.Salir.\n\n"
                ));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfacor ingrese el valor a guarda en el nodo"));
                        pila.insertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                + pila.eliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 3:
                        if(pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                        }
                        break;
                    case 4:
                        if(!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es: " + 
                                    pila.mostrarUtilimoValorIngresdo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene: " + pila.tamanoPila() + " nodos.");
                        break;
                    case 6:
                        if(!pila.pilaVacia()) {
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 7:
                        pila.mostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve a intentar nuevamente");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion != 8);
    }

}
