package com.jonkimbel.recipeconverter.io;

import com.jonkimbel.recipeconverter.io.api.Console;
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
