package com.company;
import java.lang.reflect.Method;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Extensivel");

        while(true) {
            System.out.println("Digite o primiero numero");
            double firstNumber = sc.nextDouble();
            System.out.println("Digite o segundo numero");
            double secondNumber = sc.nextDouble();

            System.out.println("Digite a operacao que voce quer fazer \n" +
                    "Soma\n" +
                    "Subtrai\n" +
                    "Multiplica\n" +
                    "Divide");
            String type = sc.next();

            Class clazz = Class.forName("com.company."+ type);
            Object obj = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getMethod("calcula", double.class, double.class);
            double result = (double) method.invoke(obj, firstNumber, secondNumber);
            System.out.println("Resultado: " + result);
            System.out.println("----------------------------------");

        }

    }
}
