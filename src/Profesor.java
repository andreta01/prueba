//define la clase Profesor como extensión de la clase Persona.
public class Profesor extends Persona {

  public Profesor(String nombre, int numero){
    nombre(nombre);
    numero(numero);
    profesion();
    vehiculo();
  }

  @Override
  public void profesion() {
    System.out.println("profesion:Profesor");
  }

  @Override
  public void nombre(String nombre) {
    System.out.println("nombre:"+nombre);
  }

  @Override
  public void numero(int numero) {
    System.out.println("numero:"+numero);
  }

  private void vehiculo() {
    Vehiculo vehiculo = new Coche("Mazda", 2345);
  }

}
