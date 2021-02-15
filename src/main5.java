import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class main5 {

  public static void main(String[] args) {
    int count = 0;
    int rowLen = 6 + 1, colLen = 6 + 1;
    List<Integer> horizontalList = new ArrayList<Integer>();
    List<Integer> verticalList = new ArrayList<Integer>();
    horizontalList.add(2);
    horizontalList.add(6);
    verticalList.add(4);
    verticalList.add(5);

    Integer[][] matrix = new Integer[rowLen][colLen];
    for (int i = 0; i < rowLen; i++) {
      for (int j = 0; j < colLen; j++) {
        matrix[i][j] = 1*1*1;
      }
    }

    for (int i = 0; i < horizontalList.size(); i++)
      newVolumenHorzontal(colLen, horizontalList.get(i), matrix);
    for (int i = 0; i < verticalList.size(); i++)
      newVolumenVertical(rowLen,verticalList.get(i), matrix);

    volMayor(rowLen, colLen, matrix);

  }

  private static void newVolumenHorzontal( int colLen, int horizontal, Integer[][] matrix) {
    for (int i = 0; i < colLen; i++) {

      matrix[horizontal -1][i] = matrix[horizontal -1][(i)]*2*1;
      matrix[horizontal][i] = matrix[horizontal][(i)]*0;

    }
  }

  private static void newVolumenVertical(int rowLen,  int vertical, Integer[][] matrix) {
    for (int i = 0; i < rowLen; i++) {
        if(matrix[i][(vertical - 1)]!=0) {
          matrix[i][(vertical - 1)] = matrix[i][(vertical - 1)] * 2 * 1;
          matrix[i][vertical] = matrix[i][vertical] * 0;
        }else{
          matrix[i][(vertical - 2)] = matrix[i][(vertical - 2)] * 2 * 1;
          matrix[i][vertical] = matrix[i][vertical] * 0;
        }

    }
  }
  private static void newVolumen(int rowLen,  int vertical, Integer[][] matrix) {
    for (int i = 0; i < rowLen; i++) {
      if (matrix[i][(vertical -1)]!=0){
        matrix[i][(vertical - 1)] = matrix[i][(vertical - 1)] * 2 * 1;
        matrix[i][vertical] = matrix[i][vertical] * 0;
      }else{
        matrix[i][(vertical - 2)] = matrix[i][(vertical - 2)] * 2 * 1;
        matrix[i][vertical] = matrix[i][vertical] * 0;
      }
    }
  }


  private static void volMayor(int rowLen, int colLen, Integer[][] matrix) {
    int numeroActual =0;
    int mayor = 0;
    String cadena ="";
    for (int i = 0; i < rowLen; i++) {
      for (int j = 0; j < colLen; j++) {
        cadena = cadena+ " "+matrix[i][j];
        numeroActual= matrix[i][j];
        if (numeroActual > mayor)
          mayor = numeroActual;

      }cadena = cadena+ "\n";
    }
   // JOptionPane.showMessageDialog(null,cadena);
    System.out.println(cadena);
  }

}
