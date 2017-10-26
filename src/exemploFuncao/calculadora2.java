package exemploFuncao;

import java.util.Scanner;

public class calculadora2 {

    public static void criarMenu() {

        System.out.println("--------------------");
        System.out.println("1. Multiplicação");
        System.out.println("2. Subtração");
        System.out.println("3. Soma");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.println("--------------------");
        System.out.println("Escolha a opção desejada: ");
    }

    public static double scan() {
        Scanner e = new Scanner(System.in);
        double num = e.nextDouble();
        return num;
    }

    public static void dobro() {
        System.out.println("Digite um número");
        double o = scan();
        System.out.println("Digite outro número");
        double i = scan();
        System.out.println(o + " x " + i + " = " + (o * i));
    }

    public static void subtrai() {
        System.out.println("Digite um número");
        double o = scan();
        System.out.println("Digite outro número");
        double i = scan();
        System.out.println(o + " - " + i + " = " + (o - i));
    }

    public static void soma() {
        System.out.println("Digite um número");
        double o = scan();
        System.out.println("Digite outro número");
        double i = scan();
        System.out.println(o + " + " + i + " = " + (o + i));
    }

    public static void divisao() {
        System.out.println("Digite um número");
        double o = scan();
        System.out.println("Digite outro número");
        double i = scan();
        System.out.println(o + " ÷ " + i + " = " + (o / i));
    }

    public static void main(String[] args) {
        criarMenu();
        double opcao = scan();
        if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
            if (opcao == 1) {
                dobro();
            } else if (opcao == 2) {
                subtrai();
            } else if (opcao == 3) {
                soma();
            } else if (opcao == 4) {
                divisao();
            }

        } else if (opcao == 0) {
            System.out.println("Fim do programa!");
        } else {
            System.out.println("Digite um número válido: ");
            criarMenu();        
        }
    }
}
