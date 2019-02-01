package Chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the array size n:");
        int n = input.nextInt();
        System.out.print("enter the array tow by row:");
        int[][] matrix = new int[n][n];
        for(int i = 0;i < n;i++)
            for(int j = 0;j < n;j++){
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
        System.out.println();
    int rowSum = sumRow(matrix[0]);
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    for (int i = 1; i < n; i++) {
        if (rowSum < sumRow(matrix[i])) {
            rowSum = sumRow(matrix[i]);
            list.clear();
            list.add(i);
        }
        else if (rowSum == sumRow(matrix[i])) {
            list.add(i);
        }
    }
    System.out.print("The largest row index: ");
    for (int i = 0; i < list.size() - 1; i++)
            System.out.print(list.get(i) + ", ");
    System.out.print(list.get(list.size() - 1));
    // Check columns
    int columnSum = sumColumn(matrix, 0);
    list.clear();
    list.add(0);
    for (int i = 1; i < n; i++) {
        if (columnSum < sumColumn(matrix, i)) {
            columnSum = sumColumn(matrix, i);
            list.clear();
            list.add(i);
        }
        else if (columnSum == sumColumn(matrix, i)) {
            list.add(i);
        }
    }
    System.out.print("\nThe largest column index: ");
    for (int i = 0; i < list.size() - 1; i++)
            System.out.print(list.get(i) + ", ");
    System.out.print(list.get(list.size() - 1));
}
    public static int sumRow(int row[]) {
        int sum = 0;
        for (int i = 0; i < row.length; i++)
            sum += row[i];
        return sum;
    }
    public static int sumColumn(int matrix[][], int column) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
            sum += matrix[i][column];
        return sum;
    }
}
