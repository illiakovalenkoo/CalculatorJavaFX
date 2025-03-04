# CalculatorFX2

📌 **CalculatorFX2** is a graphical calculator application built using **JavaFX 23** and **Java 23**. It provides a simple and intuitive user interface for performing mathematical calculations.

## 🚀 Getting Started

### **1. Running the application (Windows)**
#### **Option 1: Using the `.exe` file**
Download and run **[calculatorFX2.exe](./calculatorFX2.exe)**.

#### **Option 2: Running the `.jar` file**
If you have Java 17+ installed, you can run the application using:
```sh
java -jar target/calculatorFX2.jar
```
If JavaFX is missing, use:
```sh
java --module-path "C:\javafx-sdk-23.0.2\lib" --add-modules javafx.controls,javafx.fxml -jar target/calculatorFX2.jar
```

## 📂 Project Structure
```
calculatorFX2/
│── src/                     # Source code
│   ├── main/
│   │   ├── java/            # Java classes
│   │   ├── resources/       # FXML & assets
│   ├── test/                # Unit tests (if available)
│── target/                  # Compiled JAR file
│── calculatorFX2.exe        # Executable file for Windows
│── README.md                # Project documentation
│── .gitignore               # Ignored files for Git
│── pom.xml                  # Maven dependencies
```

## ⚙️ Technologies Used
- **Java 23**
- **JavaFX 23**
- **Maven**
- **Launch4j (for `.exe` generation)**

## 🧪 Testing the Application
The application has been tested for:
- **Basic mathematical operations**
- **User input validation**
- **Graphical interface responsiveness**
- **Performance on different screen resolutions**

📸 *(Insert test screenshots here)*

## 🔧 Building from Source
To compile and run the project manually:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/your-github-username/CalculatorFX2.git
   cd CalculatorFX2
   ```

2. **Compile using Maven**:
   ```sh
   mvn clean package
   ```

3. **Run the application**:
   ```sh
   java -jar target/calculatorFX2.jar
   ```

## 📝 License
This project is distributed under the **MIT License**.

📧 Feel free to reach out if you have any questions!
