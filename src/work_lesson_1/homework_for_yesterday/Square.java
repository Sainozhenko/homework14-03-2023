package work_lesson_1.homework_for_yesterday;

public class Square extends Figures {
    double perimeterSquare;

    public Square(double length, String name) {
        super(length, name);

        perimeterSquare = length * length;
    }

    double getArea(double length) {
        perimeterSquare = length * length;
        return perimeterSquare;
    }

    public String toString() {
        return name + " " + perimeterSquare;
    }

}
