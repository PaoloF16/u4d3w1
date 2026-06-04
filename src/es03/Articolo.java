package es03;

import java.util.Random;

public class Articolo {
    private String nameArticle;
    private String codeArticle;
    private String description;
    private double price;
    private int quantita;

    public Articolo(String nameArticle,double price,int quantita){
        this.nameArticle = nameArticle;
        Random codiceRandom = new Random();
        codeArticle = "#"+codiceRandom.nextInt(10);
        description = "This is the product" + nameArticle;
        this.price = price;
        this.quantita = quantita;
    }
}

