package com.example.maze;

public class Maze {
    public Square[][] map;

    private void initGrid(int diff, int x, int y){
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                map[i][j] = new Square(j, i, diff, this);
            }
        }
    }

    private void initBorders(Square[][] map){
        for (Square[] row : map){
            for (Square square : row){
                for (Tile tile : square.tiles){
                    tile.setBorders();
                }
            }
        }
    }

    private void carveMaze(Square[][] map){

    }

    Maze(int difficulty){
        int y = Main.scanner.nextInt("Combien de lignes ?");
        int x = Main.scanner.nextInt("Combien de colonnes ?");

        map = new Square[y][x];

        initGrid(difficulty, x, y);

        initBorders(map);
    }
}
