import java.util.*;
public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = sc.next();

        
        int i=0;
        for(int j=0; j<email.length(); j++){
            if(email.charAt(j)=='@'){
                i=j;
            }
        }
        
        
        String username = email.substring(0, i);

        System.out.println("Usename:");
        System.out.println(username);

        sc.close();
    }
}
