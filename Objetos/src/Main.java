// Clase principal del proyecto
public class Main {

    /**
     * Método principal, al ser estático no se necesita crear un
     * objeto de la clase Main para ejecutarlo
     * */
    public static void main(String[] args) {

        // Se usa el constructor para crear un objeto de tipo Circulo con radio 5
        Circulo circulo = new Circulo(5);
        System.out.println("Area 1: " + circulo.calcularArea());

        // Se usa el constructor para crear un objeto de tipo Circulo con radio 10
        Circulo circulo2 = new Circulo(10);
        System.out.println("Area 2: " + circulo2.calcularArea());

        // Se usa el constructor de copia para crear un objeto de tipo Circulo con radio 10
        Circulo circulo3 = new Circulo(circulo2);
        System.out.println("Area 3: " + circulo3.calcularArea());

        // Se modifica el radio del circulo3 y esto no afecta al circulo2
        // porque son objetos diferentes
        circulo3.setRadio(15);
        System.out.println("Area 2: " + circulo3.calcularArea());
        System.out.println("Area 3: " + circulo2.calcularArea());
    }
}