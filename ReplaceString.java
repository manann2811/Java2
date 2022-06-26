import java.util.*;
public class ReplaceString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = sc.next();

        String replace = "";

        for(int i=0; i<original.length(); i++){
            if(original.charAt(i)=='e'){
                replace += 'i';
            }
            else{
                replace += original.charAt(i);
            }
        }
        System.out.println(replace);
        sc.close();
    }
}
