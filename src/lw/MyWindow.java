package lw;

/**
 * Created by Yuriy on 17.02.2016.
 */
public class MyWindow {
    private double width;//оголошуємо інкапсульовані змінні
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    @Override
    public String toString() {//перевизначаємо метод toString
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public void printFields(){//створюємо метод, який буде виводити на друк наш toString
        System.out.println(this.toString());
    }

    //генеруємо автоматично конструктор Alt+ins
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {//перевизначаємо конструктор на конструктор із визначеними параметрами
        this(111.1,111.1,5,"white",true);
    }

    public MyWindow(double width) {//перевизначаємо конструктор і робимо таким, що приймає всі значення з конструктора
        //із визначеними параметрами, окрім width
        this();
        this.width = width;
    }

    public MyWindow(double width, double height) {//перевизначаємо конструктор і робимо таким, що приймає всі значення
        // з конструктора із визначеними параметрами, окрім зазначених нижче
        this();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {//перевизначаємо конструктор і робимо таким, що
        // приймає всі значення з конструктора із визначеними параметрами, окрім зазначених нижче
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {//перевизначаємо конструктор і
        // робимо таким, що приймає всі значення з конструктора із визначеними параметрами, окрім зазначених нижче
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    //додаємо геттери
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }
}