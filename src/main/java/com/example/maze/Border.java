package com.example.maze;

public class Border {

    String status;
    Tile goesTo;

    Border(Tile goesTo, Direction position){
        this.status = "wall";
        this.goesTo = goesTo;
    }
}
