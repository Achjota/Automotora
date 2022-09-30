package Vista;

import javax.swing.*;
import javax.swing.text.InternationalFormatter;
import java.awt.*;
import java.awt.event.*;

public class VentanaRegistroCliente extends JFrame implements ActionListener{

private final Font fuenteTitulo;
private final Font fuenteTexto;
protected VentanaRegistroCliente(String nombre, int largoX, int largoY, Font fuenteTexto){
        super(nombre);
        super.setVisible(true);
        //Indica que hara al al intentar cerrar la ventana
        super.setDefaultCloseOperation(3);
        super.setSize(largoX,largoY);
        //Cerrar Ventana
        super.setLocationRelativeTo(null);
        //Evita expandir la pantalla
        super.setResizable(false);
        //Indica que se debe colocar las cordenadas de cada objeto garfico
        this.setLayout(null);
        this.fuenteTitulo = new Font("Comic Sans", 3,20);
        this.fuenteTexto = new Font("Comic Sans", 1, 14);
 }
 protected void generarJLabelEncabezado(JLabel label, String texto, int posicionX, int posicionY, int largoX, int
            largoY){
        label= new JLabel(texto);
        label.setBounds(posicionX, posicionY, largoX, largoY);
        label.setFont(this.fuenteTitulo);
        this.add(label);
 protected JButton generarBoton(JLabel label,String texto,int posicionX,int posicionY,int largoX,int largoY){
    JButton boton= new JButton(texto);
     boton.setBounds(posicionX,posicionY,largoX,largoY);
     boton.setFont(this.fuenteTexto);
     return boton;
 protected void generarJlabel;(JLabel label,String texto,int posicionX,int posicionY,int largoX,int largoY){
    label = new JLabel(texto);
    label.setBounds(posicionX,posicionY,largoX,largoY);
    label.setFont(this.fuenteTexto);
    this.add(label);}
 //Generar un campo de texto con un formato especifico
    protected JFormattedTextField generarJformattedTextField(InternationalFormatter formato,int posicionX, int posicionY,int largoX,int largoY){
    JFormattedTextField textField= new JFormattedTextField(formato);
    textField.setBounds(posicionX,posicionY,largoX,largoY);
    return textField;}
 //Generar un formato en este caso que el campo sea mayor o igual al minimo para ser valido
    protected InternationalFormatter generarFormato(int minimo){
    InternationalFormatter formato=new InternationalFormatter();
       formato.setMinimum(minimo);
       return formato;}
    protected InternationalFormatter generarFormato(int minimo,int maximo){
    InternationalFormatter formato=new InternationalFormatter();
    formato.setMaximum(maximo);
    return formato;
    }
 protected JTextField generarJtextfield(int posicionX, int posicionY, int largoX, int largoY){
    JTextField textField=new JTextField();
    textField.setBounds(posicionX,posicionY,largoX,largoY);
    return textField;
 }
protected JRadioButton generarJRadioButton(String texto,int posicionX,int posicionY,int largoX,int largoY){
   JRadioButton boton=new JRadioButton(texto);
   boton.setBounds(posicionX,posicionY,largoX,largoY);
   return boton;
}
protected JComboBox generarListaDesplegable(Object[] datosLista, int posicionX,int posicionY,int largoX,int largoY){
    JComboBox lista=new JComboBox<>(datosLista);
    generarListaDesplegable().setBounds(posicionX,posicionY,largoX,largoY);
    return lista;
}
@Override
public void actionPerformed(ActionEvent e) {
}
}