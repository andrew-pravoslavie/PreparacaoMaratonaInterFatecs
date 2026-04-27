package edu.curso;
import java.util.Scanner;

public class LumenHelicon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        long maior = Long.MIN_VALUE;

        for(int k=1;k<=n/2;k++){
            for(int start=0;start<k;start++){
                long cur = a[start];
                if(cur>maior) maior = cur;
                for(int i=start+k;i<n;i+=k){
                    cur = Math.max(a[i],cur+a[i]);
                    if(cur>maior) maior = cur;
                }
            }
        }
        System.out.println(maior);
    }
}
