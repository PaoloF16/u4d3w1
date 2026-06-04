package es02;

import java.util.ArrayList;
import java.util.Arrays;

public class Sim {
    private int number;
    private int credit;
    private Chiamata[] listaChiamate;

    public Sim(int number){
        this.number = number;
        this.credit = 0;
        listaChiamate = new Chiamata[5];
    }

    @Override
    public String toString() {
        return "Sim{" +
                "number=" + number +
                ", credit=" + credit +
                ", listaChiamate=" + Arrays.toString(listaChiamate) +
                '}';
    }
}
