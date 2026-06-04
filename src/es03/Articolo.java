package es03;

import java.util.ArrayList;
import java.util.Random;

public class Articolo {
    private String nameArticle;
    private String codeArticle;
    private String description;
    private double price;
    private int quantita;

    private static ArrayList<Articolo> allArticles = new ArrayList<>();
    /*
    * Logica de este codigo:
    * Cree una clase Article
    * Le di los parametros
    * Luego cree un array de tipo Article
    * Genere el nuevo array con todos los articulos creados
    * Dentro el constructor hice que cada vez que se crea el objeto se añada al array
    * */
    public Articolo(String nameArticle,double price,int quantita){
        this.nameArticle = nameArticle;
        Random codiceRandom = new Random();
        codeArticle = "#"+codiceRandom.nextInt(100000);
        description = "This is the product: " + nameArticle;
        this.price = price;
        this.quantita = quantita;
        allArticles.add(this);

    }


    public static void stampaTutte(){
        for( Articolo ListaArticular : allArticles){
            System.out.println(ListaArticular.nameArticle);
        }
    }
    /*
    * Teniendo el array con los objetos creados
    * Hago un enhanced for para recorrer cada nombre de articulos
    * Los imprimo
    * */
    public static double allPrize(){
      double total = 0;
      for (Articolo articolo : allArticles){
          total += articolo.price;
      }
      return total;
    }
    /*
    * Hago el metodo para poder sumar el precio total
    * enhanced for para sumar el precio de cada elemento
    * */

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

