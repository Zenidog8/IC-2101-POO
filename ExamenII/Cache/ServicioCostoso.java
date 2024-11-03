class ServicioCostoso implements Servicio {
    @Override
    public int calcular(int valor) {
        // Simula una operación costosa
        System.out.println("Calculando el cuadrado de " + valor);
        return valor * valor;
    }
}
