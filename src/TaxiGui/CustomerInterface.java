/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxiGui;

import java.awt.Color;
import java.awt.Container;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;

/**
 *
 * @author rabin
 */
public class CustomerInterface extends JFrame {
    public JLabel label_to,label_from;
    public JTextField client_to,client_from;
    
    
    
    public CustomerInterface(){
      setVisible(true);
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon("../../images/icon.png").getImage());
        
        Container b=this.getContentPane();
        b.setBackground(Color.red);
        
        //googlemapsapi
   
    }
}
