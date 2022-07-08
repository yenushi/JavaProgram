package array;
import java.util.*; // import for accessing ArrayList Class
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();// create a string type array list

        // Add items in to the array list
        nameList.add("Indu");
        nameList.add("dini");
        nameList.add("Cham");
        nameList.add("athka");
        nameList.add("Thennakoon");

        //display the size of array
        System.out.println("The size of the array list: "+ nameList.size());

        //display the content of the array list
        System.out.println("Names: " + nameList);


    }
}
