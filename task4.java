//4*. К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.*;

public class task4 {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = iScan.nextInt();
        System.out.println("Введите число b: ");
        double b = iScan.nextInt();
        System.out.print("Ввидите действие(+, -, *, /): ");
        char op = iScan.next().charAt(0);
        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("Error!");
                return;
        }
        System.out.print("\nВаш пример:\n");
        System.out.printf(a + " " + op + " " + b + " = " + result);
        System.out.print("\n ");

        Logger logger = Logger.getLogger(task4.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");

    }
}
