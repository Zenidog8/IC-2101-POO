import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Inventario implements Sujeto {
    private Map<String, Integer> productos;
    private List<Observador> observadores;

    public Inventario() {
        productos = new HashMap<>();
        observadores = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int cantidad) {
        productos.put(nombre, cantidad);
        notificarObservadores(nombre, cantidad);
    }

    public void actualizarCantidad(String nombre, int cantidad) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, cantidad);
            notificarObservadores(nombre, cantidad);
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String producto, int cantidad) {
        for (Observador observador : observadores) {
            observador.actualizar(producto, cantidad);
        }
    }
}
