import java.util.Scanner;
public class Modif1 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int B, C, D, A;
        
        System.out.print("Masukkan nilai B = ");
        B = input.nextInt();
        System.out.print("Masukkan nilai C = ");
        C = input.nextInt();
        System.out.print("Masukkan nilai D = ");
        D = input.nextInt();
        
        A = B + C * D;
        System.out.println("Hasil A = " + A);
    }
}