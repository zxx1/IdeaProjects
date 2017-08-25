package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            long r=count(n);
            System.out.println(r);
        }

    }

    private static long count(int n) {
        if (n<=0)
            return 0;
        int money[]= new int []{1,5,10,20,50,100};
        long dp[]=new long[n+1] ;
        int h=money.length;
        dp[0]=1;
        for (int i=0;i<h;i++){
            for (int j=money[i];j<=n;j++){
                dp[j]=dp[j]+dp[j-money[i]];
            }
        }
        return dp[n];
    }
}
