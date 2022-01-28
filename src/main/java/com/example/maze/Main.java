package com.example.maze;

import java.util.Random;

public class Main {

    public static Scan scanner;
    public static Random random;

    public static void scanner() {
        Scan scanner = new Scan();
    }

    public static void Random(){
        Random random = new Random();
    }

    public static void Maze(){
        Maze map = new Maze(1);
    }
}
