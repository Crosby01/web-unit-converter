# Web Unit Converter

A full-stack unit converter built with Java Spring Boot, HTML, CSS, and JavaScript.

This application allows users to convert:

• Length units
• Weight units
• Temperature units

All conversions happen dynamically through a Spring Boot backend API.

---

# Features

• Length conversion
• Weight conversion
• Temperature conversion
• Dynamic unit switching
• Single-page interface
• Spring Boot REST API backend
• Frontend and backend served from one application
• Runnable `.jar` file included

---

# Technologies Used

## Backend

• Java
• Spring Boot
• Maven

## Frontend

• HTML
• CSS
• JavaScript

---

# Project Structure

```text
converter/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/converter/
│       │       ├── ConverterApplication.java
│       │       └── ConverterController.java
│       │
│       └── resources/
│           └── static/
│               ├── index.html
│               └── script.js
│
├── target/
│   └── converter-0.0.1-SNAPSHOT.jar
│
├── pom.xml
└── README.md
```

---

# Running the Project (Development Mode)

## Prerequisites

Make sure you have installed:

• Java 17+
• Maven

---

## Run the application

Open a terminal inside the project folder and run:

```bash
mvn spring-boot:run
```

---

## Open in browser

```text
http://localhost:8080
```

---

# Running the Application Using the JAR File

A runnable `.jar` file is included inside the `target` folder.

## Run the JAR

```bash
java -jar target/converter-0.0.1-SNAPSHOT.jar
```

---

## Open in browser

```text
http://localhost:8080
```

---

# API Endpoints

## Length Conversion

```text
/convert/length?value=10&from=ft&to=cm
```

---

## Weight Conversion

```text
/convert/weight?value=5&from=kg&to=lb
```

---

## Temperature Conversion

```text
/convert/temperature?value=32&from=f&to=c
```

---

# Supported Units

## Length

• m
• cm
• ft

---

## Weight

• kg
• g
• lb

---

## Temperature

• c
• f
• k

---

# Future Improvements

• Add more unit categories
• Add better UI styling
• Add conversion history
• Add dark mode
• Return JSON responses instead of plain text
• Add database support

---

# Author

Built as a Java Spring Boot learning project focused on understanding:

• REST APIs
• Frontend/backend communication
• Spring Boot architecture
• Maven workflows
• Full-stack application structure
