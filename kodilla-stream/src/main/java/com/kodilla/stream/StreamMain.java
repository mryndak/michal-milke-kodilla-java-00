package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.YEARS;

public class StreamMain {
    public static void main(String[] args) {

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getTheForumUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getNumberOfPosts()> 0)
                .filter(forumUser -> YEARS.between(forumUser.getDateOfBirth(), LocalDate.now()) >= 20)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser ));

        //        Map<String, ForumUser> stringForumUserMap = forum.getTheForumUserList().contains(forum);

//        System.out.println(theResultMapOfUsers);
//        System.out.println("# elements: " + theResultMapOfUsers.size());
//        theResultMapOfUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue().getUserName())
//                .forEach(System.out::println);
//        theResultMapOfUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue().getNumberOfPosts())
//                .forEach(System.out::println);
//        theResultMapOfUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue().getGender())
//                .forEach(System.out::println);
//        theResultMapOfUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue().getUserId())
//                .forEach(System.out::println);
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);
//        Person.getList().stream()
//                .map(s -> s.toUpperCase())
//                .forEach(System.out::println);
//
//        System.out.println(" ");
//
//        Person.getList().stream()
//                .map(s -> s.toLowerCase())
//                .forEach(System.out::println);
//
//        System.out.println(" ");
//
//        Person.getList().stream()
//                .map(s -> s.charAt(3))
//                .forEach(System.out::println);
//
//        System.out.println(" ");
//
//        Person.getList().stream()
//                .map(s -> s.charAt(5))
//                .forEach(System.out::println);
//
//        System.out.println(" ");
//
//        Person.getList().stream()
//                .filter(s -> s.length() > 16)
//                .forEach(System.out::println);
//
//        System.out.println(" ");
//
//        Person.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);


//        System.out.println("Welcome to module 7 - Stream");
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();
//        processor.execute(executeSaySomething);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("HWDP", "SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated + decoration));
//        poemBeautifier.beautify("","SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.toUpperCase()));
//        poemBeautifier.beautify("*-*", "SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.toLowerCase() + decoration));
//        poemBeautifier.beautify("<>", "SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.replace('T', 't') + decoration));

//        System.out.println("Using Stream to generate even numbers from 0 to 20");
//        NumbersGenerator.generateEven(200);
    }

