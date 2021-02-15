//define que la clase Vehiculo implementa a dos interfaces, la interfaz Actor
// y la interfaz ObjetoInerte, es decir, que un vehículo es a la vez Actor y ObjetoInerte.
public abstract class Vehiculo implements Actor, ObjetoInerte {

  public abstract void matricula(int num) ;
}
