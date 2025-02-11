# 🏫 OOP-Based-Classroom-Decoration-Cost-Calculator-Java-Implementation

This project is a **Java-based classroom decoration cost calculator** that follows **Object-Oriented Programming (OOP)** principles, including **Inheritance, Polymorphism, and the Builder Design Pattern**. The program reads input files containing classroom dimensions and decoration options, then calculates the total cost based on predefined rules.

## 📌 Features
- **Supports Circular & Rectangular Classrooms**: Each classroom type has different decoration rules.
- **Wall & Flooring Decoration Options**:
  - **Walls**: Can be decorated with **paint, wallpaper, or tiles**.
  - **Floors**: Can **only be decorated with tiles**.
- **Calculation Rules**:
  - Circular classrooms **can only have painted walls**.
  - Flooring cost is based on **the number of tiles needed**.
  - Wall decoration costs are calculated based on **area (for paint/wallpaper) or tile count**.
- **Builder Design Pattern**: Used for constructing classroom objects.
- **File-Based Input & Output**: Reads input data from files and writes results to an output file.

## 🎮 How It Works
1. The program reads classroom data (`items.txt`) and decoration choices (`decoration.txt`).
2. It calculates **wall and flooring decoration costs** for each classroom.
3. The total cost is rounded **up to the nearest integer**.
4. The results are stored in `output.txt`.

## 🚀 Running the Program
Compile and run the game using:
```bash
javac8 Main.java
java8 Main items.txt decoration.txt output.txt


