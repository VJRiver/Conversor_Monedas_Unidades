import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Calculos {

    private double resultadoMoneda = 0;
    private double cantidadACambiar = 0;
    private DatosMapas datosMapas = new DatosMapas();
    static int contadorMoneda = 0;
    
//  contadorMoneda++;
//  if(contadorMoneda == 1) {
//      JOptionPane.showConfirmDialog(null, "¿Desea continuar?", JOptionPane.YES_NO_OPTION);
//  }
  //System.out.println("\nContador Moneda: " + contadorMoneda);
    
    
    public void convierteMonedas(int opcion1, int opcion2){
        double resultadoMoneda;
        double cantidadACambiar;
        
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad a cambiar, solamente números "));
            datosMapas.llenarMapa(opcion1, opcion2, 0);
            resultadoMoneda = cantidadACambiar * datosMapas.getFactores().get(opcion2);
            JOptionPane.showMessageDialog(null, "El equivalente en " + datosMapas.getEtiquetas().get(opcion2) + " es " + String.format("%.2f", resultadoMoneda));

        }catch(NullPointerException e) {
            
            e.printStackTrace();
        }catch(NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato incorrecto, sólo se admiten números");
        }finally {
            System.out.println("Opcion1= " + opcion1 + " Opcion2 = " + opcion2);
        }

    }

    
    
    public void convierteTemperatura(int opcion1, int opcion2) {
        double resultadoTemperatura = 0.0;
        
        try {
            double temperaturaIngresada = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura a convertir, solamente números "));
            datosMapas.llenarMapa(opcion1, opcion2, temperaturaIngresada);        
            resultadoTemperatura = datosMapas.getFactores().get(opcion2);        
            JOptionPane.showMessageDialog(null, "La temperatura en " + datosMapas.getEtiquetas().get(opcion2) + " es " + String.format("%.2f", resultadoTemperatura));
        }catch(NullPointerException e) {
            
            e.printStackTrace();
        }catch(NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato incorrecto, sólo se admiten números sin comas, puntos ni espacios");
        }finally {
            System.out.println("\nOpcion1= " + opcion1 + " Opcion2 = " + opcion2);
        }

    }
    
        
    
    
    public void convierteLongitud(int opcion1, int opcion2) {
        double resultadoLongitud = 0;
        double longitudIngresada = 0.0;
        try {                
                longitudIngresada = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud a convertir, solamente números "));
                datosMapas.llenarMapa(opcion1, opcion2, 0.0);
                resultadoLongitud = longitudIngresada * datosMapas.getFactores().get(opcion2);
                JOptionPane.showMessageDialog(null, "La longitud equivalente en " + datosMapas.getEtiquetas().get(opcion2) + " es " + String.format("%.2f", resultadoLongitud));
                }catch(NullPointerException e) {
                    e.printStackTrace();
                }catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Formato Incorrecto, solamente se aceptan números.");
                }finally {
                    System.out.println("\nOpcion1= " + opcion1 + " Opcion2 = " + opcion2);
                }
    }
    
    
    
    
    public void convierteMasa(int opcion1, int opcion2) {
        datosMapas.llenarMapa(opcion1, opcion2, 0);
        double resultadoMasa = 0;
        try {
            double masaIngresada = Double.parseDouble(JOptionPane.showInputDialog("Introduce la masa a calcular, solamente números "));
            resultadoMasa = masaIngresada*datosMapas.getFactores().get(opcion2);
            JOptionPane.showMessageDialog(null, "La masa equivalente en " + datosMapas.getEtiquetas().get(opcion2) + " es " + String.format("%.2f", resultadoMasa));
        }catch(NullPointerException e) {
            e.printStackTrace();
        }catch(NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato incorrecto, sólo se admiten números");
        }finally {
            System.out.println("\nOpcion1= " + opcion1 + " Opcion2 = " + opcion2);
        }

    }

}
