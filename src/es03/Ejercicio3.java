package es03;

public class Ejercicio3 {
    public static void main(String[] args){
        var firstArticle = new Articolo("Jeans",30,20);
        var secondArticle = new Articolo("Jacket",20,10);
        var thirdArticle = new Articolo("T-Shirt",20, 10);
        var fourthArticle = new Articolo("collar",50,10);




        var firstClient = new Cliente("Paolo","Fiorentini","paolo@gmail.com","16-2-2435");
        System.out.println(firstArticle.toString());
        System.out.println(secondArticle.toString());
        System.out.println(thirdArticle.toString());

        System.out.println(firstClient.toString());
        Articolo.stampaTutte();
        System.out.println(Articolo.allPrize());
    }

}
