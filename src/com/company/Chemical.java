package com.company;

public class Chemical implements Comparable {
    private final int t;
    private final int e;
    private final int r;
    private double chDanger;

    public Chemical(int t, int e, int r) {
        this.t = t;
        this.e = e;
        this.r = r;
        this.chDanger = 1.7*t + 5.4*e + 4.9*r;
    }

    public int getT(){
        return t;
    }
    public int getE(){
        return e;
    }
    public int getR(){
        return r;
    }
    public double getChDanger(){
        return chDanger;
    }

    @Override
    public int compareTo(Object o) {
        Chemical ch = (Chemical) o;
        return (int) (this.chDanger - ch.chDanger);
    }
}

