import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) throws Exception {
        double A, B, C, delta;
        double x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he  so A :");
        A = sc.nextDouble();
        System.out.println("Nhap vao he  so B :");
        B = sc.nextDouble();
        System.out.println("Nhap vao he  so C :");
        C = sc.nextDouble();
        delta = B*B - 4*A*C;

        if(A == 0)
        {
           x1 = x2 = -C/B; 
        }
        else
        {
            if(delta > 0)
            {
                x1 = (-B + Math.sqrt(delta))/(2*A);
                x2 = (-B - Math.sqrt(delta))/(2*A);

            }
            else if(delta == 0){
                x1 = x2 = -B/(2*A);

            }
            else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
    }
}
