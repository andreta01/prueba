import java.util.ArrayList;
import java.util.List;

public class main4 {


  public static void main(String[] args) {
    List<Integer> prueba = new ArrayList<Integer>();
    prueba.add(5);
    prueba.add(7);
    prueba.add(2);
    prueba.add(4);
    prueba.add(1);
    prueba.add(3);
    System.out.println(pruebe(prueba).toString());
  }

  public static List<Integer> pruebe(List<Integer> prueba){

    List<Integer> temp = new ArrayList<Integer>(prueba);
    List<Integer> temp1 = new ArrayList<Integer>(prueba);
    List<Integer> a = new ArrayList<Integer>();

    for (int i=0;i<temp1.size();i++){
      int sum =0;
      for (int j=0;j<temp.size();j++) {
          if (temp1.get(i) != temp.get(j)) {
            List<Integer> temp2 = new ArrayList<Integer>(prueba);
            int sum2 = 0;

            temp2.remove(temp1.get(i));
            temp2.remove(temp.get(j));
            sum = temp1.get(i) + temp.get(j);
            System.out.println(temp1.get(i)+"+"+temp.get(j)+"="+sum);
            for (int h = 0; h < temp2.size(); h++) {
              sum2 = sum2 + temp2.get(h);
              System.out.println(temp2.get(h)+"+");
            }
            System.out.println("="+sum2);
            System.out.println(sum > sum2);
            if (sum > sum2) {
              a.add(temp1.get(i));
              a.add(temp.get(j));
            }
          }
      }temp.remove(temp1.get(i));
    }return a;
  }
}
