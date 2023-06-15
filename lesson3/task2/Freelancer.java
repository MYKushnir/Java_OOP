package lesson3.task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer extends Employee {
    private int hoursWorked;
    private double hourRate;

    public Freelancer(String name, String surname, int hoursWorked, double hourRate) {
        super(name, surname, 0);
        this.hoursWorked = hoursWorked;
        this.hourRate = hourRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; Среднемесячная заработная плата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
