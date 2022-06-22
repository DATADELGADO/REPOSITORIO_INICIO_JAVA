package funciones;

public class CuentaMain {

    public static void main(String[] args) {
        Cuenta titular1 = new Cuenta("Miguel", 1000);
        Cuenta titular2 = new Cuenta("Samuel", 20000);
        Cuenta titular3 = new Cuenta("Abraham");

        titular1.ingresar(300);
        titular2.ingresar(10000);

        titular1.retirar(400);
        titular2.retirar(1000);
        titular3.retirar(400);

        System.out.println(titular1);
        System.out.println(titular2);
        System.out.println(titular3);

    }

}
