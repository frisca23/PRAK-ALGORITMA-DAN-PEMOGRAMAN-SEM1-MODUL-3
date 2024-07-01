import java.util.Scanner;
public class Bio
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM = ");
        nim = input.nextInt();
        System.out.print("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Tgl Lahir = ");
        tempattglLahir = input.next();
        System.out.print("Masukkan Usia = ");
        usia = input.nextInt();
        System.out.print("Masukkan No HP = ");
        noHp = input.nextLine();
        System.out.print("Masukkan E-mail = ");
        email = input.nextLine();
        System.out.print("Masukkan Jurusan = ");
        jurusan = input.nextLine();
        System.out.print("Masukkan Alamat = ");
        alamat = input.nextLine();

        System.out.println("Biodata Anda adalah:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tempat Tgl Lahir: " + tempattglLahir);
        System.out.println("Usia: " + usia);
        System.out.println("No HP: " + noHp);
        System.out.println("E-mail: " + email);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}