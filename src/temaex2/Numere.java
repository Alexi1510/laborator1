package temaex2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Numere {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File("in.txt"));

            double suma = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            int numarElemente = 0;

            while (scanner.hasNextDouble()) {
                double numar = scanner.nextDouble();

                suma += numar;
                numarElemente++;

                if (numar < min) {
                    min = numar;
                }

                if (numar > max) {
                    max = numar;
                }
            }
            scanner.close();

            double media = suma / numarElemente;

            System.out.println("Suma numerelor este: " + suma);
            System.out.println("Media aritmetica este: " + media);
            System.out.println("Valoarea minima este: " + min);
            System.out.println("Valoarea maxima este: " + max);

            PrintWriter writer = new PrintWriter("out.txt");
            writer.println("Suma numerelor este: " + suma);
            writer.println("Media aritmetica este: " + media);
            writer.println("Valoarea minima este: " + min);
            writer.println("Valoarea maxima este: " + max);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul de intrare nu e gasit in plm");
        }
    }
}
