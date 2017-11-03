import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
* <h1>Počítání kliků</h1>
* <p>
* <b>Note:</b> rozepsáno do tří verzí - bez prodlevy, s prodlevou a Scannerem, s prodlevou a načítáním dat z param
*
* @author  Jiří Haut
* @version 1.0
* @since   2017-09-01
*/

public class kliky {
  private static Scanner input = new Scanner (System.in);
  // 40 kliků bez čekání
    public static void klik () {

    System.out.println("Jdeme na to! Dáme 40 kliků.");
    for (int i = 1; i <= 40; i++)
    {
    System.out.println("udělej klik");
    System.out.println("počet kliků: " + i);    
    }
    System.out.println("Cvičení dokončeno!");
    }
    
  // kliky s volbou opakování a prodlevou ze scanneru
  public static void klik_wait () throws InterruptedException {
        System.out.println("Zadej počet kliků: ");
        int pocet = input.nextInt();
       
        System.out.println("Zadej prodlevu v celých sekundách: ");
        int cas = input.nextInt();
        
        Thread.sleep(cas*1000);       
        
        System.out.println("Jdeme na to!");
        
        Thread.sleep(cas*1000);        
        
        for (int j = 1; j <= pocet; j++) {
            System.out.println("udělej klik");
            //Pause for 1 second
            Thread.sleep(cas*1000);
            //Print a message
            System.out.println("počet kliků: " + j);
        }
        System.out.println("Cvičení dokončeno!");
  }  

  //kliky s volbou opakování a prodlevou z parametru
  public static void klik_wait (int pocet, int cas)
        throws InterruptedException {
        // vynulování terminálu
        System.out.print('\u000c');
        // kontrola správnosti vstupu
        System.out.println("Zadali " + pocet + " opakování s prodlevou " + cas);
        System.out.println("Odpočítávám 5 sekund");
        for (int j = 5; j>=1; j--) {
            System.out.println(j + " sekund");
            Thread.sleep(1000);
        }
        System.out.println("Jdeme na to!");
        
        for (int j = 1; j <= pocet; j++) {
            System.out.println("udělej klik!");
            //Pause for 1 second
            Thread.sleep(cas*1000);
            //Print a message
            System.out.println("počet kliků: " + j);
        }
        System.out.println("Cvičení dokončeno!");
  }  
}