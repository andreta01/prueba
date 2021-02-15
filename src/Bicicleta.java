//define la clase Bicicleta como extensión de la clase Vehiculo.
public class Bicicleta  extends Vehiculo {

  public Bicicleta(String marca, int matricula){
    nombre(marca);
    numero(matricula);
    tipo();
    matricula(matricula);
  }
  @Override
  public void matricula(int matricula) {
    System.out.println("matricula:ABC"+matricula);
  }

  @Override
  public void nombre(String marca) {
    System.out.println("marca:"+marca);
  }

  @Override
  public void numero(int numero) {
    System.out.println("numero:"+numero);
  }

  @Override
  public void tipo() {
    System.out.println("tipo:pedal");
  }
}
