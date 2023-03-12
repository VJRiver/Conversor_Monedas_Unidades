import java.util.HashMap;
import java.util.Map;

public class DatosMapas {
    private Map<Integer, Double> factores = new HashMap<>();
    private Map<Integer, String> etiquetas = new HashMap<>();
    
    public void llenarMapa(int opcion1, int opcion2, double temperatura) {

        factores.clear();
        etiquetas.clear();

        if(opcion1 == 1) {
            factores.put(0, 0.055);
            etiquetas.put(0, "Dólares");
            factores.put(1, 0.052);
            etiquetas.put(1, "Euros");
            factores.put(2, 0.045);
            etiquetas.put(2, "Libras Esterlinas");
            factores.put(3, 7.46);
            etiquetas.put(3, "Yenes Japoneses");
            factores.put(4, 72.03);
            etiquetas.put(4, "Wones Sur Coreanos");
            factores.put(5, 18.33);
            etiquetas.put(5, "Pesos");
            factores.put(6, 19.41);
            etiquetas.put(6, "Pesos");
            factores.put(7, 21.99);
            etiquetas.put(7, "Pesos");
            factores.put(8, 0.13);
            etiquetas.put(8, "Pesos");
            factores.put(9, 0.014);
            etiquetas.put(9, "Pesos");
        }else if(opcion1 == 2) {
            factores.put(0,(temperatura*1.8)+32);
            etiquetas.put(0, "grados Fahrenheit");
            factores.put(1, (temperatura-32)*0.5555555555555556);
            etiquetas.put(1, "grados Celsius");
        }else if(opcion1 == 3) {
          
            factores.put(0, 2.54);
            etiquetas.put(0, "centímetros");
            factores.put(1, 0.3048);
            etiquetas.put(1, "metros");
            factores.put(2, 0.9144);
            etiquetas.put(2, "metros");
            factores.put(3, 1.60934);
            etiquetas.put(3, "kilómetros");
            factores.put(4, 0.621371);
            etiquetas.put(4, "millas");
            factores.put(5, 1.09361);
            etiquetas.put(5, "yardas");
            factores.put(6, 3.28084);
            etiquetas.put(6, "pies");
            factores.put(7, 0.393701);
            etiquetas.put(7, "pulgadas");
            
        }else if(opcion1 == 4) {
            factores.put(0, 28.35);
            etiquetas.put(0, "gramos");
            factores.put(1, 453.6);
            etiquetas.put(1, "gramos");
            factores.put(2, 0.453592);
            etiquetas.put(2, "kilogramos");
            factores.put(3, 2.20462);
            etiquetas.put(3, "libras");
            factores.put(4, 0.00220462);
            etiquetas.put(4, "libras");
            factores.put(5, 0.035274);
            etiquetas.put(5, "onzas");
        }
        
        
    }

    public Map<Integer, Double> getFactores() {
        return factores;
    }

    public Map<Integer, String> getEtiquetas() {
        return etiquetas;
    }
}
