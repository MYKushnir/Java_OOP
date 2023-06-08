package lesson1;

public class Juce extends Product{
private String juceType; // из чего сок
private double volume; // обьем сока

public String getjuceType() {
    return juceType;
}
public void setjuceType(String juceType) {
    this.juceType = juceType;
}
public double getVolume() {
    return volume;
}
public void setVolume(double volume) {
    this.volume = volume;
}

public Juce(String brand, String name, double price, String juceType, double volume) {
    super(brand, name, price);
    this.juceType = juceType;
    this.volume = volume;
}
@Override
public String displayInfo() {

    return String.format("[Сок] %s - %s - %f [обьем: %f; из: %s]", brand, name, price, volume, juceType);
}
}