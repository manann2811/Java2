import java.util.*;
public class Strings {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        String name1 = "tony";
        String fName = "tony stark";
        String sentence = "my name is tony stark.";
        
        System.out.println(name1);
        System.out.println(fName);
        System.out.println(sentence);

        //concatenation
        String firstName = "Tony";
        String lastName = "Stark";

        String fullName = firstName + "@" + lastName; //@ will bw deleted after this line...
        System.out.println(fullName);

        System.out.println();
        //length()
        System.out.println(fullName.length());
        System.out.println();

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //compareTo()

        String s1 = "Tony";
        String s2 = "Tony2";

        //s1>s2 --> +ve value
        //s1=s2 --> 0 
        //s1<s2 --> -ve value

        //aahello and aabello --> it will check h and b so h is greater i.e aahello is greater than aabello

        if(s1.compareTo(s2)==0){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }

        //substring(beg index(inclusive), end index(exclusive))
        String sen = "my name is tony";
        String subsen = sen.substring(11, sen.length());
        System.out.println(subsen);
        sc.close();

        //STRINGS ARE IMMUTABLE..

        //parseInt --> converts a string to integer
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //toString
        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str1);
    }
}
