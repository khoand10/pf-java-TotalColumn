import java.util.Scanner;

public class TotalColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Height;
        int Width;
        int totalColum = 0;
        int colum;
        System.out.println("Enter height :");
        Height = sc.nextInt();
        System.out.println("Enter width :");
        Width = sc.nextInt();
        double[][] array = new double[Height][Width];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element int row :" + (i + 1));
                array[i][j] = sc.nextDouble();
            }
            System.out.println("\n");
        }
        System.out.println("Enter colum :");
        colum = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            totalColum += array[i][colum - 1];
        }
        System.out.println("Total element in colum :" + colum + "= " + totalColum);
    }
}
