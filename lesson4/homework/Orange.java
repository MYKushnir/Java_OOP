package lesson4.homework;

import java.util.Random;

public class Orange extends Fruit {

    static Random random = new Random();

    public Orange() {
        //super(1.5f);
        super(random.nextFloat(0.1f,1.5f));
    }
}