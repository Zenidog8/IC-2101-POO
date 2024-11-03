import java.util.LinkedHashMap;
import java.util.Map;

class Cache {
    private static Cache instancia;
    private final int limite;
    private final LinkedHashMap<Integer, Integer> cache;

    private Cache(int limite) {
        this.limite = limite;
        this.cache = new LinkedHashMap<Integer, Integer>(limite, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > limite;
            }
        };
    }

    public static Cache obtenerInstancia(int limite) {
        if (instancia == null) {
            instancia = new Cache(limite);
        }
        return instancia;
    }

    public Integer obtener(int clave) {
        return cache.get(clave);
    }

    public void almacenar(int clave, int valor) {
        cache.put(clave, valor);
    }
}
