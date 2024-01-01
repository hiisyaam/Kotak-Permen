package kotak.permen;

import java.util.Scanner;

/**
 *
 * @author hiisyaam
 */
public class KotakPermen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        
        
        if(bilangan%2==0 && bilangan%5==0){
            System.out.println("Kotak Permen");
        }else if(bilangan%2==0){
            System.out.println("Kotak");
        }else if(bilangan%5==0){
            System.out.println("Permen");
        }else{
            System.out.println(bilangan);
        }
        input.close();
    
    }
}
