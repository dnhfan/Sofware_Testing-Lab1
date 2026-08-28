# Lab 1 - NumberAnalyzer

## Program Overview

Java program with a loop and branching logic for testing purposes.

## Project Structure

```
src/main/java/com/example/
├── NumberAnalyzer.java   # Core logic
└── Main.java             # Entry point
```

## How It Works

### NumberAnalyzer.analyze(int[] numbers)

1. Initialize `result = 0`
2. Loop through each number in the array:
   - If number > 0 → add it to `result`
   - Else (number ≤ 0) → subtract it from `result`
3. Return `result`

### Execution Flow (Input: [10, -5, 3])

| Iteration | Number | Condition | Operation | Result |
|-----------|--------|-----------|-----------|--------|
| 1 | 10 | 10 > 0 (true) | 0 + 10 | 10 |
| 2 | -5 | -5 > 0 (false) | 10 - (-5) | 15 |
| 3 | 3 | 3 > 0 (true) | 15 + 3 | 18 |

**Output:** `Result = 18`

## Compile & Run

```bash
javac -d out src/main/java/com/example/NumberAnalyzer.java src/main/java/com/example/Main.java
java -cp out com.example.Main
```

## Test Cases

| Input | Expected Output | Description |
|-------|-----------------|-------------|
| `{10, -5, 3}` | 18 | Mixed positive/negative |
| `{}` | 0 | Empty array |
| `{1, 2, 3}` | 6 | All positive |
| `{-1, -2, -3}` | 6 | All negative |
| `{0}` | 0 | Zero value |
