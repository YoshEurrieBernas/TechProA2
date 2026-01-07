package com.tutorialspoint;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ScannerDemo {
   public static void main(String[] args) {

      String s = "Hello World! 3 + 3.0 = 6";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      Stream<MatchResult> stream = scanner.findAll(Pattern.compile(".ello"));
      
      stream.forEach(i -> System.out.println(i.group()));
      
      // print the next line of the string
      System.out.println(scanner.nextLine());

      // close the scanner
      scanner.close();
   }
}
