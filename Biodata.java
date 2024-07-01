import java.util.Scanner;
public class Biodata
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM = ");
        int nim = input.nextInt();
        System.out.print("Masukkan Nama = ");
        String nama = input.next();
        System.out.print("Masukkan Tempat Lahir = ");
        String tempatLahir = input.next();
        System.out.print("Masukkan Tanggal Lahir = ");
        String tanggalLahir = input.next();
        System.out.print("Masukkan Usia = ");
        int usia = input.nextInt();
        System.out.print("Masukkan No HP = ");
        long noHp = input.nextLong();
        System.out.print("Masukkan E-mail = ");
        String email = input.next();
        System.out.print("Masukkan Jurusan = ");
        String jurusan = input.next();
        System.out.print("Masukkan Alamat = ");
        String alamat = input.next();

        System.out.println("Biodata Anda adalah:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Usia: " + usia);
        System.out.println("No HP: " + noHp);
        System.out.println("E-mail: " + email);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}