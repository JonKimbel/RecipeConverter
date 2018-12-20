package com.jonkimbel.recipeconverter.ui;

import static com.google.common.truth.Truth.assertThat;

import com.jonkimbel.recipeconverter.converter.api.Converter;
import com.jonkimbel.recipeconverter.converter.SchemaOrgRecipeConverterImpl;
import com.jonkimbel.recipeconverter.model.RecipeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Test;

public class SchemaOrgRecipeConverterImplTest {

    private Converter converter;

    @Before
    public void setUp() {
      converter = new SchemaOrgRecipeConverterImpl();
    }

    @Test
    public void fromModel() {
      List<RecipeModel> recipes = new ArrayList<>();
      recipes.add(new RecipeModel.Builder().build());

      Stream<String> lines = converter.fromModel(recipes);

      assertThat(lines).hasSize(1);
      assertThat(lines).contains("");
    }

    @Test
    public void toModel() {
      Stream<String> lines = Stream.of("");

      List<RecipeModel> recipes = converter.toModel(lines);

      assertThat(recipes).hasSize(1);
    }
}
