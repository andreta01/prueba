public class GerenteEjecutivo implements IAprobador {

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
    if (monto > 50000 && monto <= 100000 ){
      System.out.println("Lo maneja Gerente Ejecutivo");
    } else {
      next.solicitudPrestamo(monto);
    }
  }

}
