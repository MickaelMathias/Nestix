package app;

import javax.swing.*;  
import java.awt.event.*;  
public class C_OPTIONPANE extends WindowAdapter{  

public void windowClosing(WindowEvent e, JButton mon_bouton) {  
int a = JOptionPane.showConfirmDialog(mon_bouton,"Êtes vous sûrs?");  
    if(a==JOptionPane.YES_OPTION){  

        
    }  
}  
public static void main(String[] args) {  
}     
} 