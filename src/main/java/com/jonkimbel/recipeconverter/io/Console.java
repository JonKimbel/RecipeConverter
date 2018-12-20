package com.jonkimbel.recipeconverter.io;

/**
 * Abstraction for System.out to allow for testing of console output in unit
 * tests.
 */
public interface Console {
  void println();
  void println(String line);
}
