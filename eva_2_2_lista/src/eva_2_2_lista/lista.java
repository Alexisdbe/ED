package eva_2_2_lista;

public class lista {
    private nodo inicio; // Atributo de la clase

    public lista() {
        this.inicio = null; // Inicialización opcional en constructor
    }

    public void agregar(int Valor) {
        nodo nuevo = new nodo(Valor);

        if (inicio == null) { // Caso 1: Lista vacía
            inicio = nuevo;
        } else { // Caso 2: La lista ya tiene elementos
            nodo temp = inicio;
            
            // Buscamos el ÚLTIMO nodo (el que no tiene siguiente)
            while (temp.getSiguiente() != null) { 
                temp = temp.getSiguiente();
            }
            
            // Ahora temp es el último nodo, aquí sí podemos conectar
            temp.setSiguiente(nuevo);
        }
    }
    public void imprimirlista(){
        nodo temp = inicio;
        while(temp != null){
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
}