package es01;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        /*
        * Esercizio #1
Creare una classe Rettangolo che permetta di rappresentare dei rettangoli. Per ogni rettangolo deve essere
possibile specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per
calcolare perimetro ed area.
Realizzare un metodo stampaRettangolo che, dato un Rettangolo (passato come parametro), ne stampi a video
area e perimetro.
Realizzare un metodo stampaDueRettangoli che, dati due rettangoli (passati come parametri), ne stampi area e
perimetro di ognuno e quindi la somma delle aree e dei perimetri.
Scrivere un main che utilizzi tutte queste funzioni.
        * */

        Rettangolo myRectangle = new Rettangolo(10,20);
        Rettangolo myRectangle2 = new Rettangolo(20, 10);
        System.out.println("This is the area to the first Rectangle");
        System.out.println(myRectangle.areaP());
        System.out.println("This is the perimeter to the first Rectangle");
        System.out.println(myRectangle.areaR());
        System.out.println("This is the area to the second Rectangle");
        System.out.println(myRectangle2.areaP());
        System.out.println("This is the perimeter to the first Rectangle");
        System.out.println(myRectangle2.areaR());
        System.out.println("This is the total area");
        System.out.println(stampa(myRectangle.areaR(),myRectangle.areaP(),myRectangle2.areaR(),myRectangle2.areaP()));


    }
    public static int stampa(int myArea1,int myPerimeter1, int myArea2, int myPerimeter2){
        return myArea1 + myPerimeter1 + myArea2 + myPerimeter2;
    }
}
