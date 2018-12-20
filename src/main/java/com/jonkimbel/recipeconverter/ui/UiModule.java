package com.jonkimbel.recipeconverter.ui;

import dagger.Module;
import dagger.Binds;

@Module
public abstract class UiModule {
  @Binds
  abstract CommandLineInterface bindCommandLineInterface(
      CommandLineInterfaceImpl impl);
}
