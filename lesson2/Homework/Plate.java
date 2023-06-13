package lesson2.Homework;

public class Plate {

   private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(String.format("В тарелке осталось %d корочек хлеба ",food));
    }

    public int getFood(){
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды =(");
        }
    }

    public void increaseFood (int amount){
        food+=amount;
        System.out.println(String.format("Тарелка пополнена на %d корочек хлеба", amount));
    }

}

