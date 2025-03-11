# CalculatorJavaFX

**CalculatorJavaFX** is a graphical calculator application built using **JavaFX 23** and **Java 23**. It provides a simple and intuitive user interface for performing mathematical calculations.

## 1. How to Download and Run the Project

### **Prerequisites**

To run this project, you need to have:

- **Java Development Kit (JDK) 23** installed. Download from [Oracle](https://www.oracle.com/java/technologies/javase/jdk23-archive-downloads.html) or use OpenJDK.
- **JavaFX SDK 23** installed. Download from [GluonHQ](https://gluonhq.com/products/javafx/) or [OpenJFX](https://openjfx.io/).

### **Windows**

1. **Download the repository**:

   ```sh
   git clone https://github.com/your-github-username/CalculatorFX2.git
   cd CalculatorFX2
   ```

2. **Run the application**:

   - **Option 1: Using the `.exe` file**  
     Download and run [**calculatorFX2.exe**](./calculatorFX2.exe).

   - **Option 2: Running the `.jar` file**  
     Ensure you have JDK 23 installed. Run:

     ```sh
     java -jar calculatorFX2.jar
     ```

     If JavaFX is missing, use:

     ```sh
     java --module-path "your_full_path_to_javafx_sdk\lib" --add-modules javafx.controls,javafx.fxml -jar "your_full_path_to_project\target\calculatorFX2.jar"
     ```
     For example, Windows and 23.0.2 SDK version:

     ```sh
     java --module-path "C:\Users\user\Downloads\openjfx-23.0.2_windows-x64_bin-sdk\javafx-sdk-23.0.2\lib" --add-modules javafx.controls,javafx.fxml -jar "C:\Users\user\IdeaProjects\calculatorFX2\src\calculatorFX2\out\artifacts\calculatorFX2_jar\calculatorFX2.jar"
     ```

### **Linux**

1. **Download the repository**:

   ```sh
   git clone https://github.com/your-github-username/CalculatorFX2.git
   cd CalculatorFX2
   ```

2. **Install Java and JavaFX (if not installed)**:

   ```sh
   sudo apt update && sudo apt install openjdk-23-jdk
   wget https://download2.gluonhq.com/openjfx/23/openjfx-23_linux-x64_bin-sdk.zip
   unzip openjfx-23_linux-x64_bin-sdk.zip
   ```

3. **Run the application**:

   ```sh
   java -jar calculatorFX2.jar
   ```

   If JavaFX is missing, use:

   ```sh
   java --module-path "your_full_path_to_javafx/lib" --add-modules javafx.controls,javafx.fxml -jar target/calculatorFX2.jar
   ```
   For example, Windows and 23.0.2 SDK version: 

   ```sh
   java --module-path "C:\Users\user\Downloads\openjfx-23.0.2_windows-x64_bin-sdk\javafx-sdk-23.0.2\lib" --add-modules javafx.controls,javafx.fxml -jar "C:\Users\user\IdeaProjects\calculatorFX2\src\calculatorFX2\out\artifacts\calculatorFX2_jar\calculatorFX2.jar"
   ```
## 2. Project Structure

```
CalculatorJavaFX/                     # Root project directory
│── src/                               # Source code of the application
│── images/                            # Screenshots of tests
│── doc/                               # README file
```

## 3. Technologies Used

- **Java 23**
- **JavaFX 23**
- **Maven**
- **Launch4j** (for `.exe` generation)

## 4. Application Testing

The application has been tested for:

- **Basic mathematical operations**
- **User input validation**
- **Graphical interface responsiveness**
- **Performance on different screen resolutions**

### `images/` Folder

A test images have been added to the `images/` folder for UI verification.

## 5. License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software with no restrictions. The software is provided "as is", without warranty of any kind. Learn from it, modify it, and use it as needed.

