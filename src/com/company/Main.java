                                                                                                                        //Stjal indledningsvist kode fra Nicklas... Marcus er medskyldig...
package com.company;                                                                                                    //
import java.util.Scanner;                                                                                               //Importerer scanner til input
                                                                                                                        //
public class Main {                                                                                                     //Main-klassen iværksættes.
                                                                                                                        //
    public static void isDoubloon (String text) {                                                                       //Jeg laver en metode, der tager en string udefra, som den sætter ind og bruger.
        String textDublicate = text.toLowerCase();                                                                      //Jeg kører den førnævnte string og kalder den noget nyt, der kører til lower case.
        for (int i = 0; i <= text.length() - 1; i++) {                                                                  //Jeg laver et loop "fori", der stopper, når input er mindre en string'ens længde.
            int counter = 0;                                                                                            //Her oprettes en tæller, der starter med at være 0, og så tæller den opad.
            for (int x = 0; x <= text.length() - 1; x++) {                                                              //Her oprettes et "under-loop", der også starter med 0, for at det kan rulle opad.
                if (text.toLowerCase().charAt(i) == textDublicate.toLowerCase().charAt(x)) {                            //Her indsættes et if-statement, der tager vores "text"-variabel og ruller bogstaverne i rækkefølge.
                    counter++;                                                                                          //I if-sætningen bor en tæller, der - hvis ovenstående er sandt - går 1 op hele tiden.
                }                                                                                                       //If-sætningen afsluttes.
                if (counter == 3) {                                                                                     //Ny if-sætning med indeholdende tæller iværksættes. Tælleren sættes til lig med 3 - altså hvis der er tre dubletter - og souter i dette tilfælde.
                    System.out.println("The word is not a doubloon!");                                                  //Det her er soutet.
                    testIfNumber();                                                                                     //Metoden nedenfor - "testIfNumber" rulles.
                }                                                                                                       //If-statement afsluttes.
            }                                                                                                           //Her afsluttes under-loopet.
            if (counter <= 1) {                                                                                         //Ny if-statement med tæller, der skal være lig med eller under 1, iværksættes.
                System.out.println("The word is not a doubloon!");                                                      //I tilfælde af ovenstående skal der soutes dette.
                testIfNumber();                                                                                         //Metoden nedenfor - "testIfNumber" rulles.
            }                                                                                                           //If-statement afsluttes.
        }                                                                                                               //Loppet afsluttes.
        System.out.println("Yaaaay! The word is a doubloon!");                                                          //Metoden "isDoubloon" rulles udenfor loopet og souter.
        testIfNumber();                                                                                                 //Metoden nedenfor - "testIfNumber" rulles.
    }                                                                                                                   //Metoden afsluttes.
                                                                                                                        //
    public static void testIfNumber(){                                                                                  //Metoden oprettes og returnerer ikke noget.
        boolean isDoubloon = true;                                                                                      //Der oprettes en boolean, der skal være sand.
                                                                                                                        //
        String[] tal = new String[10];                                                                                  //Der laves et string-array, der har 10 pladser.
        tal [0] = "0";                                                                                                  //String array får sin værdi.
        tal [1] = "1";                                                                                                  //String array får sin værdi.
        tal [2] = "2";                                                                                                  //String array får sin værdi.
        tal [3] = "3";                                                                                                  //String array får sin værdi.
        tal [4] = "4";                                                                                                  //String array får sin værdi.
        tal [5] = "5";                                                                                                  //String array får sin værdi.
        tal [6] = "6";                                                                                                  //String array får sin værdi.
        tal [7] = "7";                                                                                                  //String array får sin værdi.
        tal [8] = "8";                                                                                                  //String array får sin værdi.
        tal [9] = "9";                                                                                                  //String array får sin værdi.
                                                                                                                        //
        Scanner scanner = new Scanner(System.in);                                                                       //Der oprettes en ny scanner.
        System.out.print("Type exit, if you want to close the program. \nType a word, to see if it's a doubloon.\n");   //Der soutes den besked, der rulles hver eneste runde programmet kører.
        String text = scanner.next();                                                                                   //Stringen "text" fra ovenfor bliver sat lig med scanneren.
        if (text.toLowerCase().equals("exit")){                                                                         //En if-statement der tager "text" i lower case, får besked om at skulle være lig med ordet "exit".
            System.exit(0);                                                                                       //Programmet bliver bedt om at afslutte.
        }                                                                                                               //If-statement afsluttes.
        for (int i = 0; i < tal.length; i++) {                                                                          //Der oprettes et loop, der tager inputtet og siger, at hvis inputtet bliver mindre end mængden af elementer der er i arrayet, skal den rulle.
            if (text.contains(tal[i])) {                                                                                //If-statement, der tager "text" og tjekker om den indeholder tal - altså fra arrayets elementer.
                isDoubloon = false;                                                                                     //Hvis "if" rulles, bliver metoden "isDoubloon" falsk.
                break;                                                                                                  //Der indsættes et break.
            }                                                                                                           //If-statement afsluttes.
        }                                                                                                               //Loppet afsluttes.
        if (!isDoubloon){                                                                                               //If-statement, der indeholder/tager en "falsk" isDoubloon".
            System.out.println("There is a number in your word, try again!");                                           //Souter.
            testIfNumber();                                                                                             //Metoden "testIfNumber" rulles.
        }                                                                                                               //If-statement afsluttes.
        isDoubloon(text);                                                                                               //Metoden "isDoubloon" der tager "text"-variablen ruller igen.
    }                                                                                                                   //Metoden "testIfNumber" afsluttes.
    public static void main(String[] args) {                                                                            //Main-metoden kører.
        testIfNumber();                                                                                                 //Metoden "testIfNumber" kører
    }                                                                                                                   //Main-metoden afsluttes.
}                                                                                                                       //Main-klassen afsluttes.