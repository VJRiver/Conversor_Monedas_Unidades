import java.util.HashMap;
import java.util.Map;

public class DatosMapas {
    private Map<Integer, Double> factores = new HashMap<>();
    private Map<Integer, String> etiquetas = new HashMap<>();
    
    public void llenarMapa(int opcion1, int opcion2, double temperatura) {

        factores.clear();
        etiquetas.clear();

        if(opcion1 == 1) {
            factores.put(0, 0.0);
            etiquetas.put(0, null);
            factores.put(1, 0.055);
            etiquetas.put(1, "Dólares");
            factores.put(2, 0.052);
            etiquetas.put(2, "Euros");
            factores.put(3, 0.045);
            etiquetas.put(3, "Libras Esterlinas");
            factores.put(4, 7.46);
            etiquetas.put(4, "Yenes Japoneses");
            factores.put(5, 72.03);
            etiquetas.put(5, "Wones Sur Coreanos");
            factores.put(6, 18.33);
            etiquetas.put(6, "Pesos");
            factores.put(7, 19.41);
            etiquetas.put(7, "Pesos");
            factores.put(8, 21.99);
            etiquetas.put(8, "Pesos");
            factores.put(9, 0.13);
            etiquetas.put(9, "Pesos");
            factores.put(10, 0.014);
            etiquetas.put(10, "Pesos");
        }else if(opcion1 == 2) {
            factores.put(0,0.0);
            etiquetas.put(0, null);
            factores.put(1, (temperatura*1.8)+32); // C a F
            etiquetas.put(1, "grados Fahrenheit");
            factores.put(2, (temperatura - 273.15) * 1.8 + 32); // K a F
            etiquetas.put(2, "grados Kelvin");
            factores.put(3, temperatura - 273.15); // K a C
            etiquetas.put(3, "grados Celsius");
            factores.put(4, (temperatura-32)*0.5555555555555556); // F a C
            etiquetas.put(4, "grados Celsius");
            factores.put(5, temperatura + 273.15); // C a K
            etiquetas.put(5, "grados Kelvin");
            factores.put(6, (temperatura - 32) * 0.5555555555555556 + 273.15); // F a K
            etiquetas.put(6, "grados Kelvin");
        }else if(opcion1 == 3) {
          
            factores.put(0, 0.0);
            etiquetas.put(0, null);
            factores.put(1, 2.54);
            etiquetas.put(1, "centímetros");
            factores.put(2, 0.3048);
            etiquetas.put(2, "metros");
            factores.put(3, 0.9144);
            etiquetas.put(3, "metros");
            factores.put(4, 1.60934);
            etiquetas.put(4, "kilómetros");
            factores.put(5, 0.621371);
            etiquetas.put(5, "millas");
            factores.put(6, 1.09361);
            etiquetas.put(6, "yardas");
            factores.put(7, 3.28084);
            etiquetas.put(7, "pies");
            factores.put(8, 0.393701);
            etiquetas.put(8, "pulgadas");
            
        }else if(opcion1 == 4) {
            factores.put(0, 0.0);
            etiquetas.put(0, null);
            factores.put(1, 28.35);
            etiquetas.put(1, "gramos");
            factores.put(2, 453.6);
            etiquetas.put(2, "gramos");
            factores.put(3, 0.453592);
            etiquetas.put(3, "kilogramos");
            factores.put(4, 2.20462);
            etiquetas.put(4, "libras");
            factores.put(5,0.00220462);
            etiquetas.put(5, "libras");
            factores.put(6,  0.035274);
            etiquetas.put(6, "onzas");
        }
        
        
    }

    public Map<Integer, Double> getFactores() {
        return factores;
    }

    public Map<Integer, String> getEtiquetas() {
        return etiquetas;
    }
}
