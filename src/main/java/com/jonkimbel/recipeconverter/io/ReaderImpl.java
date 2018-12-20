package com.jonkimbel.recipeconverter.io;

import com.jonkimbel.recipeconverter.io.api.Reader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import javax.inject.Inject;

public class ReaderImpl implements Reader {
  @Inject
  public ReaderImpl() { }

  @Override
  public Stream<String> readWholeFile(String path) throws IOException {
    return Files.lines(Paths.get(path));
  }
}
