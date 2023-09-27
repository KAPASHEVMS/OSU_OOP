public class Zadanie_1 {
    
    public static void main(String[] args) {
        int rows = 10;
        int i = 1, j, k, p = rows / 2;

        int arr[][] = new int[rows][rows];

        for(k = 1; k <= p; k++){
            for(j = k-1; j < rows - k + 1; j++){
                arr[k-1][j] = i++;
            }
            for(j = k; j < rows - k + 1; j++){
                arr[j][rows-k] = i++;
            }
            for(j = rows - k -1; j >= k - 1; --j){
                arr[rows - k][j] = i++;
            }
            for(j = rows - k - 1; j >= k; j--){
                arr[j][k-1] = i++;
            }
        }

        if(rows % 2 == 1) {
            arr[p][p] = (int) Math.pow(rows, 2);
        }
        out(arr, rows);
    }
    public static void out(int[][] arr, int rows) {
        int i, j;
        for(i = 0; i < rows; i++) {
            for(j = 0; j < rows; j++) {
                System.out.print(arr[i][j] + "\t");
                if (j == rows - 1) {
                    System.out.println();
                }
            }
        }
    }
}
