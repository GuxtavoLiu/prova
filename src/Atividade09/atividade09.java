package Atividade09;

import java.util.Random;
import java.util.Scanner;

public class atividade09 {
//========= Ex01 =========

    public static int pedirNumero() {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = e.nextInt();
        return n;
    }
    //========= Ex02 =========

    public static void gerarAleatorio() {
//        Guarda o valor da função pedirNumero na variavel num
        int num = pedirNumero();
        Random r = new Random();

        int n = r.nextInt(50);

        System.out.println(n);

    }

    public static void main(String[] args) {
        pedirNumero();

    }

}
