/*author:Tendai K Nyevedzanai
 * a program that checks if the shop has the products and prints out the total of all present products in the shop
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Bill{
    public static void main(String[] args) {
        ArrayList<String> storeGroceryList= new ArrayList<>();//arrayList to add the list of items in the store
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the name of the products file:");
        String filename=scanner.nextLine();//to store the file name
        System.out.println("Enter the shopping list:");
        String clientList=scanner.nextLine();//to store the list entered in the console
        try{
            File file=new File(filename);
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){//so long as there is still an occupied line add the values to storeGroceryList
                storeGroceryList.add(scanner.nextLine());

            }
        }catch(FileNotFoundException e){//to catch the error if the file is not found
            System.out.println("File not found askies");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        
    }
}