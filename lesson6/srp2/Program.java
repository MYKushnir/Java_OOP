package lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */


public static void main(String[] args) {
    System.out.println("Введите заказ:");
    OrderConsoleInput input = new OrderConsoleInput();
    Order order = input.inputOrder();
    OrderJsonWriter writer = new OrderJsonWriter();
    writer.writeToJson(order);
    }   



}
