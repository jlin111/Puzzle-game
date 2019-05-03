package puzzle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Jay Lean
 */
public class StartingMenu extends JFrame{
    
    private JPanel pannelloPrincipale, pannelloTitolo, pannelloCentrale;
    private JLabel titolo;
    private JButton play_button, quit_button;
    private JComboBox imageList;
    private String[] imageString = {"thanos.jpg", "il_maestro.jpg", "ninna_nanna.jpg"};
    
    public StartingMenu(){
        pannelloPrincipale = new JPanel(new GridLayout(2,1));
        pannelloPrincipale.setBackground(Color.WHITE);
        pannelloTitolo = new JPanel();       
        pannelloTitolo.setBackground(Color.WHITE);
        pannelloCentrale = new JPanel(new GridLayout(3,1));
        pannelloCentrale.setLayout(new BoxLayout(pannelloCentrale, BoxLayout.PAGE_AXIS));
        pannelloCentrale.setBackground(Color.WHITE);
        titolo = new JLabel("Puzzle Game"); 
        titolo.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 25)); 
        titolo.setForeground(Color.ORANGE);
        
        imageList = new JComboBox(imageString);
        //imageList.setPreferredSize(new Dimension(1,2));
                
        play_button = new JButton("PLAY");
        quit_button = new JButton("QUIT");
        play_button.addActionListener(play_action);
        quit_button.addActionListener(quit_action);
        
            
        pannelloTitolo.add(titolo);
        pannelloCentrale.add(imageList);
        pannelloCentrale.add(play_button);
        pannelloCentrale.add(quit_button);
        pannelloPrincipale.add(pannelloTitolo, BorderLayout.NORTH);
        pannelloPrincipale.add(pannelloCentrale, BorderLayout.CENTER);
        add(pannelloPrincipale);

        setSize(400,600);
        setTitle("Puzzle Game");
        setResizable(false);      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
           
             ActionListener play_action = new ActionListener() {
                
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            
        }
        };
      
private JFrame frame;
       
            ActionListener quit_action = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            frame = new JFrame();       
        if(JOptionPane.showConfirmDialog(frame, "Confermi di voler uscire? ", "Puzzle", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) 
            System.exit(0);
        }
                
            };
  
}
