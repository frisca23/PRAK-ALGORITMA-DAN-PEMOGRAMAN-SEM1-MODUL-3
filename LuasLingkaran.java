import java.util.Scanner;
public class LuasLingkaran
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran = ");
        r = input.nextDouble();
        luas = Phi*r*r;
        System.out.println("Luas lingkaran adalah = " + luas);
    }
}