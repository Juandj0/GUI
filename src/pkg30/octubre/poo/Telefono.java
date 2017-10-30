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
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame( );
        Image icon= Toolkit.getDefaultToolkit().getImage("descarga.png");
        frame.setIconImage(icon);
        frame.setVisible(true);
        frame.setSize(new Dimension(300,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //Cerrando la ventana
    JPanel teclado= new JPanel(new GridLayout(4,3));
    for(int i =1; i<=9;i++  ){
    teclado.add(new Button(""+i));
    
    
    
    
    } 
    teclado.add(new Button(" "));
        teclado.add(new Button("0 "));
            teclado.add(new Button(" *"));
            frame.add(teclado, BorderLayout.CENTER);
        JPanel sur= new JPanel(new FlowLayout());
        JLabel numero= new JLabel("Escribe tu numero compa");
        sur.add(numero);
        frame.add(sur, BorderLayout.SOUTH);
        
                }
    
}
