package com.example.maze;

public enum Direction {

    None(false),
    N(false),
    S(false),
    E(false),
    W(false),
    NE(true),
    NW(true),
    SE(true),
    SW(true);

    public final boolean oblic;

    Direction(boolean oblic) {
        this.oblic = oblic;
    }
}
