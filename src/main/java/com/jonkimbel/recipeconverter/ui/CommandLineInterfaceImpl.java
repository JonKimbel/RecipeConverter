package com.jonkimbel.recipeconverter.ui;

import com.jonkimbel.recipeconverter.io.Reader;
import java.io.IOException;
import javax.inject.Inject;

public final class CommandLineInterfaceImpl implements CommandLineInterface {

  private final Reader reader;

  @Inject
  public CommandLineInterfaceImpl(Reader reader) {
    this.reader = reader;
  }

  @Override
  public void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Need at least one argument.");
      return;
    }

    String path = args[args.length - 1];
    System.out.println(String.format("Reading from file: %s", path));
    System.out.println();

    try {
      reader.readWholeFile(path)
          .forEach(line -> {
            System.out.println(line);
          });
    } catch (IOException e) {
      System.out.println("Error reading from file!");
      return;
    }
  }
}
