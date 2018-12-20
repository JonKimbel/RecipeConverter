package com.jonkimbel.recipeconverter.converter.api;

import com.jonkimbel.recipeconverter.model.RecipeModel;
import java.util.List;
import java.util.stream.Stream;

public interface Converter {
  Stream<String> fromModel(List<RecipeModel> model);
  List<RecipeModel> toModel(Stream<String> file);
}
