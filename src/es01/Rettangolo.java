package es01;

import java.util.Scanner;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza){

        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public int areaR(){
        return altezza * larghezza;
    }
    public int areaP(){
        return (altezza * 2 ) + (larghezza*2);
    }
}
