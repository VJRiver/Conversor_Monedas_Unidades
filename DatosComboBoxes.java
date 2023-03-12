
public class DatosComboBoxes {
    
    private String[] tipoConversion = {"Opcion", "Moneda", "Temperatura", "Longitud", "Masa"};
    
    private String[] monedas = {"Peso Mexicano a Dólar", "Peso Mexicano a Euro", "Peso Mexicano a Libra Esterlina", "Peso Mexicano a Yen Japonés", "Peso Mexicano a Won Sur Coreano", "Dólar a Peso Mexicano", "Euro a Peso Mexicano", "Libra Esterlina a Peso Mexicano", "Yen Japonés a Peso Mexicano","Won Sur Coreano a Peso Mexicano"};
    
    private String[] temperaturas = {"Grados Celsius a Fahrenheit", "Grados Fahrenheit a Celsius"};
    
    private String[] longitudes = {"Pulgadas a centímetros", "Pies a Metros", "Yardas a Metros", "Millas a Kilómetros", "Kilómetros a Millas", "Metros a Yardas", "Metros a Pies", "Centímetros a Pulgadas"};
    
    private String[] masas = {"Onzas a Gramos", "Libras a Gramos", "Libras a Kilogramos", "Kilogramos a Libras", "Gramos a Libras", "Gramos a Onzas"};
    
    int index;
    
    public String[] getTipoConversion() {
        return this.tipoConversion;
    }
    
    public String[] getUnidades(int index) {
        this.index = index;
        
        // Monedas
        if(index == 1) {
            return this.monedas;
        }
        
        // Temperatura
        
        else if(index == 2) {
            return this.temperaturas;
        }
        
        // Longitud
        
        else if(index == 3) {
            return this.longitudes;
        }
        
        // Masa
        
        else if(index == 4) {
            return this.masas;
        }
        return null;
    }
    
    

}










