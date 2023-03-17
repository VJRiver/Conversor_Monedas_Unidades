
public class DatosComboBoxes {
    
    private String[] tipoConversion = {"Selecciona opción", "Moneda", "Temperatura", "Longitud", "Masa"};
    
    private String[] monedas = {"Selecciona opción", "Peso Mexicano a Dólar", "Peso Mexicano a Euro", "Peso Mexicano a Libra Esterlina", "Peso Mexicano a Yen Japonés", "Peso Mexicano a Won Sur Coreano", "Dólar a Peso Mexicano", "Euro a Peso Mexicano", "Libra Esterlina a Peso Mexicano", "Yen Japonés a Peso Mexicano","Won Sur Coreano a Peso Mexicano"};
    
    private String[] temperaturas = {"Selecciona opción", "Grados Celsius a Fahrenheit","Grados Kelvin a Fahrenheit" , "Grados Kelvin a Celsius", "Grados Fahrenheit a Celsius", "Grados Celsius a Kelvin", "Grados Fahrenheit a Kelvin"};
    
    private String[] longitudes = {"Selecciona opción", "Pulgadas a centímetros", "Pies a Metros", "Yardas a Metros", "Millas a Kilómetros", "Kilómetros a Millas", "Metros a Yardas", "Metros a Pies", "Centímetros a Pulgadas"};
    
    private String[] masas = {"Selecciona opción", "Onzas a Gramos", "Libras a Gramos", "Libras a Kilogramos", "Kilogramos a Libras", "Gramos a Libras", "Gramos a Onzas"};
    
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










