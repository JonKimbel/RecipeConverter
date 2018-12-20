package com.jonkimbel.recipeconverter;

import com.jonkimbel.recipeconverter.ui.CommandLineInterface;
import com.jonkimbel.recipeconverter.ui.UiModule;
import dagger.Component;

@Component(modules = UiModule.class)
public interface AppComponent {
  CommandLineInterface cli();
}
