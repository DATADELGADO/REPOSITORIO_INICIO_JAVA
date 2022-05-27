package matriz;

public class Matriz1 {

    public static void main(String[] args) {
        //declaro una matriz
        //int[][] m;
        int[][] m = new int[3][2];
        m[0][0] = 5;
        m[0][1] = 6;
        m[1][0] = 7;
        m[1][1] = 8;
        m[2][0] = 9;
        m[2][1] = 10;
//int[][] m = { {5,6}{7,8}{9,10}  }; esto es hacerlo de otra forma
        for (int f = 0; f < m.length; f++) { //con esto se hace las filas
            for (int c = 0; c < m[0].length; c++) { //con este metodo se sabe cuantas columnas tiene esa fila
                System.out.print("(" + f + "," + c + ")=" + m[f][c]);

                System.out.println();
            }

        }

    }
}
