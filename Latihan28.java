/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Ganti Kata
 */

package Pertemuan6;
import java.util.Scanner;

public class Latihan28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine(); //Penjelasan(1)
        
        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine(); //Penjelasan(2)

        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine(); //Penjelasan(3)

        String kalimatBaru = kalimat.replace(kataLama, kataBaru); //Penjelasan(4)
        

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat); //Penjelasan(5)
        System.out.println("Kalimat baru : " + kalimatBaru); //Penjelasan(6)
        
        scanner.close();
    }
}

/*PENJELASAN
  (1) Program meminta pengguna untuk memasukkan kalimat sebagai input awal yang akan diproses.
      Kalimat ini nantinya akan menjadi kalimat yang akan diganti kata-katanya sesuai permintaan user.
  (2) Program kemudian meminta pengguna untuk memasukkan kata yang ingin diganti dalam kalimat awal.
      Kata ini disimpan dalam variabel `kataLama` yang akan dicari di dalam kalimat.
  (3) Setelah itu, pengguna diminta untuk memasukkan kata pengganti yang diinginkan. Kata baru ini
      akan menggantikan setiap kemunculan `kataLama` di dalam kalimat awal. 
  (4) Metode replace() digunakan untuk mengganti semua kemunculan `kataLama` dengan `kataBaru` dalam kalimat.
      Hasil dari penggantian ini disimpan dalam variabel `kalimatBaru`, yang merupakan hasil akhir.
  (5) Program kemudian mencetak kalimat awal yang belum mengalami perubahan.
  (6) Terakhir, program mencetak `kalimatBaru` yang sudah menggantikan semua `kataLama` dengan `kataBaru`.
      Dengan ini, pengguna dapat melihat perbedaan antara kalimat awal dan kalimat baru hasil penggantian kata.
*/

