/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatantusz;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

/**
 *
 * @author Magor
 */
public class JavaTantusz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner billentyuzet = new Scanner(System.in);
        
//        int i =10;
//        System.out.println(i++);
//        System.out.println(--i);
//        --i;
//        i--;
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i--);
//        System.out.println(i);
//        i++;
//        System.out.println(i);
//        i = i++ + ++i;
//        System.out.println(i);
//        i = i++ + i++;
//        System.out.println(i);

        int tipszam = 0;
        int veletszam = new Random().nextInt(100)+1;

        out.println("       *************        ");
        out.println(" Udvozol a kitalalos jatek  ");
        out.println("       *************        ");
        out.println();

        out.print("Irj be egy 1 es 10 kozotti egesz szamot: ");
        int bekertszam = billentyuzet.nextInt();
        tipszam++;

        do {
              out.println();
              out.println("Probalkozz ujra... ");
              out.print("Irj be egy 1 es 10 kozotti egesz szamot: ");
              bekertszam = billentyuzet.nextInt();
              tipszam++;
        }
        while (bekertszam != veletszam);
               {
            out.println(" Nyertel, ");
            out.println(tipszam + " probalkozas utan.");
//         while (bekertszam != veletszam) {
//            out.println();
//            out.println("Probalkozz ujra... ");
//            out.print("Irj be egy 1 es 10 kozotti egesz szamot: ");
//            bekertszam = billentyuzet.nextInt();
//            tipszam++;
       }
        out.println(" Nyertel, ");
        out.println(tipszam + " probalkozas utan.");
        billentyuzet.close();
    }
 }
    

