public class Banco implements IAprobador {

  private IAprobador next;

  @Override
  public void setNext(IAprobador aprobador) {
    next = aprobador;
  }

  @Override
  public IAprobador getNext() {
    return next;
  }

  @Override
  public void solicitudPrestamo(int monto) {
    EjecutivoCuenta ejecutivoCuenta = new EjecutivoCuenta();
    this.setNext(ejecutivoCuenta);

    LiderEjecutivo liderEjecutivo = new LiderEjecutivo();
    ejecutivoCuenta.setNext(liderEjecutivo);

    GerenteEjecutivo gerenteEjecutivo = new GerenteEjecutivo();
    liderEjecutivo.setNext(gerenteEjecutivo);

    Director director = new Director();
    gerenteEjecutivo.setNext(director);

    next.solicitudPrestamo(monto);
  }
}
