package com.jonkimbel.recipeconverter.ui;

import com.jonkimbel.recipeconverter.io.Console;
import com.jonkimbel.recipeconverter.io.Reader;
import java.io.IOException;
import javax.inject.Inject;

public final class CommandLineInterfaceImpl implements CommandLineInterface {

  private final Reader reader;
  private final Console console;

  @Inject
  public CommandLineInterfaceImpl(Reader reader, Console console) {
    this.reader = reader;
    this.console = console;
  }

  @Override
  public void main(String[] args) {
    if (args.length < 1) {
      console.println("Need at least one argument.");
      return;
    }

    String path = args[args.length - 1];
    console.println(String.format("Reading from file: %s", path));
    console.println();

    try {
      reader.readWholeFile(path)
          .forEach(line -> {
            console.println(line);
          });
    } catch (IOException e) {
      console.println("Error reading from file!");
      return;
    }
  }
}
