
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
public class Keg2 {

    static void hitung() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Faktorial : ");
        int n = sc.nextInt();
        int hasil = faktorial(n);
        System.out.println("Faktorial " + n + " = " + hasil);
    }

    static int faktorial(int bil) {
        if (bil == 0) {
            return 1;
        } else if (bil > 0) {
            int a = bil * faktorial(bil - 1);
            return a;
        } else {
            int a = bil * faktorial(bil + 1);
            return a;
        }
    }

    static void ulang() {
        String jawab;
        Scanner sc = new Scanner(System.in);
        do {
            hitung();
            System.out.print("Ingin Mengulang? y/n : ");
            jawab = sc.next();
        } while (jawab.equals("Y") || jawab.equals("y"));
    }

    public static void main(String[] args) {
        ulang();
    }
}
