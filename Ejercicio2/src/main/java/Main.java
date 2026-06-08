import util.MiEntradaSalida;

public class Main {

    public static String ayuda = "1 es retirar dinero\n" +
            "2 es ingresar dinero\n" +
            "3 es consultar la cuenta bancaria\n";

    static void main(String[] args) {
        Cuenta c = new Cuenta();

        boolean bucle = true;
        while (bucle) {
            System.out.println(ayuda);
            int dinero = 0;
            int eleccion = MiEntradaSalida.solicitarEnteroPositivo("Elige una opcion");
            try {
                switch (eleccion) {
                    case 1:
                        dinero = MiEntradaSalida.solicitarEntero("Cuanto dinero quiere retirar?");
                        c.retirar(dinero);
                        break;
                    case 2:
                        dinero = MiEntradaSalida.solicitarEntero("Cuanto dinero quiere ingresar?");
                        c.ingresar(dinero);
                        break;
                    case 3:
                        c.consultar();
                        System.out.println("");
                        break;
                    case 4:
                        bucle = false;
                        break;
                }
            } catch (CuentaException e) {
                System.out.print(e.getMessage());
                System.out.println("");
            }
        }
    }
}
