package work_lesson_1.homework_for_yesterday;

public class Circle extends Figures {
    double radiusCircle;
    double abc;

    public Circle(String name, double radiusCircle) {
        super(name);
        this.radiusCircle = radiusCircle;
        abc = (radiusCircle * radiusCircle) * Math.PI;
    }

    double getArea(double length) {
        radiusCircle = (radiusCircle * radiusCircle) * Math.PI;
        return radiusCircle;
    }

    public String toString() {
        return name + " " + abc;
    }
}