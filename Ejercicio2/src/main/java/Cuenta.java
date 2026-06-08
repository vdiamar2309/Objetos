public class Cuenta {
    private double efectivo;
    private double dineroCuenta;
    private int numeroReintegros;

    public Cuenta() {
        this.efectivo = 200;
        dineroCuenta=0;
        numeroReintegros=0;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getDineroCuenta() {
        return dineroCuenta;
    }

    public void setDineroCuenta(double dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }

    public int getNumeroReintegros() {
        return numeroReintegros;
    }

    public void setNumeroReintegros(int numeroReintegros) {
        this.numeroReintegros = numeroReintegros;
    }

    public void retirar(int cantidad) throws CuentaException {
        if (dineroCuenta<cantidad) {
            throw new CuentaException("No tienes dinero en la cuenta");
        }
        dineroCuenta-=cantidad;
        efectivo+=cantidad;
        numeroReintegros++;
    }
    public void ingresar(int cantidad) throws CuentaException{
        if (efectivo<cantidad) {
            throw new CuentaException("No tienes suficiente dinero en efectivo");
        }
    efectivo-=cantidad;
        dineroCuenta+=cantidad;
        numeroReintegros++;
    }
    public void consultar(){
        System.out.println("Numero de reintegros "+numeroReintegros);
        System.out.println("Dinero en efectivo "+efectivo);
        System.out.println("Dinero en la cuenta "+dineroCuenta);
    }
}
