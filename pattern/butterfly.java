import java.util.*;
public class butterfly {
    public static void main(String args[]){
        int n=6;
        //outerloop and upperhalf
for(int i=1; i<=n;i++){
    //first part star left wala
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    //space
    int space=2*(n-i);
    for(int j=1;j<=space;j++){
        System.out.print(" ");
    }
    //second part star left wala
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
System.out.println();
}
       //outerloop and lowerhalf..........
       for(int i=n; i>=1;i--){
        //first part star left wala
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space in middle.......................
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //second part star left wala.........................
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    System.out.println();
    }
    


}}