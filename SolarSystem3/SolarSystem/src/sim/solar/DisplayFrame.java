package sim.solar;

import javax.swing.JFrame;

public class DisplayFrame extends JFrame {
  private static final long serialVersionUID = 1L;
  public void Activate ()  {
  
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    Simulation sim = new Simulation(); 
    getContentPane().add(sim); 
     
    pack();
    setVisible(true);
  }
}
