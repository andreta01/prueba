public class Director implements IAprobador {

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
    if (monto > 100000 ){
      System.out.println("Lo maneja Director");
    } else {
      next.solicitudPrestamo(monto);
    }
  }

}
