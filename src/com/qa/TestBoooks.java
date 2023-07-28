package com.qa;

public class TestBoooks {
    public static void main(String[] args) {
        String[] arr = {"Mike", "Martina", "Maya"};
        Book b1 = new Book("title", arr, 10.11);
        Book b2 = new Book("title2", arr, 11.11);
        System.out.println(b1);
        System.out.println(b2);

        Book[] bookList = new Book[2];

        bookList[0] = b1;
        bookList[1] = b2;

        for(int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i]);
        }
    }

}
