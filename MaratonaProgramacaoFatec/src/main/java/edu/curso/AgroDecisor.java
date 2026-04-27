package edu.curso;
import java.util.Scanner;

public class AgroDecisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            double t = sc.nextDouble();
            double u = sc.nextDouble();
            int p = sc.nextInt();

            if(p == 1 || !(t>30 && u<50)){
                System.out.println("NAO REGAR");
            }else{
                System.out.println("REGAR");
            }
        }
    }
}