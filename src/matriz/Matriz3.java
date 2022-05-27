package matriz;

public class Matriz3 {

    public static void main(String[] args) {
        int[][] x = {{1}, {1, 2, 3}, {1, 2, 3, 4, 5}};
        for (int f = 0; f < x.length; f++) { //con esto se hace las filas
            for (int c = 0; c < x[f].length; c++) { //con este metodo se sabe cuantas columnas tiene esa fila
                System.out.print(x[f][c]+" ");

            }
            System.out.println();
        }
    }

}
