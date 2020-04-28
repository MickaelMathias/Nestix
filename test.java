import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class JFrameExample
{   
    private JFrame frame;
    private JButton button;
    private JButton button_confirm;
    private JTextField tfield;
    private String nameTField;
    private int count;
    private ArrayList <JTextField> tab;
    private String text;
    private JPanel panel = new JPanel();

    public JFrameExample()
    {
        nameTField = "tField";
        count = 0;
        
    }

    private void displayGUI()
    {
        frame = new JFrame("JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(10, 1, 2, 2));
        button_confirm = new JButton("Valider");
        button = new JButton("Add JTextField");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                tfield = new JTextField();
                tfield.setName(nameTField + count);
                count++;
                frame.add(tfield);
                frame.add(button_confirm);
                frame.revalidate();  // For JDK 1.7 or above.
                //frame.getContentPane().revalidate(); // For JDK 1.6 or below.
                frame.repaint();
            }
            
        });
        
        button_confirm.addActionListener(new ActionListener()
        {
            	
        	public void actionPerformed(ActionEvent ae) 
        	{
        		for (int i=0; i<count; i++) {
        			System.out.println(tab.get(i).getText());
        			
        		}
        		
        	}
        });
            
        frame.add(button);
        frame.add(button_confirm); 
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new JFrameExample().displayGUI();
            }
        });
        
        
    }
}
