import javax.swing.JOptionPane;

public class Confirmacion {

    private int confirmacion = -1;
    private int contador;
    
    public Confirmacion(int contador) {
        this.contador = contador;
    }
    
    public void mensaje() {
        
        if(contador == 1) {
            confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        }
        if(confirmacion == JOptionPane.CANCEL_OPTION || confirmacion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Terminado");
            System.exit(0);
        }
    }
    

}
