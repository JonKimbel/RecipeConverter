package com.jonkimbel.recipeconverter.ui;

import javax.inject.Inject;

public final class CommandLineInterfaceImpl implements CommandLineInterface {

  @Inject
  public CommandLineInterfaceImpl() {

  }

  @Override
  public void main(String[] args) {
    System.out.println("Hello");
  }
}
