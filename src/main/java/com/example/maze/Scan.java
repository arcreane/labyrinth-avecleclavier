package com.example.maze;

import java.util.Scanner;

public class Scan {

    Scanner sc = new Scanner(System.in);

    public int nextInt(String msg){
        System.out.println(msg);
        int res = sc.nextInt();
        sc.nextLine();
        return res;
    }

    public String nextLine(String msg){
        System.out.println(msg);
        return sc.nextLine();
    }
}
