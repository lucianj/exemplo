package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int foo(int a) {
        int b = 12;
        if (a == 1) {
          return b;
        }
        return b;  // Noncompliant
      }
}
