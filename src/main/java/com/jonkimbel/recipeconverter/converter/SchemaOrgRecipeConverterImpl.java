package com.jonkimbel.recipeconverter.converter;

import com.jonkimbel.recipeconverter.converter.api.Converter;
import com.jonkimbel.recipeconverter.converter.api.SchemaOrgRecipeConverter;
import com.jonkimbel.recipeconverter.model.RecipeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.inject.Inject;

public class SchemaOrgRecipeConverterImpl
    implements Converter, SchemaOrgRecipeConverter {
  @Inject
  public SchemaOrgRecipeConverterImpl() { }

  @Override
  public Stream<String> fromModel(List<RecipeModel> model) {
    // TODO: implement.
    return Stream.of("");
  }

  @Override
  public List<RecipeModel> toModel(Stream<String> file) {
    List<RecipeModel> recipes = new ArrayList<>();

    // TODO: put in loop.
    RecipeModel.Builder recipeBuilder = new RecipeModel.Builder();
    recipes.add(recipeBuilder.build());

    return recipes;
  }
}
