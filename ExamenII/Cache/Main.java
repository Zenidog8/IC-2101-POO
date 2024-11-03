public class Main {
    public static void main(String[] args) {
        Servicio servicio = new ServicioCacheProxy(new ServicioCostoso(), 3);

        // Primera solicitud: el cálculo se realiza y se almacena en caché
        System.out.println("Resultado: " + servicio.calcular(5));

        // Segunda solicitud: el cálculo se realiza y se almacena en caché
        System.out.println("Resultado: " + servicio.calcular(10));

        // Tercera solicitud: el cálculo se realiza y se almacena en caché
        System.out.println("Resultado: " + servicio.calcular(15));

        // Cuarta solicitud: el cálculo se realiza y se almacena en caché
        System.out.println("Resultado: " + servicio.calcular(20));

        // Nueva solicitud para un valor que ya está en caché (5)
        System.out.println("Resultado: " + servicio.calcular(5));

        // Solicitud para un valor antiguo que ya fue descartado (10)
        System.out.println("Resultado: " + servicio.calcular(10));
    }
}
