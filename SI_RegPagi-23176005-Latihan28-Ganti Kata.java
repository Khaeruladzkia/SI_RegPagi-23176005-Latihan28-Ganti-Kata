/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 28 - Ganti Kata
 * Deskripsi Program    : Meminta pengguna untuk memasukkan sebuah kalimat, kemudian
                          kata yang ingin diganti dan kata penggantinya.
                          Program menggantikan kata lama dengan kata baru dalam kalimat
                          dan mencetak kalimat awal serta kalimat hasil penggantian kata tersebut.
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kalimat dari pengguna
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        // Input kata yang akan diganti dan kata penggantinya
        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine();
        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();

        // Mengganti kata
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        // Output hasil
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}
  
