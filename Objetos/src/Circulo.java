public class Circulo {
    // Atributos de clase
    public static final double PI = 3.14159265358979323846;

    // Atributos privados
    private double radio;

    // Constructor sin parámetros
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Constructor de copia
    public Circulo(Circulo circulo) {
        this.radio = circulo.radio;
    }

    // Método getter
    public double getRadio() {
        return radio;
    }

    // Método setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para obtener el área
    public double calcularArea() {
        return PI * this.radio * this.radio;
    }

    // Método para obtener el perímetro
    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }
}
