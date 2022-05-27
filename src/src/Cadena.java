package src;

public class Cadena {

    public static void main(String[] args) {
        {//bloque 1
            String cadena = "Hola Mundo";
            System.out.println(cadena.charAt(5)); //M
        }

        {//bloque 2
            String cadena1 = "Luis";
            String cadena2 = "luis";
            //esto es para igualar cadenas de texto
            if (cadena1.equals(cadena2)) {
                System.out.println("tienen el mismo valor");

            } else {
                System.out.println("No tienen el mismo valor");

            }

        }

        {//bloque 3
            String cadena1 = "Luis";
            String cadena2 = "luis";
            //esto es para ignorar las letras mayusculas
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("tienen el mismo valor");

            } else {
                System.out.println("No tienen el mismo valor");

            }

        }

        {//bloque 4
            String cadena1 = "Luis".trim();
            String cadena2 = "luis           ".trim();//esto es para eliminar todos los espacios en blanco
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("tienen el mismo valor");

            } else {
                System.out.println("No tienen el mismo valor");

            }

        }

        {//bloque 5
            String cadena1 = "Luis".trim().toLowerCase();
            String cadena2 = "luis           ".trim().toLowerCase();//esto es para convertir todo en minuscula
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("tienen el mismo valor");

            } else {
                System.out.println("No tienen el mismo valor");

            }

        }

        {//bloque 6
            String cadena1 = "Luis".trim().toUpperCase();
            String cadena2 = "luis           ".trim().toUpperCase();//esto es para convertir todo en mayuscula
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("tienen el mismo valor");

            } else {
                System.out.println("No tienen el mismo valor");

            }

        }

        {//bloque 7
            String cadena = "Luis".trim().toLowerCase();
            int x = cadena.codePointAt(0); // esto es para imprimir el unicode en decimal de la letra en posicion 0

            System.out.println(x);

        }

        {//bloque 8
            String cadena = "Luis".trim().toLowerCase();
            int x = cadena.codePointAt(0); // esto es para imprimir el unicode en decimal de la letra en posicion 0

            System.out.println(x);
            System.out.println("108 \u20AC");

        }
    }

}
