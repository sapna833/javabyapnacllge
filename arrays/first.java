import java.util.*;
public class first {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
    // int[] marks = new int[3];
    // marks[0] =97;
    // marks[1] =89;
    // marks[2] = 67;
    // second wAY TO DECLARE ARRAY.........
    // int marks[] ={97,98,95};
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    int numbers[]= new int[size];
//input
for(int i=0;i<size;i++){
    numbers[i] = sc.nextInt();
}


    //output
    for(int i=0;i<size;i++){
        System.out.println(numbers[i]);

    }
}
}