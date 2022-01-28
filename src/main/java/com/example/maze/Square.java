package com.example.maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Square {


    private final static Direction[][] orientations = {{Direction.None}, {Direction.N, Direction.S}, {Direction.NW, Direction.NE, Direction.SW, Direction.SE}};

    Direction orientation;
    Tile[] tiles;
    Square[][] map;
    int x;
    int y;

    public Square head(Direction cardinal){
        switch (cardinal){
            case N -> {
                if (this.y > 0){
                    return map[y-1][x];
                }
            }
            case S -> {
                if (this.y < map.length-1){
                    return map[y+1][x];
                }
            }
            case E -> {
                if (this.x < map[y].length-1){
                    return map[y][x+1];
                }
            }
            case W -> {
                if (this.x > 0){
                    return map[y][x-1];
                }
            }
        }
        return this;
    }

    private static Direction[] orientationTiles(Direction orientation){
        List<Direction> orientTiles = new ArrayList<>();
        if (orientation == Direction.None || orientation.oblic)
            orientTiles.add(orientation);
        switch (orientation) {
            case N -> {
                orientTiles.add(Direction.NW);
                orientTiles.add(Direction.SE);
            }
            case S -> {
                orientTiles.add(Direction.NE);
                orientTiles.add(Direction.SW);
            }
            case NE -> {
                orientTiles.add(Direction.S);
                orientTiles.add(Direction.W);
            }
            case NW -> {
                orientTiles.add(Direction.S);
                orientTiles.add(Direction.E);
            }
            case SE -> {
                orientTiles.add(Direction.N);
                orientTiles.add(Direction.W);
            }
            case SW -> {
                orientTiles.add(Direction.N);
                orientTiles.add(Direction.E);
            }
        }
        //return (Direction[]) orientTiles.toArray();
        //TODO: cast le résultat
        Direction[] res = {orientation};
        return res;
    }

    Square(int x, int y, int tilesNb, Maze map){
        this.orientation = orientations[tilesNb-1][Main.random.nextInt(orientations[tilesNb-1].length)];
        //TODO: remettre l'aléatoire
        this.x =x;
        this.y = y;
        this.map = map.map;

        Direction[] orientTiles = orientationTiles(orientation);

        tiles = new Tile[tilesNb];
        for(int i=0; i<tilesNb; i++){
            tiles[i] = new Tile(this, orientTiles[i]);
        }
    }

}
