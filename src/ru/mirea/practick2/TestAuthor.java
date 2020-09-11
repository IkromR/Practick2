package ru.mirea.practick2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Popov", "ivPopov@gmail.com",'M');
        System.out.println(a1);
        Author a2 = new Author("Anna Ivanova", "ivPopov@gmail.com",'F');
        System.out.println(a2);
    }
}
