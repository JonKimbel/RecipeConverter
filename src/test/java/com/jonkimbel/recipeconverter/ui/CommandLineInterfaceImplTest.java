package com.jonkimbel.recipeconverter.ui;

import static org.mockito.Mockito.*;
import static com.google.common.truth.Truth.assertThat;

import com.jonkimbel.recipeconverter.io.Console;
import com.jonkimbel.recipeconverter.io.Reader;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
public class CommandLineInterfaceImplTest {
    @Mock Reader mockReader;
    @Mock Console mockConsole;

    private CommandLineInterface cli;

    @Before
    public void setUp() {
      cli = new CommandLineInterfaceImpl(mockReader, mockConsole);
    }

    @Test
    public void noArgs_exitsEarly() {
      String[] args = new String[0];

      cli.main(args);

      verify(mockConsole).println("Need at least one argument.");
    }

    @Test
    public void nonExistentFile_exitsEarly() throws IOException {
      String[] args = {"fake path"};
      when(mockReader.readWholeFile(any())).thenThrow(IOException.class);

      cli.main(args);

      verify(mockConsole).println("Error reading from file!");
    }

    @Test
    public void existentFile_printsFile() throws IOException {
      String[] args = {"fake path"};
      when(mockReader.readWholeFile("fake path"))
          .thenReturn(Stream.of("line1", "line2"));

      cli.main(args);

      verify(mockConsole).println("line1");
      verify(mockConsole).println("line2");
    }
}
