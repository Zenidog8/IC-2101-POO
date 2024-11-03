class GeneracionReportes implements Observador {
    @Override
    public void actualizar(String producto, int cantidad) {
        System.out.println("Reporte: Generando reporte para el producto " + producto + " con cantidad actual de " + cantidad);
    }
}
