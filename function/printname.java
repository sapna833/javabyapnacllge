import java.util.*;
public class printname  {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintMyName (name);                      ///call kra funchtion
    }

}
