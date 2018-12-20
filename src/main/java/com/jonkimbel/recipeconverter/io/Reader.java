package com.jonkimbel.recipeconverter.io;

import java.io.IOException;
import java.util.stream.Stream;

public interface Reader {
  Stream<String> readWholeFile(String path) throws IOException;
}
