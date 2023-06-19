package lesson4.homework;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        System.out.println(String.format("Вес 1-й коробки с яблоками: %.3f", appleBox1.getWeight()));
        System.out.println(String.format("Вес 1-й коробки с апельсинами: %.3f", orangeBox1.getWeight()));
        System.out.println(String.format("Вес второй коробки с яблоками: %.3f", appleBox2.getWeight()));

        System.out.println("1-я коробка с яблоками весит как и 1-я коробка с апельсинами: " + appleBox1.compare(orangeBox1));
        System.out.println("1-я коробка с яблоками весит как и 2-я коробка с яблоками: " + appleBox1.compare(appleBox2));

        appleBox1.transfer(appleBox2);

        System.out.println(String.format("\nПереложим яблоки из 1-й коробки во вторую.\nВес 1-й коробки с яблоками: %.3f", appleBox1.getWeight()));
        System.out.println(String.format("Вес 2-й коробки с яблоками: %.3f", appleBox2.getWeight()));    

    }

}
