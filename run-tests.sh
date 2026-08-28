#!/bin/bash
# Run JUnit tests
rm -rf out && mkdir -p out
javac -cp lib/junit-platform-console-standalone-1.10.2.jar \
  -d out \
  src/main/java/com/example/NumberAnalyzer.java \
  src/test/java/com/example/NumberAnalyzerTest.java
java -jar lib/junit-platform-console-standalone-1.10.2.jar \
  -cp out \
  --scan-classpath
