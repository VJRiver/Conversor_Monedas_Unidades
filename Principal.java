import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

/**
 * @author Victor Javier Rivera Gutierrez
 *
 */
public class Principal extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> CBsubUnidades;
    private JComboBox<String> comboBox;
    private DatosComboBoxes datosARellenar = new DatosComboBoxes();
    private Calculos convertir = new Calculos();

    private int seleccion1;
    private int seleccion2;

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
    
    private class primerSeleccionUnidades implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(comboBox.getSelectedIndex() != 0) {
                seleccion2 = CBsubUnidades.getSelectedIndex();
//                CBsubUnidades.setModel(new DefaultComboBoxModel<String>(datosARellenar.getUnidades(seleccion1)));
            }
            //System.out.println("\nSelección 2: " + seleccion2);
        }
        
    }

    /**
     * Create the frame.
     */
    public Principal() {

        setTitle("Conversor de Monedas y Unidades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 800, 562);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Selecciona tipo de conversión");
        lblNewLabel.setBounds(188, 27, 407, 32);
        lblNewLabel.setFont(new Font("Linux Biolinum G", Font.BOLD, 30));
        contentPane.add(lblNewLabel);
        
        comboBox = new JComboBox<>();
        comboBox.setFont(new Font("Linux Biolinum G", Font.BOLD, 15));
        comboBox.setBackground(new Color(100, 150, 237));
        comboBox.setBounds(236, 98, 311, 32);
        comboBox.setModel(new DefaultComboBoxModel<String>(datosARellenar.getTipoConversion()));
        contentPane.add(comboBox);
        
        CBsubUnidades = new JComboBox<String>();
        CBsubUnidades.setFont(new Font("Linux Biolinum G", Font.BOLD, 13));
        CBsubUnidades.setBounds(179, 259, 426, 32);
        contentPane.add(CBsubUnidades);  
        CBsubUnidades.addActionListener(new primerSeleccionUnidades());
  
        
     // Rellena el segundo ComboBox en base a lo seleccionado en el primero
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {                
                if(e.getStateChange() == ItemEvent.SELECTED) {                    
                    if(comboBox.getSelectedIndex() != 0) {
                        seleccion1 = comboBox.getSelectedIndex();
                        CBsubUnidades.setModel(new DefaultComboBoxModel<String>(datosARellenar.getUnidades(seleccion1)));
                    }
                }                
            }            
        });
        

        
        CBsubUnidades.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    seleccion2 = CBsubUnidades.getSelectedIndex();
                }
                //System.out.println("\nSelección 2: " + seleccion2);
            }
            
        });

        JButton btnAceptar = new JButton("Convertir");
        
        btnAceptar.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                if(seleccion1 == 0) {
                    JOptionPane.showMessageDialog(null, "Necesitas escoger un tipo de conversión");
                }else if(seleccion1 == 1){
                    convertir.convierteMonedas(seleccion1, seleccion2);
                }else if(seleccion1 == 2){
                    convertir.convierteTemperatura(seleccion1, seleccion2);
                }else if(seleccion1 == 3){
                    convertir.convierteLongitud(seleccion1, seleccion2);
                }else if(seleccion1 == 4){
                    convertir.convierteMasa(seleccion1, seleccion2);
                }
            }
        });
        btnAceptar.setFont(new Font("Linux Biolinum G", Font.BOLD, 20));
        btnAceptar.setBounds(321, 332, 141, 40);
        contentPane.add(btnAceptar);
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
        btnSalir.setFont(new Font("Linux Biolinum G", Font.BOLD, 20));
        btnSalir.setBounds(321, 439, 141, 40);
        contentPane.add(btnSalir);        
        
        JLabel lblNewLabel_1 = new JLabel("Selecciona unidades");
        lblNewLabel_1.setFont(new Font("Linux Biolinum G", Font.ITALIC, 15));
        lblNewLabel_1.setBounds(330, 223, 123, 25);
        contentPane.add(lblNewLabel_1);        
    }
}      
    
    























