
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Keg1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        int n = sc.nextInt();
        int fib[] = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
