package com.jonkimbel.recipeconverter.model;

import java.util.ArrayList;
import java.util.List;

public final class RecipeModel {
  private final List<String> ingredients;
  private final List<String> instructions;

  private RecipeModel(
      List<String> ingredients,
      List<String> instructions) {
    this.ingredients = ingredients;
    this.instructions = instructions;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public List<String> getInstructions() {
    return instructions;
  }

  public static class Builder {
    private List<String> ingredients = new ArrayList<>();
    private List<String> instructions = new ArrayList<>();

    public Builder() {}

    public Builder(RecipeModel model) {
      this.ingredients = model.getIngredients();
      this.instructions = model.getInstructions();
    }

    public Builder addIngredient(String ingredient) {
      ingredients.add(ingredient);
      return this;
    }

    public Builder addInstruction(String instruction) {
      instructions.add(instruction);
      return this;
    }

    public RecipeModel build() {
      return new RecipeModel(ingredients, instructions);
    }
  }
}
