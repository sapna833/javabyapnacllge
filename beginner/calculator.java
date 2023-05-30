import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
       
         int sum=a+b;
        System.out.println(sum);
        int mul=a*b;
        System.out.println(mul);
        int div=a/b;
        System.out.println(div);
        int sub= a-b;
        System.out.println(sub);
        int modulus=a%b;
        System.out.println(modulus);
    }
}