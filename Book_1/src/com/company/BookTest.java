package com.company;

public class BookTest {

    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Книга, созданная конструктором по умолчанию:");
        System.out.println(b1);

        Book b2 = new Book("Белый клык", "Джек Лондон");
        System.out.println("Книга, созданная конструктором с частичной инициализацией:");
        System.out.println(b2);

        Book b3 = new Book("Мастер и Маргарита", "Михаил Афанасьевич Булгаков", "Просвещение", 15000, 1865);
        System.out.println("Книга, созданная консруктором со всеми полями:");
        System.out.println(b3);

        System.out.println("Изменение количества экземпляров на 0:");
        b3.setEdition(0);
        System.out.println(b3);
        
        System.out.println("Publisher = " + b3.getPublisher());
        System.out.println("Publish Year = " + b3.getPublishYear());
        System.out.println("Изменение количества экземпляров на 100:");
        b3.setEdition(100);
        System.out.println(b3);
        System.out.println("Publisher = " + b3.getPublisher());
        System.out.println("Publish Year = " + b3.getPublishYear());
    }
}
