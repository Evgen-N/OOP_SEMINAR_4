import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<>();
        int appleBoxSize1 = 10;

        for (int index = 0; index < appleBoxSize1; index++) {
            box1.addFruct(apple);
        }
        
        Box<Apple> box2 = new Box<>();
        int appleBoxSize2 = 12;

        for (int index = 0; index < appleBoxSize2; index++) {
            box2.addFruct(apple);
        }
        System.out.println("Яблоки.");
        System.out.printf("Коробка Я1 весит: %.2f \n", box1.getBoxWeight());
        System.out.printf("Коробка Я2 весит: %.2f \n", box2.getBoxWeight());
        System.out.println("Равен ли вес коробок Я1 и Я2?: " + box1.compare(box2));
        System.out.println("Пересыпем фрукты из коробки Я1 в коробку Я2");
        box1.pour(box2);
        System.out.printf("Коробка Я1 весит: %.2f \n", box1.getBoxWeight());
        System.out.printf("Коробка Я2 весит: %.2f \n", box2.getBoxWeight());

        Box<Orange> box3 = new Box<>();
        int orangeBoxSize3 = 7;

        for (int index = 0; index < orangeBoxSize3; index++) {
            box3.addFruct(orange);
        }
        
        Box<Orange> box4 = new Box<>();
        int orangeBoxSize4 = 7;

        for (int index = 0; index < orangeBoxSize4; index++) {
            box4.addFruct(orange);
        }
        System.out.println("Апельсины.");
        System.out.printf("Коробка A1 весит: %.2f \n", box3.getBoxWeight());
        System.out.printf("Коробка A2 весит: %.2f \n", box4.getBoxWeight());
        System.out.println("Равен ли вес коробок A1 и A2?: " + box3.compare(box4));
        System.out.println("Пересыпем фрукты из коробки A1 в коробку A2");
        box3.pour(box4);
        System.out.printf("Коробка A1 весит: %.2f \n", box3.getBoxWeight());
        System.out.printf("Коробка A2 весит: %.2f \n", box4.getBoxWeight());
        System.out.println("Равен ли вес коробок Я2 и A2?: " + box2.compare(box4));
    }

}
