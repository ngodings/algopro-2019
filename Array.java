import java.util.Scanner;
public class Array
{
 public static void main(String[] arguments) {
 
     int [][] array1 = {{1,2}, {3,4}}; //matriks 1
     int [][] array2 = {{6,7}, {8,9}}; //matriks 2
     //+++ array
     int [][] tambah = new int [2][2]; //menampung hasil penjumlahan
 
         //menampilkan matriks 1
         System.out.println("---------Matriks pertama--------");
         for (int i=0; i < array1.length; i++) {

          for(int j=0; j < array1[i].length; j++) {
           System.out.print(array1[i][j]+ " ");
          }
           System.out.println();
         }
       //menampilkan matriks 2
       System.out.println("---------Matriks kedua--------");

       for (int i=0; i < array2.length; i++) {

         for(int j=0; j < array2[i].length; j++) {
          System.out.print(array2[i][j]+ " ");
         }
          System.out.println();
        }
 
      System.out.println("Ditambah jadi: ");
       //menambahkan satu persatu
       for (int i=0; i < 2; i++) {

        for(int j=0; j < 2; j++) {

         tambah[i][j]=array1[i][j]+array2[i][j];
        }

       }

       //menampilkan hasil pertambahan
       for (int i=0; i < 2; i++) {

        for(int j=0; j < 2; j++) {
         System.out.print(+(tambah[i][j])+" ");
        }
         System.out.println(" ");
       }

  }

}
