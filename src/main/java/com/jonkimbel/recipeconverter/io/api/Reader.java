package com.jonkimbel.recipeconverter.io.api;

import java.io.IOException;
import java.util.stream.Stream;

/** Abstraction for Java file IO to allow for mocking in unit tests. */
public interface Reader {
  Stream<String> readWholeFile(String path) throws IOException;
}
