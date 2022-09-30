package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaBusquedaAutomovil {

    public class VentanaBusquedaAutomovil extends JFrame implements ActionListener{
        private final Font fuenteTitulo;
        private final Font fuenteTexto;
        protected Ventana(String nombre, int largoX, int largoY){
            super(nombre);
            super.setVisible(true);
//Indica que hará al intentar cerrar la ventana, (1) No hace nada al cerrar, (2) Ocultar al cerrar, (3) Salir al
            cerrar
            super.setDefaultCloseOperation(3);
            super.setSize(largoX, largoY);
//Centrar la ventana
            super.setLocationRelativeTo(null);
//Evita expandir la pantalla
            super.setResizable(false);
//Indica que se debe colocar las coordenadas de cada objeto gráfico
            this.setLayout(null);
            this.fuenteTitulo = new Font("Calibri", 3, 20);
            this.fuenteTexto = new Font("Calibri", 1, 14);
        }


}