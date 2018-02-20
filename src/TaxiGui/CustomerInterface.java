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
    public JLabel lblUsername, lblContactno, lblfrom, lblto;
    public JTextField txtUsername, txtContactno, txtfrom, txtto;
    public JButton btnSearch;
    
    
    
    public CustomerInterface(){
//      setVisible(true);
//        setSize(400,400);
//        setLocation(100,100);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setResizable(true);
//        setExtendedState(MAXIMIZED_BOTH);
//        setIconImage(new ImageIcon("../../images/icon.png").getImage());
//        
//        Container b=this.getContentPane();
//        b.setBackground(Color.red);
        
        lblUsername = new JLabel("Username:");
        add(lblUsername).setBounds(20, 50, 100, 25);
        
         lblContactno = new JLabel("Contact no.:");
        
        add(lblContactno).setBounds(20, 100, 100, 25);
        
         lblfrom = new JLabel("Current Address:");
        
        add(lblfrom).setBounds(20, 150, 100, 25);
        
         lblto = new JLabel("Destination:");
        
        add(lblto).setBounds(20, 200, 100, 25);
        
        
        
        txtUsername = new JTextField();
        add(txtUsername).setBounds(150, 50, 220, 25);
        
        txtContactno = new JTextField();
        add(txtContactno).setBounds(150, 100, 220, 25);
        
        txtfrom = new JTextField();
        add(txtfrom).setBounds(150, 150, 220, 25);
        
        txtto = new JTextField();
        add(txtto).setBounds(150, 200, 220, 25);
//        
        btnSearch = new JButton("Search for Taxi");
        add(btnSearch).setBounds(20, 250, 180, 25);
//        btnSearch.addActionListener(this);
        
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        
    }
}
