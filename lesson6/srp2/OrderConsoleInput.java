package lesson6.srp2;

import java.util.Scanner;

public class OrderConsoleInput {
    public Order inputOrder() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Имя клиента: ");
            String clientName = in.nextLine();
            System.out.print("Товар: ");
            String product = in.nextLine();
            System.out.print("Количество: ");
            int qnt = in.nextInt();
            System.out.print("Цена: ");
            int price = in.nextInt();
            return new Order(clientName, product, qnt, price);
        }
    }

}