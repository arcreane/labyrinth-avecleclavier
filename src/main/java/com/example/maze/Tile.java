package com.example.maze;


import java.util.HashMap;
import java.util.Map;

public class Tile {

    Direction orientation;
    Map<Direction, Border> borders;
    Square parent;

    public void setBorders() {
        switch (this.orientation) {
            case None -> {
                Direction[] externals = {Direction.N, Direction.S, Direction.E, Direction.W};
                for (int i = 0; i < externals.length; i++) {
                    borders.put(externals[i], new Border(this.parent.head(externals[i]).tiles[0], externals[i]));
                }
            }
            case N, S -> {
            }
        }
        ;
    }

    Tile(Square parent, Direction orientation) {
        this.parent = parent;
        this.orientation = orientation;
        //None si la case est carrée, directions par rapport au Square parent des Borders externes sinon
        this.borders = new HashMap<>();
    }
}
