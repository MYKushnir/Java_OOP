package lesson2.Homework;


public class HomeworkSem2 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Агафон", 3);
        cats[1] = new Cat("Акакий", 10);
        cats[2] = new Cat("Григорий", 8);
        cats[3] = new Cat("Томас", 5);

        Plate plate = new Plate(15);
        
        for (Cat cat : cats) {
            plate.info(); 
            cat.eat(plate);        

            while(!cat.isFull()){
                System.out.println(String.format("%s с апетитом на %d корочек хлеба пишет письмо президенту за голодомор", cat.getName(), cat.getAppetite()));
                plate.increaseFood(cat.getAppetite()-plate.getFood());
                plate.info();
                cat.eat(plate);                
            }
            System.out.println(String.format("%s с апетитом на %d корочек хлеба благодарит за сытную трапезу", cat.getName(), cat.getAppetite()));
           
        }
    }
}
