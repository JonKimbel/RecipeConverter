package com.jonkimbel.recipeconverter.converter;

import dagger.Module;
import dagger.Binds;
import com.jonkimbel.recipeconverter.converter.api.*;

@Module
public abstract class ConverterModule {
  @Binds
  abstract PlainTextConverter bindPlainTextConverter(
      PlainTextConverterImpl impl);

  @Binds
  abstract SchemaOrgRecipeConverter bindSchemaOrgRecipeConverter(
      SchemaOrgRecipeConverterImpl impl);
}
