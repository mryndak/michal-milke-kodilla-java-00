package com.kodilla.stream;

//import com.kodilla.stream.lambda.ExecuteSaySomething;
//import com.kodilla.stream.lambda.Processor;
//import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
////        SaySomething saySomething = new SaySomething();
////        saySomething.say();
//        processor.execute(executeSaySomething);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("HWDP", "SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated + decoration));
        poemBeautifier.beautify("","SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.toUpperCase()));
        poemBeautifier.beautify("*-*", "SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.toLowerCase() + decoration));
        poemBeautifier.beautify("<>", "SetTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.replace('T', 't') + decoration));

        System.out.println("Using Stream to generate even numbers from 0 to 20");
        NumbersGenerator.generateEven(20);
    }
}
