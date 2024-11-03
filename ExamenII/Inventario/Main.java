//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Observador correo = new NotificacionCorreo();
        Observador trazas = new AlmacenamientoTrazas();
        Observador reportes = new GeneracionReportes();

        inventario.agregarObservador(correo);
        inventario.agregarObservador(trazas);
        inventario.agregarObservador(reportes);

        System.out.println("Agregando producto 'Laptop' con cantidad de 10:");
        inventario.agregarProducto("Laptop", 10);

        System.out.println("Actualizando cantidad de 'Laptop' a 5:");
        inventario.actualizarCantidad("Laptop", 5);
    }
}
