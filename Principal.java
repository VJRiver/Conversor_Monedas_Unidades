import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

/**
 * @author Dell3020
 *
 */
public class Principal extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> CBsubUnidades;
    private String opcion = null;
    private JComboBox<String> comboBox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Principal() {

        setTitle("Conversor de Monedas y Unidades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 1000, 662);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Selecciona opción a convertir");
        lblNewLabel.setBounds(288, 136, 407, 32);
        lblNewLabel.setFont(new Font("Linux Biolinum G", Font.BOLD, 30));
        contentPane.add(lblNewLabel);
        
        comboBox = new JComboBox<>();
        comboBox.setFont(new Font("Linux Biolinum G", Font.BOLD, 15));
        comboBox.setBackground(new Color(100, 150, 237));
        comboBox.setBounds(335, 207, 311, 32);
        comboBox.addItem("Opcion");
        comboBox.addItem("Moneda");
        comboBox.addItem("Temperatura");
        comboBox.addItem("Longitud");
        comboBox.addItem("Masa"); 
        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {                
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    if(!comboBox.getSelectedItem().toString().equals("Opcion")) {
                        opcion = comboBox.getSelectedItem().toString();
                        abrirOpcion(opcion);
                    }
                }                
            }            
        });

        contentPane.add(comboBox);
        
        CBsubUnidades = new JComboBox<String>();
        CBsubUnidades.setFont(new Font("Linux Biolinum G", Font.BOLD, 13));
        CBsubUnidades.setBounds(272, 310, 426, 32);
        contentPane.add(CBsubUnidades);        
        CBsubUnidades.setVisible(true);           
        
        JButton btnAceptar = new JButton("Convertir");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opcion == "Opcion") {
                    JOptionPane.showMessageDialog(null, "Necesitas escoger un tipo de conversión");
                }else if(opcion == "Moneda"){
                    convierteMonedas();
                }else if(opcion == "Temperatura"){
                    convierteTemperatura();
                }else if(opcion == "Longitud"){
                    convierteLongitud();
                }else if(opcion == "Masa"){
                    convierteMasa();
                }
            }
        });
        btnAceptar.setFont(new Font("Linux Biolinum G", Font.BOLD, 20));
        btnAceptar.setBounds(421, 449, 141, 40);
        contentPane.add(btnAceptar);
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
        btnSalir.setFont(new Font("Linux Biolinum G", Font.BOLD, 20));
        btnSalir.setBounds(421, 520, 141, 40);
        contentPane.add(btnSalir);        
        
        JLabel lblNewLabel_1 = new JLabel("Selecciona unidades");
        lblNewLabel_1.setFont(new Font("Linux Biolinum G", Font.ITALIC, 15));
        lblNewLabel_1.setBounds(430, 274, 123, 25);
        contentPane.add(lblNewLabel_1);        
    }
    
    public void abrirOpcion(String opcion) {
        
        if(opcion == "Moneda") {
            CBsubUnidades.removeAllItems();
            CBsubUnidades.addItem("Peso Mexicano a Dólar");
            CBsubUnidades.addItem("Peso Mexicano a Euro");
            CBsubUnidades.addItem("Peso Mexicano a Libra Esterlina");
            CBsubUnidades.addItem("Peso Mexicano a Yen Japonés");
            CBsubUnidades.addItem("Peso Mexicano a Won Sur Coreano");
            CBsubUnidades.addItem("Dólar a Peso Mexicano");
            CBsubUnidades.addItem("Euro a Peso Mexicano");
            CBsubUnidades.addItem("Libra Esterlina a Peso Mexicano");
            CBsubUnidades.addItem("Yen Japonés a Peso Mexicano");
            CBsubUnidades.addItem("Won Sur Coreano a Peso Mexicano");
            
        }else if(opcion == "Temperatura") {
            CBsubUnidades.removeAllItems();
            CBsubUnidades.addItem("Grados Celsius a Fahrenheit");
            CBsubUnidades.addItem("Grados Fahrenheit a Celsius");
        }else if(opcion == "Longitud") {
            CBsubUnidades.removeAllItems();
            CBsubUnidades.addItem("Pulgadas a centímetros");
            CBsubUnidades.addItem("Pies a Metros");
            CBsubUnidades.addItem("Yardas a Metros");
            CBsubUnidades.addItem("Millas a Kilómetros");
            CBsubUnidades.addItem("Kilómetros a Millas");
            CBsubUnidades.addItem("Metros a Yardas");
            CBsubUnidades.addItem("Metros a Pies");
            CBsubUnidades.addItem("Centímetros a Pulgadas");
        }else if(opcion == "Masa") {
            CBsubUnidades.removeAllItems();
            CBsubUnidades.addItem("Onzas a Gramos");
            CBsubUnidades.addItem("Libras a Gramos");
            CBsubUnidades.addItem("Libras a Kilogramos");
            CBsubUnidades.addItem("Kilogramos a Libras");
            CBsubUnidades.addItem("Gramos a Libras");
            CBsubUnidades.addItem("Gramos a Onzas");
        }

    }
    
    private void convierteMonedas(){
        double resultadoMoneda = 0;
        double cantidadACambiar = 0;
        String seleccionMoneda = CBsubUnidades.getSelectedItem().toString();
        switch(seleccionMoneda) {
        case "Peso Mexicano a Dólar":
            try {
                cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de pesos"));
                resultadoMoneda = cantidadACambiar/18;
                JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" dólares");
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
                
            }
            break;            
        
    case "Peso Mexicano a Euro":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de pesos"));
            resultadoMoneda = cantidadACambiar/19;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" Euros");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
            
        }
        break;
        
    case "Peso Mexicano a Libra Esterlina":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de pesos"));
            resultadoMoneda = cantidadACambiar/21.30;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" Libras Esterlinas");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
    
    case "Peso Mexicano a Yen Japonés":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de pesos"));
            resultadoMoneda = cantidadACambiar*7.63;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" Yen Japoneses");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
        
    case "Peso Mexicano a Won Sur Coreano":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de pesos"));
            resultadoMoneda = cantidadACambiar*73.21;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" Wones");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
        
    case "Dólar a Peso Mexicano":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de dólares"));
            resultadoMoneda = cantidadACambiar*18;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" pesos");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
        
    case "Euro a Peso Mexicano":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de Euros"));
            resultadoMoneda = cantidadACambiar*19;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" pesos");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
        
    case "Libra Esterlina a Peso Mexicano":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de Libras"));
            resultadoMoneda = cantidadACambiar*21.3;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" pesos");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales");
        }
        break;
        
    case "Yen Japonés a Peso Mexicano":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de Yenes"));
            resultadoMoneda = cantidadACambiar/7.63;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" pesos");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
        
    case "Won Sur Coreano a Peso Mexicano":
        try {
            cantidadACambiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de Wones"));
            resultadoMoneda = cantidadACambiar/73.21;
            JOptionPane.showMessageDialog(null, "Tienes " + resultadoMoneda +" pesos");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
        }
        break;
        
        }  
    }

    
    private void convierteTemperatura() {
        double resultadoTemperatura = 0;
        double temperaturaIngresada = 0.0;
        String seleccionTemperatura  = CBsubUnidades.getSelectedItem().toString();
        
        switch(seleccionTemperatura) {
        case "Grados Celsius a Fahrenheit":
            try {
                temperaturaIngresada = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Celsius"));
                resultadoTemperatura = (temperaturaIngresada*1.8)+32;
                JOptionPane.showMessageDialog(null, temperaturaIngresada + "equivale a " + resultadoTemperatura +" grados Fahrenheit");
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
                
            }
            break;
            
        case "Grados Fahrenheit a Celsius":
            try {
                temperaturaIngresada = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Fahrenheit"));
                resultadoTemperatura = (temperaturaIngresada-32)/1.8;
                JOptionPane.showMessageDialog(null, temperaturaIngresada + "equivale a " + resultadoTemperatura +" grados Celsius");
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Intenta de nuevo. Solamente se aceptan enteros y decimales.");
                
            }
            break;
        }
    }
    
    private double convierteLongitud() {
        double resultadoLongitud = 0;
        String seleccionLongitud  = CBsubUnidades.getSelectedItem().toString();
        System.out.println(resultadoLongitud);
        return resultadoLongitud;
    }
    
    private double convierteMasa() {
        double resultadoMasa = 0;
        String seleccionMasa  = CBsubUnidades.getSelectedItem().toString();
        System.out.println(resultadoMasa);
        return resultadoMasa;
    }
}























