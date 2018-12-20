# Getting Started

## Workstation setup

1.  Install [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
1.  [Update PATH and JAVA_HOME](https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html)
1.  Install [Maven](https://maven.apache.org/download.cgi)
1.  [Update PATH](https://maven.apache.org/install.html) again

## Building & packaging the app

From the top level of the project, run:

```
mvn package
```

## Running the app

After building, run this from the top level of the project:

```
java -cp target/recipe-converter-1.0-SNAPSHOT.jar com.jonkimbel.recipeconverter.App
```

## Running tests

From the top level of the project:

```
mvn test
```
