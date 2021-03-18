package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class Main {
    // Zadanie 3b (komentarze)

    // - komentarz jednolinijkowy

    /*
         komentarz wielolinijkowy
    */

    /**
     * komentarz dokumentujący
     * @param args argumenty przekazane przy uruchomieniu programu
     */


    //public static void main(String[] args) {

    // Zadanie 4
    //    System.out.println("Hello Java world");
    //}

    // Zadanie 7

    // 7a
    //public static void main(String[] args) {
    //    System.out.print("Ala");
    //    System.out.print("ma");
    //    System.out.print("kota");
    //}

    // 7b
    //public static void main(String[] args) {
    //    System.out.println("Ala");
    //    System.out.println("ma");
    //    System.out.println("kota");
    //}

    // 7c
    //public static void main(String[] args) {
    //    System.out.print("Ala\n");
    //    System.out.print("ma\n");
    //    System.out.print("kota\n");
    //}

    // 7d/e
    //public static void main(String[] args) {
    //    int a = 3;
    //    double b = 4.21;
    //    String s = "jakiś tekst";

    //    System.out.printf("a = %d, b = %.2f, s = %20s %n", a,b,s);
    //}

    // 7g
    //public static void main(String[] args) {
    //    System.out.print("Nazwaliśmy to \"witaminą B3\" \n");

    //    System.out.printf("alfa\tsin(alfa)\n");
    //    for (int i = 0; i < 370; i += 10)
    //        System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
    //}

    // 7h
    // public static void main(String[] args){
    //        int arg = 1;
    //        int log;
    //        int sum = 0;

    //    System.out.println("arg\t\tlog2(arg)\t\tsum(arg)");
    //    for (int i = 1; i < 5; i++) {
    //       if (i == 1) {
    //            log = log2(arg);
    //            sum += arg;
    //            System.out.println(arg + "\t\t " + log + "\t\t\t" + sum);
    //        }
    //       arg *= 2;
    //        log = log2(arg);
    //        sum += arg;
    //        System.out.println(arg + "\t\t " + log + "\t\t\t" + sum);
    //    }
    //    System.out.println();
    //}
    //public static int log2(int N) {
    //    int result = (int) (Math.log(N) / Math.log(2));
    //    return result;
    //}

    // Zadanie 8

    // 8a
    //public static void main (String[] args) {
    //    Scanner input = new Scanner(System.in);
    //    int num1, num2;

    //       System.out.print("Podaj pierwszą liczbę: ");
    //       num1 = input.nextInt();
    //       System.out.print("Podaj drugą liczbę: ");
    //       num2 = input.nextInt();
    //       System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
    //}

    // Zadanie 9
    //9a-d
    //public static void main(String[] args) {
    //    Scanner input = new Scanner (System.in);
    //    int num1= 0, num2= 0;
    //    do {
    //int num1 = 0, num2 = 0;
    //        System.out.print("Podaj pierwszą liczbę: ");
    //        num1 = input.nextInt();
    //        if (num1 == 0) break;
    //        System.out.print("Podaj drugą liczbę: ");
    //        num2 = input.nextInt();
    //        if (num1 == 0) break;
    //        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
    //    } while (true);
    //while ((num1 != 0) && (num2 != 0));
    //}

    //9e
    //public static void main(String[] args) {
    //    Scanner input = new Scanner (System.in);
    //    int num1 = 0, num2 = 0;
    //    do {
    //        System.out.print("Podaj liczbę, które mam dodać: ");
    //        num1 = input.nextInt();
    //        num2 = input.nextInt();
    //        if ((num1 == 0) || (num2 == 0)) break;
    //        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
    //    } while (true);
    //}

    //Zadanie 10

    //10b
    //public static void main(String[] args) {
    //    Scanner input = new Scanner(System.in);
    //    int num;
    //        System.out.print("Podaj liczbę: ");
    //        num =input.nextInt();
    //        System.out.println("DEC ="+num);
    //        System.out.println("BIN ="+Integer.toBinaryString(num));
    //        System.out.println("HEX ="+Integer.toHexString(num));
    //}

    //10c
    //public static void main(String[] args) {
    //    Scanner input = new Scanner(System.in);
    //    System.out.printf("Podaj liczbę: ");
    //    int num;
    //        num = input.nextInt();
    //        String BIN, HEX;
    //        BIN = Integer.toBinaryString(num);
    //        HEX = Integer.toHexString(num);
    //        String numBIN, numHEX;
    //        numBIN = leftPad(BIN, '0', 8);
    //        numHEX = leftPad(HEX, '0', 4);
    //        System.out.println("DEC = " +num+ "\nBIN = " +numBIN+ "\nHEX = %" +numHEX);
    //}
    //public static String leftPad(String aText, char aChar, int aWidth) {
    //    String res = aText;
    //    for (int i = 0; i < aWidth - aText.length(); i++)
    //        res = aChar + res;
    //    return res;
    //}

    //10d
    //public static void main(String[] args) {
    //    Scanner input = new Scanner(System.in);
    //    System.out.printf("Podaj liczbę: ");
    //    int num;
    //       num = input.nextInt();
    //        String BIN, HEX;
    //        BIN = Integer.toBinaryString(num);
    //        HEX = Integer.toBinaryString(num);
    //        String numBIN, numHEX;
    //        numBIN = leftPad(BIN, '0', 8).toUpperCase();
    //        numHEX = leftPad(HEX, '0', 4).toUpperCase();
    //        System.out.println("DEC = " +num+ "\nBIN = " +numBIN+ "\nHEX = %" +numHEX);
    //}
    //public static String leftPad(String aText, char aChar, int aWidth) {
    //    String res = aText;
    //    for(int i = 0; i < aWidth - aText.length(); i++)
    //        res = aChar +res;
    //    return res;
    //}

    //Zadanie 11

    public static void main(String[] args) {
        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        for (int l : liczby)
        {
            System.out.println(1);
            if (1 < mn) mn = 1;
            if (1 > mx) mx = 1;
            avg += 1;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn,mx, (float)avg/liczby.length);
    }


}