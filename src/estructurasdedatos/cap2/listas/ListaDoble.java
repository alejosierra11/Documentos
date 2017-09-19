import nododoble.Nododoble;


public class ListaDoble {

    private Nododoble cabeza;
    private Nododoble cola;
    

    public void crearlistasimple() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertar(int dato) {
        Nododoble nodo = new Nododoble();
        nodo.crearnodo();
        nodo.setdato(dato);

        if (this.cabeza == null && this.cola == null) {
            this.cabeza = nodo;
            this.cola = nodo;
        } else {
            cola.setsiguiente(nodo);
            this.cola = nodo;
        }
    }

    public void eliminar(int dato) {
        if (cabeza.getdato() == dato) {
            cabeza = (Nododoble) cabeza.getsiguiente();

        } else {
            Nododoble aux = cabeza;
            while (aux.getsiguiente().getdato() != dato) {
                aux = (Nododoble) aux.getsiguiente();

            }
            Nododoble siguiente = aux.getsiguiente().getsiguiente();
            aux.setsiguiente(siguiente);
        }

    }

    public void listar() {
        if (!(this.cabeza == null && this.cola == null)) {
            Nododoble aux = cabeza;

            int i = 0;
            while (aux != null) {
                System.out.println("El dato :" + "(" + aux.getdato() + ")" + " " + "esta en la posicion" + "(" + i + ")");
                i++;
            }
        }
    }
}
