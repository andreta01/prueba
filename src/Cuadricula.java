import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Pacheco
 */

class Cuadricula extends JComponent{

  int posicionx=0;
  int posiciony=0;


  public Cuadricula(int x,int y){

    posicionx=x;
    posiciony=y;

  }

  public void paintComponent (Graphics g){

    super.paintComponent(g);
    g.drawRect(posicionx,posiciony,60,60);

  }
}
