package com.jonkimbel.recipeconverter.ui;

import com.jonkimbel.recipeconverter.ui.api.CommandLineInterface;
import dagger.Module;
import dagger.Binds;

@Module
public abstract class UiModule {
  @Binds
  abstract CommandLineInterface bindCommandLineInterface(
      CommandLineInterfaceImpl impl);
}
