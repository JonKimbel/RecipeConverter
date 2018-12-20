package com.jonkimbel.recipeconverter.io;

import javax.inject.Inject;

public class ConsoleImpl implements Console {
  @Inject
  public ConsoleImpl() {}

  @Override
  public void println() {
    System.out.println();
  }

  @Override
  public void println(String line) {
    System.out.println(line);
  }
}
