# 📖 CalculatorFX2 - Documentation

## 📌 Introduction
CalculatorFX2 is a graphical calculator application developed using **JavaFX**. This guide explains how to install, run, and use the application, as well as how to contribute to its development.

## 🖥️ Installation
### **Option 1: Using the `.exe` (Windows)**
1. Download `calculatorFX2.exe`.
2. Double-click the file to run it.

### **Option 2: Running the `.jar` (Cross-platform)**
1. Ensure **Java 17+** is installed.
2. Open a terminal and run:
   ```sh
   java -jar calculatorFX2.jar
   ```

## 🔢 How to Use the Calculator
1. **Enter a mathematical expression** using the on-screen buttons or keyboard.
2. **Press "="** to see the result.
3. **Use "C"** to clear the input.
4. **Supports basic operations**: `+, -, *, /`
5. **Supports advanced functions**: `sqrt(x), sin(x), cos(x), log(x)`

📸 *(Insert UI screenshot here)*

## 🏗️ Project Structure
```
calculatorFX2/
│── src/main/java/org/feodal/calculatorfx2/
│   ├── controllers/     # JavaFX controllers
│   ├── views/           # FXML & UI components
│   ├── models/          # Business logic
│── src/main/resources/  # FXML files & assets
│── pom.xml              # Maven dependencies
│── README.md            # Documentation
│── target/              # Compiled output
```

## 🏛️ MVC Architecture
- **Model** (`models/`) → Handles data & calculations.
- **View** (`views/`) → Contains FXML files & UI.
- **Controller** (`controllers/`) → Controls user interactions.

📸 *(Insert architecture diagram here)*

## 🧪 Running Tests
```sh
mvn test
```
- Uses **JUnit 5** for unit testing.
- Tests are located in `src/test/java/`.

## 🚀 Packaging the Application
### **1. Creating a JAR**
```sh
mvn clean package
```
### **2. Creating an EXE (Windows)**
```sh
jpackage --name CalculatorFX2 --input target --main-jar calculatorFX2.jar --main-class org.feodal.calculatorfx2.HelloApplication --type exe --dest output
```

## 📬 Contributing
Feel free to **submit issues** or **pull requests** on GitHub.

📧 Contact: [your-email@example.com]
