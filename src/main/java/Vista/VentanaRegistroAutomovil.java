package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaRegistroAutomovil extends JFrame implements ActionListener{

    private final Font fuenteTitulo;
    private final Font fuenteTexto;
    protected VentanaRegistroAutomovil(String nombre, int largoX, int largoY, Font fuenteTexto){
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
