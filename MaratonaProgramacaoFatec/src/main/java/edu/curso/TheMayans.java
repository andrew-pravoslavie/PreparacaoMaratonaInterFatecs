package edu.curso;

import java.util.Scanner;

public class TheMayans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String n = sc.nextLine();
            String[] partes = n.split(" ");

            long total = 0;
            for(String parte : partes){
                int d = 0;
                if(!parte.equals("*")){
                    for(char c : parte.toCharArray()){
                        if(c == '.') d++;
                        else if(c == '-') d+=5;
                    }
                }
                total = total*20+d;
            }
            System.out.println(total);
        }
    }
}
