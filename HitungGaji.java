import java.util.Scanner;
public class HitungGaji 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        double tunjanganKinerja = 0.2 * gajiPokok;
        double tunjanganLain = 0.1 * tunjanganKinerja;

        double totalGaji = gajiPokok + tunjanganKinerja + tunjanganLain;

        System.out.println("Total gaji adalah: " + totalGaji);
    }
}