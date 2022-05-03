package org.example.streamapi;

import org.example.streamapi.model.Bodybuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;


public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */


    // going through list item by item, x is basically name, so for each x (name) print x

    public void printNames(List<String> names)
    {

          names

             .forEach
                     (x ->
                             System.out.println(x));




    }


    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {

        //creating variable to store everything + then return it

        numbers=

        numbers
                .stream()

                    .filter
                            (n -> n % 2 ==0).toList();



        return numbers ;
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */

    // INT ARRAYS---------------------------------------------
    public int[] doubleInts(int[] numbers) {


//         Arrays.stream(numbers).map(n->n*2).toArray();

        //lets store this inside a variable doubling so then we can return it much simply

        numbers =
                  Arrays.stream(numbers)
                 .map(n->n*2)
                 .toArray();


        return  numbers;
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {


        //as list returns a list view of the array

        // store the splitted string in toCaps variable

        List<String> toCaps = Arrays.asList(input.split(""));

/*
        // next do:

         toCaps
                  .stream()
                        .map(
                             (c -> c.toUpperCase()));

*/

        toCaps= toCaps
                .stream().map(c -> c.toUpperCase()).toList();


        return  toCaps;
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */


    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {


        // Take list of animals

        list = list

                .stream()                                   // stream to get access to richer methods
                .filter(l -> l.startsWith(letter))          // filter letters that start with a given letter
                .map(l -> l.toUpperCase())                  // convert string elements to uppercase
                .sorted()                                   // sort the elements
                .toList();                                  // once everything is done, convert back toList


        return list;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {


        words = words

                .stream()
                .filter(
                        w -> w.length()< maxLength && w.startsWith(firstLetter))       // note could also use 2 filters
                .toList();



        return words;
    }
}