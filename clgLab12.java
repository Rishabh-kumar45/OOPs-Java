import java.util.*;
public class clgLab12{
 public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter A");
                int a = sc.nextInt();
                System.out.println("Enter B");
                int b = sc.nextInt();
                System.out.println("Enter C");
                int c = sc.nextInt();

                if(a>b && a>c){
                        System.out.println("A is largest");
                }

                if(b>a && b>c){
                        System.out.println("B is largest");
                }

                if(c>a && c>b){
                        System.out.println("C is largest");
                }
        }
}