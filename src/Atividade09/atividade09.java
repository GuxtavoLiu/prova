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

    public static int gerarAleatorio() {
//        Guarda o valor da função pedirNumero na variavel num
        int num = pedirNumero();
        Random r = new Random();

        int n = r.nextInt(50);

        System.out.println(n);
        return n;
    }

    //========= Ex03 =========
    public static String mes() {
        int a = pedirNumero();
        String mes = "a";
        if (a > 0 && a <= 12) {
            if (a == 1) {
                mes = "Janeiro";
            } else if (a == 2) {
                mes = "Fevereiro";
            } else if (a == 3) {
                mes = "Março";
            } else if (a == 4) {
                mes = "Abril";
            } else if (a == 5) {
                mes = "Maio";
            } else if (a == 6) {
                mes = "Junho";
            } else if (a == 7) {
                mes = "Julho";
            } else if (a == 8) {
                mes = "Agosto";
            } else if (a == 9) {
                mes = "Setembro";
            } else if (a == 10) {
                mes = "Outubro";
            } else if (a == 11) {
                mes = "Novembro";
            } else if (a == 12) {
                mes = "Dezembro";
            } else {
                mes = "Digite um número válido";
            }
        }
        return mes;

    }

    //========= Ex05 =========
    public static int fat(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fat(a - 1);
        }
    }

    public static void main(String[] args) {
        int a;
        a = fat(pedirNumero());
        System.out.println(a);
    }
}
