import java.io.*;

public class Main {


    static int diagonalDifference(int[][] arr) {


        int tamanoMatriz = arr.length;
        int resultadoDerecha = 0;
        int resultadoIzquierda = 0;

        for(int i = 0; i < tamanoMatriz; i++ ){
            resultadoDerecha = resultadoDerecha + arr[i][i];
            resultadoIzquierda = resultadoIzquierda + arr[i][                                        (tamanoMatriz-1 -i)];
        }

        int restaAbsoluta = Math.abs(resultadoDerecha-resultadoIzquierda);

        return restaAbsoluta;
   }


     private static final BufferedReader bufferedReader =
                                            new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(bufferedReader.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            String[] arrRowItems = bufferedReader.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();

        bufferedWriter.close();

        bufferedReader.close();
    }
}
