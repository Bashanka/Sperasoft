package lambda;

import collections.practice2.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        // Practice 1
        List<Person> people = Arrays.asList(
                new Person("Andrew", 20),
                new Person("Andrew", 29),
                new Person("John", 40),
                new Person("Alex", 24),
                new Person("Mary", 30),
                new Person("Rose", 15),
                new Person("Viola", 27)
        );

        List<String> strArr = people.stream()
                .filter(person -> (person.getAge() >= 20 && person.getAge() <= 30))
                .map(name -> name.getName().toUpperCase())
                .sorted(Comparator.comparingInt(String::length))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(strArr);
        System.out.println();

        // Practice 2
        Author author1 = new Author("Michelle", "Obama");
        Author author2 = new Author("Craig", "Smith");
        Author author3 = new Author("Joanna", "Gaines");
        Author author4 = new Author("Jeff", "Kinney");
        List<Book> books = Arrays.asList(
                new Book("Becoming", author1, 19.50),
                new Book("The Wonky Donkey", author2, 5.20),
                new Book("Homebody: A Guide to Creating Spaces You Never Want to Leave", author3, 20.43),
                new Book("Magnolia Table: A Collection of Recipes for Gathering", author3, 13.73),
                new Book("Diary of a Wimpy Kid Book 13", author4, 6.69)
        );

        Book maxPriceBook = books.stream().max(Comparator.comparingDouble(Book::getPrice)).get();
        System.out.println(maxPriceBook.bookDetails());

        String booksTitles = books.stream()
                .filter(book -> book.getAuthor() == author3)
                .map(Book::getTitle)
                .collect(Collectors.joining(" "));
        System.out.println(booksTitles);


        List<Book> sortedByNameBooks = books.stream()
                .sorted(Comparator.comparing(Book::getAuthorFullName))
                .collect(Collectors.toList());
        System.out.println(sortedByNameBooks);

        double allCost = books.stream().mapToDouble(Book::getPrice).sum();
        System.out.println(allCost);

    }

}
