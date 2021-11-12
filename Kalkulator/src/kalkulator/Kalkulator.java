package kalkulator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kalkulator {

    public static void main(String[] args) throws IOException {
        BufferedReader ok = new BufferedReader (new InputStreamReader (System.in));
    
    double jumlah, kurang, bagi, kali;
    String ulang = "ya";
    while (ulang.equals("ya")){
        
        System.out.println("\t\t     KALKULATOR"
                +  "\n********************************************************************"
                +  "\n Silahkan pilih Bangun Ruang yang ada dibawah ini :"
                +  "\n 1. Penjumlahan"
                +  "\n 2. Pengurangan"
                +  "\n 3. Pembagian"
                +  "\n 4. Perkalian"
                +  "\n********************************************************************");
        
            System.out.print("\nMasukkan nomer dari pilihan diatas :");
            String input = ok.readLine();
            int kalkulator = Integer.parseInt(input);
            System.out.println();
         
         switch (kalkulator) {
            case 1:
                    System.out.print("Masukan Angka Pertama : ");
                    String angka1 = ok.readLine();
                    int a = Integer.parseInt(angka1);
                    System.out.print("Masukan Angka Kedua : ");
                    String angka2 = ok.readLine();
                    int b = Integer.parseInt(angka2);
                    System.out.println ();
                    jumlah=a+b;
                    System.out.println ("Hasil Penjumlahan = " + jumlah);
            break;
        
            case 2:
                    System.out.print("Masukan Angka Pertama : ");
                    String angka3 = ok.readLine();
                    int c = Integer.parseInt(angka3);
                    System.out.print("Masukan Angka Kedua : ");
                    String angka4 = ok.readLine();
                    int d = Integer.parseInt(angka4);
                    System.out.println ();
                    kurang=c-d;
                    System.out.println ("Hasil Pengurangan = " + kurang);
            break;
        
            case 3:
                    System.out.print("Masukan Angka Pertama : ");
                    String angka5 = ok.readLine();
                    int e = Integer.parseInt(angka5);
                    System.out.print("Masukan Angka Kedua : ");
                    String angka6 = ok.readLine();
                    int f = Integer.parseInt(angka6);
                    System.out.println ();
                    bagi=e/f;
                    System.out.println ("Hasil Pembagian = " + bagi);
            break;
            
            case 4:
                    System.out.print("Masukan Angka Pertama : ");
                    String angka7 = ok.readLine();
                    int g = Integer.parseInt(angka7);
                    System.out.print("Masukan Angka Kedua : ");
                    String angka8 = ok.readLine();
                    int h = Integer.parseInt(angka8);
                    System.out.println ();
                    kali=g*h;
                    System.out.println ("Hasil Perkalian = " + kali);
            break;
            
         }
         
         System.out.print("Ingin mengulang (ya/tidak)?");
            ulang = ok.readLine();
            
        System.out.println("********************************************************************");
        System.out.println("ヽ(^o^)丿");
        System.out.println("********************************************************************");
      }
    }   
}
  
         
         



