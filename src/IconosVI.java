import javax.swing.JFrame;

public class IconosVI {

  public static void main (String [] args){

    JFrame ventana=new JFrame("V1");
    ventana.setSize(400, 400);

    Cuadricula casillas[]=new Cuadricula[20];

    casillas[1]=new Cuadricula(0,0);

    casillas[2]=new Cuadricula(60,60);
    casillas[3]=new Cuadricula(40,50);
    ventana.getContentPane().add(casillas[3]);


    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
  }


}
