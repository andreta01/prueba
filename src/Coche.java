//define la clase Coche como extensión de la clase Vehiculo.
public class Coche extends Vehiculo {

  public Coche(String marca, int matricula){
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
    System.out.println("Marca:"+marca);
  }

  @Override
  public void numero(int placa) {
    System.out.println("placa:"+placa);
  }

  @Override
  public void tipo() {
    System.out.println("tipo:motor");
  }
}
