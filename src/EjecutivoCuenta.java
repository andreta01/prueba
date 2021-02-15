public class EjecutivoCuenta implements IAprobador {

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
      if (monto <= 10000){
        System.out.println("Lo maneja Ejecutivo de Cuenta");
      } else {
        next.solicitudPrestamo(monto);
      }
  }
}
