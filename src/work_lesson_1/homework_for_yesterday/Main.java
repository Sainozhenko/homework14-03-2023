package work_lesson_1.homework_for_yesterday;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата, круга:
        //Создать классы Circle, Rectangle, Square.
        //В классах должен быть метод getArea, осуществляющий подсчет соответствующей площади
        //В методе main класса Main создать массив или лист содержащий обьекты этих классов и вывести на экран площади фигур, содержащиеся в этом массиве а также название фигуры.
        //Подумать, должны ли быть созданы для выполнения задачи еще какие-то классы/класс и поля в классе/классах
        //
        //Пример вывода на печать:
        //Circle has area of 200
        //Rectangle has area of 50.0
        //Square has area of 30.0
        Rectangle rectangle = new Rectangle("rectangel", 10, 15);

        Square square = new Square(15, "Square");

        Circle circle = new Circle("Circle", 10);

        List<Figures> figuresList = List.of(rectangle, circle, square);

        System.out.println(figuresList);
    }
}

