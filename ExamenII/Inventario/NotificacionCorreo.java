class NotificacionCorreo implements Observador {
    @Override
    public void actualizar(String producto, int cantidad) {
        System.out.println("Correo: El inventario del producto " + producto + " ha cambiado a " + cantidad + " unidades.");
    }
}
