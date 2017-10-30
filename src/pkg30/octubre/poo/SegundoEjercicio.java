/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.octubre.poo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Estudiante
 */
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame( );
        Image icon= Toolkit.getDefaultToolkit().getImage("descarga.png");
        frame.setIconImage(icon);
        frame.setVisible(true);
        frame.setSize(new Dimension(300,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Cerrando la ventana
        frame.setTitle("Adivina el jugador");
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBackground(Color.white);
        frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height );
        //lo ubica la locacion en la mitad de pantalla
       //frame.setLayout(new BorderLayout());
       

 frame.setLayout(new GridLayout(1,4));
        
        //Organiza los componentes
        //Gridlayout lo organiza como una matriz, primer numero de filas segundo numero de columnas
        JPanel panel= (JPanel) frame.getContentPane();
        //le asigna el panel al j.frame
     
        
        //agregando botones
        JButton button1= new JButton();
        button1.setText("Soy un boton");
        button1.setSize(new Dimension(5,5));
        button1.setLocation(10, 30);
        frame.add(button1);
        button1.setBackground(Color.blue);
        
         JButton button2= new JButton();
        button2.setText("Soy el boton 2");
          button2.setSize(new Dimension(20,5));
        button2.setLocation(30, 30);
        button2.setBackground(Color.red);
        frame.add(button2);
         
        JButton button3= new JButton();
        button3.setText("Bton 3 papu");
        frame.add(button3);
        
        JLabel label=new JLabel("Type your id ");
        frame.add(label);
        
        
    }
    
}
