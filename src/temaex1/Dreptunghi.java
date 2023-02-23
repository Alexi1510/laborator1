package temaex1;

import java.util.Arrays;
import java.util.Scanner;
public class Dreptunghi {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduceti lungimea dreptunghiului: ");
        double lungime=scanner.nextDouble();

        System.out.println("Introduceti latimea dreptunghiului: ");
        double latime=scanner.nextDouble();

        double perimetru=2*(lungime+latime);
        double aria=lungime * latime;

        System.out.println("Perimetrul dreptunghiului este: "+perimetru);
        System.out.println("Aria dreptungiului este: "+aria);
    }
}
