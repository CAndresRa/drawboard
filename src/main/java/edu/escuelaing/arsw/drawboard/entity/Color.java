package edu.escuelaing.arsw.drawboard.entity;

public class Color {
    private int r;
    private int g;
    private int b;

    public Color(){
        this.r = (int) Math.floor(Math.random()*253+1);
        this.g = (int)Math.floor(Math.random()*253+1);
        this.r = (int)Math.floor(Math.random()*253+1);
    }
    public Color(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
