package com.jonkimbel.recipeconverter.io;

import dagger.Module;
import dagger.Binds;

@Module
public abstract class IoModule {
  @Binds
  abstract Reader bindReader(ReaderImpl impl);

  @Binds
  abstract Console bindConsole(ConsoleImpl impl);
}
