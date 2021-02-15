//define la clase Estudiante como extensión de la clase Persona.
public class Estudiante extends Persona {

  public Estudiante(String nombre, int numero){
    profesion();
    nombre(nombre);
    numero(numero);
    vehiculo();
  }
  @Override
  public void profesion() {
    System.out.println("profesion:Estudiante");
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
    Vehiculo vehiculo = new Bicicleta("Venzo", 6575);
  }
}
