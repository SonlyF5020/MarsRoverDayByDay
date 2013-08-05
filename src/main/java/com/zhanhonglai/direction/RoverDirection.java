package com.zhanhonglai.direction;

public enum RoverDirection {
    N("N"), E("E"), W("W"), S("S");
    private final String directionChar;

    RoverDirection(String directionChar) {
        this.directionChar = directionChar;
    }

    public RoverDirection leftDirection() {
        if (this.equals(E)) return N;
        if (this.equals(N)) return W;
        if (this.equals(W)) return S;
        if (this.equals(S)) return E;
        return null;
    }

    public RoverDirection rightDirection() {
        if (this.equals(W)) return N;
        if (this.equals(N)) return E;
        if (this.equals(E)) return S;
        if (this.equals(S)) return W;
        return null;
    }
}
