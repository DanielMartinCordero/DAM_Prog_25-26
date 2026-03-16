# 🧬 Unit 07: Herencia (Inheritance)

### 🇪🇸 Resumen de la unidad
En esta unidad se explora la **herencia**, uno de los pilares fundamentales de la POO que permite que las características de una clase pasen de "padres" a "hijos". El objetivo principal es la **reutilización de código** y la creación de jerarquías de clases eficientes.

**Conceptos clave aprendidos:**
* **Estructura**: Uso de `extends` para definir subclases a partir de una superclase.
* **Visibilidad**: Implementación del modificador `protected` para permitir acceso en la jerarquía sin exponer datos al exterior.
* **Polimorfismo**: Redefinición de métodos mediante `@Override` y el uso de la **selección dinámica de métodos**.
* **Constructores**: Uso de `super()` para inicializar atributos heredados desde la subclase.
* **Clase Object**: Estudio de la raíz de Java y sobreescritura de métodos universales como `toString()` y `equals()`.
* **Abstracción**: Creación de clases y métodos `abstract` que delegan la implementación a sus hijos.

---

### 🇺🇸 Unit Overview
This unit focuses on **Inheritance**, a core OOP pillar that allows characteristics to be passed from parent classes to child classes. The main goal is **code reusability** and building robust class hierarchies.

**Key Technical Skills:**
* **Keywords**: Mastering `extends` for class definition and `super` for member access.
* **Method Overriding**: Implementing `@Override` to modify inherited behaviors.
* **Root Hierarchy**: Understanding the `Object` class and its core methods.
* **Abstract Patterns**: Designing abstract classes to define common protocols for sub-types.

---

## 🛠️ Práctica Realizada (A00)
Se ha implementado una jerarquía basada en el ejemplo de los apuntes:
1.  **Persona (Superclase)**: Atributos privados con visibilidad controlada mediante getters/setters para subclases.
2.  **Empleado / Cliente (Subclases)**: Especialización de la clase Persona añadiendo atributos propios como `salario` o `presupuesto`.
3.  **Main**: Demostración de la **Selección Dinámica de Métodos** trabajando con diferentes tipos de objetos bajo una referencia común.
