class ServicioCacheProxy implements Servicio {
    private final Servicio servicioReal;
    private final Cache cache;

    public ServicioCacheProxy(Servicio servicioReal, int limiteCache) {
        this.servicioReal = servicioReal;
        this.cache = Cache.obtenerInstancia(limiteCache);
    }

    @Override
    public int calcular(int valor) {
        Integer resultado = cache.obtener(valor);
        if (resultado != null) {
            System.out.println("Resultado obtenido de la caché para " + valor);
            return resultado;
        }

        // Si no está en la caché, se realiza el cálculo y se almacena
        resultado = servicioReal.calcular(valor);
        cache.almacenar(valor, resultado);
        return resultado;
    }
}
