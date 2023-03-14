package work_lesson_1.homework_for_yesterday;

public class Rectangle extends Figures {

    double perimeterOfRectangle;


    public Rectangle(String name, double length, double weight) {
        super(weight, length, name);
        perimeterOfRectangle = weight * length;
    }

    double getArea(double weight, double length) {
        perimeterOfRectangle = weight * length;
        return perimeterOfRectangle;
    }

    public String toString() {
        return name + " " + perimeterOfRectangle;
    }
}
