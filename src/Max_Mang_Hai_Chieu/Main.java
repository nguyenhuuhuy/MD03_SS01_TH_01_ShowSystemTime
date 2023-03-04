package Max_Mang_Hai_Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        x = sc.nextInt();
        System.out.println("Nhập số cột: ");
        y = sc.nextInt();
        int[][] array =new int[x][y];
        System.out.println("Nhập các phần tử: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("array[" + i + "]["+ j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
