#!/bin/bash
# Run application
javac -d out src/main/java/com/example/NumberAnalyzer.java src/main/java/com/example/Main.java
java -cp out com.example.Main
