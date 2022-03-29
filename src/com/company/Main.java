package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soma somar = new Soma();
        Subtrai subtrai = new Subtrai();
        Divide divide = new Divide();
        Multiplica multiplica = new Multiplica();


        boolean flag = true;

        while(flag) {


            System.out.println("Digite o primiero número");
            float firstNumber = sc.nextFloat();
            System.out.println("Digite o segundo número");
            float secondNumber = sc.nextFloat();

            System.out.println("1-somar\n2-subtrair\n3-multiplicar\n4-dividir\n5-sair");
            int n = sc.nextInt();


            float n2 = 0;

            if(n == 1) {
                n2 = somar.calcula(firstNumber, secondNumber);
            } else if (n == 2) {
                n2 = subtrai.calcula(firstNumber, secondNumber);
            } else if (n == 3) {
                n2 = multiplica.calcula(firstNumber, secondNumber);
            } else if (n == 4) {
                n2 = divide.calcula(firstNumber, secondNumber);
            } else {
                flag = false;
            }
            if(n <= 4) {
                System.out.println("Resultado da soma: " + n2 + "\n");
            }
        }

    }
}
