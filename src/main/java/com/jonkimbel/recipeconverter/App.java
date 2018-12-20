package com.jonkimbel.recipeconverter;

public class App {
    public static void main(String[] args) {
      AppComponent appComponent = DaggerAppComponent.create();
      appComponent.cli().main(args);
    }
}
