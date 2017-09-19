/**
 *
 * @author utp
 */
public class Nododoble {

    private int dato;
    private Nododoble cabeza;
    private Nododoble cola;
    private Nododoble Nododoble;

    public Nododoble getSiguiente() {
        return cabeza;
    }

    public void setSiguiente(Nododoble siguiente) {
        this.Nododoble = siguiente;
    }

    public Nododoble getAnterior() {
        return cola;
    }

    public void setAnterior(Nododoble anterior) {
        this.Nododoble = anterior;
    }

    public int getdato() {
        return dato;
    }

    public void setdato(int dato) {
        this.dato = dato;
    }

    public void crearNodo() {
        this.cabeza = null;
        this.cola = null;
        this.dato = 0;
    }

    public void setsiguiente(Nododoble siguiente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getsiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void crearnodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
