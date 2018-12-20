package com.jonkimbel.recipeconverter;

import com.jonkimbel.recipeconverter.converter.ConverterModule;
import com.jonkimbel.recipeconverter.io.IoModule;
import com.jonkimbel.recipeconverter.ui.api.CommandLineInterface;
import com.jonkimbel.recipeconverter.ui.UiModule;
import dagger.Component;

@Component(modules = {
    ConverterModule.class,
    IoModule.class,
    UiModule.class,
})
public interface AppComponent {
  CommandLineInterface cli();
}
