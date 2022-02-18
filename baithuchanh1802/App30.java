import java.util.Scanner;

public class App30 {
    public static void main(String[] args) throws Exception {
        int n;
        int tong = 0;
        int so_du;
        Scanner abc = new Scanner(System.in);
        System.out.println("Nhap n :");
        n = abc.nextInt();
        while(n > 0 )
        {
            so_du = n % 10;
            tong += so_du;
            n /= 10;
        }
        while( n <= 0)
            {
                System.out.println("Moi nhap lai n");
            }
        
        
        System.out.println("tong la " + tong);
    

    }
    
}
