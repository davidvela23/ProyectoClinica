package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Departamentos {
    private Map<String, List<String>> departamentos;

    public Departamentos() {
        departamentos = new HashMap<>();
        cargarDepartamentos();
    }

    private void cargarDepartamentos() {
        // Agregar departamentos y sus distritos
        departamentos.put("Lima", List.of("Lima", "Callao", "Barranco", "Miraflores", "Surco", "San Isidro"));
        departamentos.put("La Libertad", List.of("Trujillo", "Salaverry", "Otuzco"));
        departamentos.put("Piura", List.of("Piura", "Sullana", "Talara"));
        departamentos.put("Arequipa", List.of("Arequipa", "Camaná", "Islay"));
        departamentos.put("Cusco", List.of("Cusco", "Aguas Calientes", "Sicuani"));
        departamentos.put("Ancash", List.of("Huaraz", "Carhuaz", "Chimbote", "Nuevo Chimbote"));
        departamentos.put("Puno", List.of("Puno", "Julio Selva", "Lampa"));
    }

    public List<String> getDistritos(String departamento) {
        return departamentos.getOrDefault(departamento, new ArrayList<>());
    }

    public List<String> getDepartamentos() {
        return new ArrayList<>(departamentos.keySet());
    }
}
