
package bekeres;

import java.util.Scanner;


public class Bekeres {

    public static void main(String[] args) {
        int kor = 0;
        String nev ="";
        Scanner sc = new Scanner(System.in);

        boolean jo  =false;
        while(!jo) {   
            System.out.println("Mennyi idős vagy(6<): ");
            kor = sc.nextInt();
            sc.nextLine();
            System.out.println("Mi a neved: ");
            nev = sc.nextLine();
            jo =kor >6&&nev.length()>3;

        }
        
        
        
        System.out.println("A te neved: "+nev+" és "+kor+" éves vagy.");
        
    }
    
}
