# Proyecto Java – Clasificación de Animales y Gestión de Personas  
**Autor:** Marlon Monterrosa Muñoz  

---

## 📌 Descripción general

Este proyecto en Java se divide en **dos ejercicios principales**, enfocados en:

1. **Clasificación de Animales** según su tipo (terrestre, acuático, aéreo).
2. **Gestión de Personas** usando programación orientada a objetos, colecciones, y programación funcional con lambdas y streams.

---

## 🐾 Ejercicio 1 – Clasificador de Animales

### ✨ Funcionalidad

- Se creó una clase `Animal` con los atributos:
  - `nombre` (String)
  - `tipo` (terrestre, acuático o aéreo)
  - `género` (masculino o femenino)

- Se usa una lista `List<Animal>` para registrar animales por consola.
- Se usa un mapa `Map<String, List<Animal>>` para clasificar animales según su tipo.
- Se permite ingresar los datos por consola, eligiendo el tipo y género con números o letras.
- Se muestra la lista final de animales clasificados por tipo.

### 🧪 Tecnologías usadas
- Java 
- Scanner
- Colecciones (`ArrayList`, `TreeMap`)
- Condicionales (`switch`)
- Métodos auxiliares (`capitalize()`)

---

## 🧍 Ejercicio 2 – Gestión de Personas y Operaciones con Streams

### 👤 Clase `Persona`

Atributos:
- `nombre`, `apellido`
- `edad`, `género` (masculino/femenino)
- `sueldoHora`
- `cargo` (ej. Director, Desarrollador)

Se implementaron getters, setters, un constructor, y el método `toString()` para imprimir los datos de manera legible.

---

### 🧠 Operaciones realizadas con Lambdas y Streams

Después de registrar múltiples personas por consola, se realizaron las siguientes operaciones:

#### 🔹 Punto 2: Operaciones básicas
- Contar cuántas personas hay.
- Calcular el promedio de edades.
- Contar personas mayores de edad.
- Mostrar personas cuyos **nombres empiecen con “A”** (ignora mayúsculas o minúsculas).
- Mostrar personas cuyos **apellidos contengan la letra “M”**.

#### 🔹 Punto 3: Operaciones avanzadas
- Mostrar el **sueldo por 8 horas** de todos los **directores masculinos** usando `map`, `peek`, `forEach`.
- Buscar la **primera desarrolladora mujer** con `filter` y `findFirst`.
- Mostrar el **desarrollador que más gana por hora** usando `filter` y `max`.

---

## 🧪 Tecnologías usadas en el segundo punto

- Java 
- `List`, `ArrayList`
- `Stream API`
  - `filter()`, `map()`, `forEach()`, `peek()`, `count()`, `average()`, `findFirst()`, `max()`
- `Optional` para manejar resultados que podrían estar vacíos

---

## 💬 Ejemplo de entrada de persona (desde consola)
![image](https://github.com/user-attachments/assets/51fb210f-7d31-4ef0-9230-9aa44e709f7d)


