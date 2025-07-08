package principal;


import model.Cambio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cambio c = new Cambio();
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do Dolar: " + c.getPrecoDolar());
        System.out.println("Quantos dolares voce deseja comprar: ");
        c.setCompraDolar(sc.nextDouble());

        System.out.println(c.toString());


    }
}