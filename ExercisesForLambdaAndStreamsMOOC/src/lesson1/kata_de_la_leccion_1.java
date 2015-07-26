/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.io.PrintStream;
import java.util.stream.Collectors;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 */
public class Lesson1 {

  /**
   * All exercises should be completed using Lambda expressions and the new
   * methods added to JDK 8 where appropriate. There is no need to use an
   * explicit loop in any of the code. Use method references rather than full
   * lambda expressions wherever possible.
   */
  /**
   * Exercise 1
   *
   * Create a string that consists of the first letter of each word in the list
   * of Strings provided.
   *
   * list is not empty. Strings in list are not null or the empty string.
   */
  public String exercise1(List<String> list) {
    /* YOUR CODE HERE */
    StringBuilder firstLetters = new StringBuilder();
    list.forEach(s -> firstLetters.append(s.substring(0, 1)) );
    return firstLetters.toString();
  }

  /**
   * Exercise 2
   *
   * Remove the words that have odd lengths from the list. Change the input list.
   */
  public void exercise2(List<String> list) {
    /* YOUR CODE HERE */
    list.removeIf(s -> s.length() % 2 != 0);
    System.out.println(list);
  }

  /**
   * Exercise 3
   *
   * Replace every word in the list with its upper case equivalent. Change the input list.
   *
   * list is not empty. Strings in list are not null or the empty string.
   */
  public void exercise3(List<String> list) {
    /* YOUR CODE HERE */
    list.replaceAll(s -> s.toUpperCase());
    System.out.println(list);
  }

  /**
   * Exercise 4
   *
   * Convert every key-value pair of the map into a string and append them all
   * into a single string, in iteration order.
   * 
   * The output should follow the format: "key1=1, key2=2, key3=3"
   *
   * The input is never empty and the keys are not null or the empty string.
   */
  public String exercise4(Map<String, Integer> map) {
    /* YOUR CODE HERE */
    StringBuilder stringResult = new StringBuilder();
    map.forEach((k, v) -> stringResult.append(k).append("=").append(v).append(", "));
    return stringResult.substring(0, stringResult.length() - 2).toString();
  }

  /**
   * Exercise 5
   *
   * Create a new thread that prints the numbers from the list. Print output to the 'out' argument
   * instead of System.out.
   *
   * The list is never null or empty or contains null.
   *
   * The printed numbers must be separated by a white-space character.
   */
  public void exercise5(List<Integer> list, PrintStream out) {
    /* YOUR CODE HERE */
    new Thread(() -> list.forEach(n -> out.println(n))).start();
  }
}
