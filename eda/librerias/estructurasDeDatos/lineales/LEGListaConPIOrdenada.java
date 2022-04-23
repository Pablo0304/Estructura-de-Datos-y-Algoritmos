// COMPLETAR (HECHO)
package librerias.estructurasDeDatos.lineales;


/**
 * Nueva Implementación Enlazada de la interfaz ListaConPI que mantiene ordenados Ascendentemente los
 * elementos de la lista.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LEGListaConPIOrdenada <E extends Comparable<E>> extends LEGListaConPI<E>{
    public LEGListaConPIOrdenada() {
        super();
    }
    public void insertar(E e) {
        inicio();
        while (!esFin() && recuperar().compareTo(e) < 0) { siguiente(); }
        super.insertar(e);
        /*boolean inserit = false;
        while (!esFin() && !inserit) {
            if (recuperar().compareTo(e) < 0) siguiente();
            else {
                super.insertar(e);
                inserit = true;
            }
        }
        if (!inserit) super.insertar(e);*/
    }
}
