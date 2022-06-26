public class Arrays {
    public static void main(String args[]){
        // int[] marks = new int[3];
        //int marks[] = new int[3]; --> Valid

        int marks[] = {98, 97, 95}; //--> Defining Array 2

        marks[0] = 98; //phy
        marks[1] = 97; //chem
        marks[2] = 95; //eng

        System.out.println(marks);  //It will print garbage value -> from the original memory of code --> main function + hash code

        //So print marks with index
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
