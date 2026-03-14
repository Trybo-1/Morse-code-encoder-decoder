# Morse Code Converter (Java)

## Overview

The **Morse Code Converter** is a Java program that translates **plain text into Morse code and Morse code back into plain text**.

The application demonstrates core Java programming concepts such as string manipulation, loops, conditionals, and data mapping between characters and Morse code patterns.

This project was developed as part of a Computer Science programming assignment.

---

## Features

* Convert **Text → Morse Code**
* Convert **Morse Code → Text**
* Supports:

  * Alphabetic characters (A–Z)
  * Numeric characters (0–9)
* Word separation using `/` in Morse code
* Console-based user interaction

---

## Example

### Text → Morse

Input

```
HELLO
```

Output

```
.... . .-.. .-.. ---
```

---

### Morse → Text

Input

```
.... . .-.. .-.. ---
```

Output

```
HELLO
```

---

## Project Structure

```
src/
│
├── Main.java
│
└── acsse/
    └── csc2a/
        └── MorseCodeConverter.java
```

### File Descriptions

**Main.java**

* Contains the main program entry point.
* Handles user interaction and calls the conversion methods.

**MorseCodeConverter.java**

* Implements the logic for converting:

  * Text → Morse
  * Morse → Text
* Stores the Morse code mappings.

---

## Requirements

* Java Development Kit (**JDK 8 or later**)
* Command line terminal or an IDE such as:

  * IntelliJ
  * Eclipse
  * VS Code

---

## How to Compile

From the project root directory run:

```bash
javac src/Main.java src/acsse/csc2a/MorseCodeConverter.java
```

---

## How to Run

```bash
docs\build.bat
```

---

## Concepts Demonstrated

* Java classes and methods
* String processing
* Loops (`for`, `while`)
* Conditional logic
* Data mapping between characters and Morse code
* Basic program structure

---

##

---

## Author

Created as part of a Computer Science assignment.
