package lambda;

import collections.practice2.Person;

import java.util.*;
import java.util.stream.Collector;

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
        Author author3 = new Author("Michael", "Diamond");
        Author author4 = new Author("John", "Grisham");
        List<Book> books = Arrays.asList(
                new Book("Becoming", author1, 19.50),
                new Book("The Wonky Donkey", author2, 5.20),
                new Book("Beastie Boys Book", author3, 22.92),
                new Book("The Reckoning: A Novel", author4, 13.89),
                new Book("The Rooster Bar", author4, 9.99)

        );

        Book maxPriceBook = books.stream().max(Comparator.comparingDouble(Book::getPrice)).get();
        System.out.println(maxPriceBook.bookDetails());

        Map<String, String> booksTitles = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthorFullName,
                        Collectors.mapping(Book::getTitle, Collectors.joining(" || "))));
        System.out.println(booksTitles);


        List<Book> sortedByNameBooks = books.stream()
                .sorted(Comparator.comparing(Book::getAuthorFullName))
                .collect(Collectors.toList());
        System.out.println(sortedByNameBooks);

        double allCost = books.stream().mapToDouble(Book::getPrice).sum();
        System.out.println(allCost);

    }
}
