package com.sd.basics.lambda;

import java.util.stream.LongStream;

public class LambdaDemo {

  private boolean isPrime(long n) {
    return n > 1
        && LongStream.rangeClosed(2, (long) Math.sqrt(n))
            .noneMatch(divisor -> n % divisor == 0);
  }

  private boolean isPalindrome(long n) {
    return String.valueOf(n).equals((new StringBuilder(
        String.valueOf(n)).reverse()).toString());
  }

  public void displayPalindrome(final long MAX) {
    LongStream.range(1, MAX + 1).parallel().filter(this::isPalindrome)
        .forEach((n) -> System.out.println(n));
  }

  public void displayPrimes(final long MAX) {
    LongStream.range(1, MAX + 1).parallel().filter(
        this::isPrime).forEach((n) -> System.out.println(n));
  }

  public static void main(String[] args) {
    LambdaDemo demo = new LambdaDemo();
    System.out.println("-----Prime-----");
    demo.displayPrimes(3);
    System.out.println("-----Palindrome-----");
    demo.displayPalindrome(100);
  }

}
