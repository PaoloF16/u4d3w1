package es03;

import java.util.ArrayList;
import java.util.Random;

public class Articolo {
    private String nameArticle;
    private String codeArticle;
    private String description;
    private String price;
    private int quantita;

    private static ArrayList<Articolo> allArticles = new ArrayList<>();

    public Articolo(String nameArticle,double price,int quantita){
        this.nameArticle = nameArticle;
        Random codiceRandom = new Random();
        codeArticle = "#"+codiceRandom.nextInt(100000);
        description = "This is the product: " + nameArticle;
        this.price = price + "$";
        this.quantita = quantita;
        allArticles.add(this);

    }

    public static void stampaTutte(){
        for( Articolo ListaArticular : allArticles){
            System.out.println(ListaArticular.nameArticle);
            System.out.println(ListaArticular.price);
        }
    }
    @Override
    public String toString() {
        return "Articolo{" +
                "nameArticle='" + nameArticle + '\'' +
                ", codeArticle='" + codeArticle + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantita=" + quantita +
                '}';
    }

}

