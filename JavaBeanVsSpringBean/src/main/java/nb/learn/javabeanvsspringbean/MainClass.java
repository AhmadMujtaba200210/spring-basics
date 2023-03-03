package nb.learn.javabeanvsspringbean;

import java.io.Serializable;

class Pojo{
    private String text;
    private int number;

    @Override
    public String toString() {
        return "Pojo{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
class JavaBean implements Serializable { //EJB: Enterprise Java Bean
    // 1: EJB will have no argument constructor
    private String text;
    private int number;
    public JavaBean() {
    }
    //2: public getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // EJB class is serialization
}
public class MainClass {
    public static void main(String[] args) {
        Pojo pojo= new Pojo(); // POJO: Plain Old Java Object. Every java object is Pojo
        System.out.println(pojo);
    }
}
