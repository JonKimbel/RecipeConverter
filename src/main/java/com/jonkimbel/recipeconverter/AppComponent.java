package com.jonkimbel.recipeconverter;

import com.jonkimbel.recipeconverter.cleaner.CleanerModule;
import com.jonkimbel.recipeconverter.converter.ConverterModule;
import com.jonkimbel.recipeconverter.io.IoModule;
import com.jonkimbel.recipeconverter.ui.CommandLineInterface;
import com.jonkimbel.recipeconverter.ui.UiModule;
import dagger.Component;

@Component(modules = {
    CleanerModule.class,
    ConverterModule.class,
    IoModule.class,
    UiModule.class,
})
public interface AppComponent {
  CommandLineInterface cli();
}
