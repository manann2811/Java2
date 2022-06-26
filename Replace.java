import java.util.*;
public class Replace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.next());
        
        System.out.println(sb);
        
        StringBuilder replace = new StringBuilder(sb);
        for(int i=0; i<replace.length(); i++){
            if(replace.charAt(i) == 'e'){
                replace.setCharAt(i, 'i');
            }
        }
        
        System.out.println(replace);
        sc.close();
    }
}
