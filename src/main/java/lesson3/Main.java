package lesson3;

import java.util.Arrays;

public class Main {

    /**
     1. Написать метод, который меняет два элемента массива местами (массив может быть любого
     ссылочного типа);
     2. Задача:
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
     фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList (ArrayList обсудим
     на следующем уроке);
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
     и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
     коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
     равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
     апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
     объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {

        Integer[] Array = new Integer[2];

        Array[0] = 10;
        Array[1] = 20;

        System.out.print(Arrays.toString(Array));
        swap(Array, 0, 1);
        System.out.println(Arrays.toString(Array));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Orange> box1 = new Box<Orange>(orange1, orange2, orange3);
        Box<Apple> box2 = new Box<Apple>(apple1, apple2, apple3, apple4, apple5, apple6);

        System.out.println(box1.compare(box2));

        Box<Apple> box3 = new Box<Apple>();
        box2.move(box3);
    }
    public static void swap(Object[] a, int index, int index1) {
        Object b = a[index];
        a[index] = a[index1];
        a[index1] = b;
    }

}
