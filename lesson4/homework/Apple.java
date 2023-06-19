package lesson4.homework;

import java.util.Random;

public class Apple extends Fruit{

    static Random random = new Random();

    public Apple() {
        //super(1.0f);
        super(random.nextFloat(0.1f,1.0f));
    }
}
