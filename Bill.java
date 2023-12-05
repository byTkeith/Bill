/*author:Tendai K Nyevedzanai
 * a program that checks if the shop has the products and prints out the total of all present products in the shop
 */
import java.io.*;
import java.itil.*;
import java.util.Scanner;
public class Bill{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the name of the products file:");
        String filename=scanner.nextLine();
        System.out.println("Enter the shopping list:");
        String clientList=scanner.nextLine();
        try{
            File file=new File(filename);
            scanner=new Scanner(file);
        }
        
    }
}