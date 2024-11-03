class AlmacenamientoTrazas implements Observador {
    @Override
    public void actualizar(String producto, int cantidad) {
        System.out.println("Trazas: Se ha registrado un cambio en el producto " + producto + " con nueva cantidad: " + cantidad);
    }
}
