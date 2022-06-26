import java.util.*;
public class UsernameSb{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the email: ");
        StringBuilder email = new StringBuilder(sc.next());
        
        
        StringBuilder username = new StringBuilder(email);
        for(int i=0; i<username.length(); i++){
            if(username.charAt(i) == '@'){
                username.delete(i, username.length());        
            }
        }
        
        System.out.println("Username is: " + username);
        sc.close();
    }
}
