# ✨ Catálogo de Patrones de Diseño en Java ✨

⚡ Bienvenido a este repositorio donde exploramos los **Patrones de Diseño** en Java! ⚡

Los patrones de diseño son soluciones probadas para problemas comunes en el desarrollo de software. Aquí encontrarás una clasificación clara y ejemplos de cada patrón en Java. ☕️

---

## 🔧 Tipos de Patrones

### 🎨 Patrones Creacionales
Estos patrones tratan sobre la creación de objetos, asegurando que sean creados de manera eficiente y flexible.

- 🔍 **Singleton**
- 🏡 **Factory Method**
- 📚 **Abstract Factory**
- 🧑‍🎓 **Builder**
- 🏰 **Prototype**

### 🎭 Patrones Estructurales
Estos patrones ayudan a organizar clases y objetos para formar estructuras más grandes y eficientes.

- 🛠 **Adapter**
- 🧰 **Bridge**
- 🛢 **Composite**
- 🔒 **Decorator**
- 🌐 **Facade**
- 🚀 **Flyweight**
- 🎤 **Proxy**

### 🌟 Patrones de Comportamiento
Estos patrones se centran en la comunicación y la asignación de responsabilidades entre objetos.

- 📚 **Chain of Responsibility**
- 🌟 **Command**
- 🎮 **Interpreter**
- 🔮 **Iterator**
- 🌟 **Mediator**
- 💡 **Memento**
- 🚀 **Observer**
- 📊 **State**
- 🎵 **Strategy**
- 🔄 **Template Method**
- 📝 **Visitor**

---

## 📚 Ejemplo de Uso
Cada patrón viene con su propio ejemplo en Java. Puedes explorarlos en sus respectivas carpetas.

```java
public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
```

---

## 🏅 Contribuciones
✨ ¡Las contribuciones son bienvenidas! Si deseas añadir mejoras o nuevos ejemplos, no dudes en abrir un PR.

---

## 🌐 English Version

# ✨ Java Design Patterns Catalog ✨

⚡ Welcome to this repository where we explore **Design Patterns** in Java! ⚡

Design patterns are proven solutions to common software development problems. Here, you'll find a clear classification and examples of each pattern in Java. ☕️

---

## 🔧 Types of Patterns

### 🎨 Creational Patterns
These patterns deal with object creation, ensuring they are created efficiently and flexibly.

- 🔍 **Singleton**
- 🏡 **Factory Method**
- 📚 **Abstract Factory**
- 🧑‍🎓 **Builder**
- 🏰 **Prototype**

### 🎭 Structural Patterns
These patterns help organize classes and objects to form larger and more efficient structures.

- 🛠 **Adapter**
- 🧰 **Bridge**
- 🛢 **Composite**
- 🔒 **Decorator**
- 🌐 **Facade**
- 🚀 **Flyweight**
- 🎤 **Proxy**

### 🌟 Behavioral Patterns
These patterns focus on communication and responsibility assignment among objects.

- 📚 **Chain of Responsibility**
- 🌟 **Command**
- 🎮 **Interpreter**
- 🔮 **Iterator**
- 🌟 **Mediator**
- 💡 **Memento**
- 🚀 **Observer**
- 📊 **State**
- 🎵 **Strategy**
- 🔄 **Template Method**
- 📝 **Visitor**

---

## 📚 Example Usage
Each pattern comes with its own Java example. You can explore them in their respective folders.

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## 🏅 Contributions
✨ Contributions are welcome! If you want to add improvements or new examples, feel free to open a PR.

