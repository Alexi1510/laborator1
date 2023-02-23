package temaex3;

import java.util.Arrays;
import java.util.Scanner;
public class Divizori {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Numarul este: ");
        int x=scanner.nextInt();

        for(int i=1;i<x;i++){
            if(x%i==0)
            {
                System.out.println(i+" este divizor a lui "+x);
            }
        }

        for(int y=2;y<x/2;y++){
            if(x%y!=0)
            {
                System.out.println(x+" este numar prim");
            }
        }

    }
}
