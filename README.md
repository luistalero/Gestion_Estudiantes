# Taller Java
# 🚀 Ejercicio #1 Gestión de Estudiantes con List
## 📌 Propósito
Este proyecto es un programa desarrollado en el lenguaje de Java que tiene la capacidad de gestionar una lista de estudiantes usando una estructura de datos `List`, permitiendo almacenar nombres, cuenta con un menú que da las opciones a las que el usuario puede acceder las cuales son:
- 1. Ver Lista de Estudiantes
- 2. Ver Lista En Orden A-Z
- 3. Buscar Estudiante
- 4. Salir
Estas tienen la funciones de mostrar la lista completa de los estudiantes, mostrar la lista de manera ordenada, busacar a un estudiantes en específico y cerrar el programa.
# 🚀 Instalación y Configuración
## Requisitos Previos
- Java Development Kit (JDK) 17 o superior
- Git instalado en tu sistema
## Clonar Repositorio
```bash
https://github.com/luistalero/Gestion_Estudiantes.git
```
# Compilar y Ejecutar
1. Abre una terminal en la carpeta del proyecto.
2. Compila el archivo Java:
```bash
javac GestionEstudiantes.java
```
3. Ejecuta el programa:
```bash
java GestionEstudiantes
```
# 🛠️ Uso
## 1. Registro de Estudiantes:
- El programa solicitará al usuario cuántos estudiantes desea registrar.
- A continuación, pedirá los nombres de los estudiantes y los almacenará en una List<String>.
## 2. Mostrar Lista de Estudiantes: 
- Una vez seleccionada la opción Uno(1) del menú, está mostrará la lista completa de los estudiantes.
## 3. Ordenar Afabéticamente (A-Z):
- Una vez seleccionada la opción Dos(2) del menú, está mostrará la lista completa de los estudiantes ordenada alfabéticamente.
## 4. Buscar estudiante:
- Una vez seleccionada la opción Tres(3) del menú, está pedira que se ingrese el nombre del estudiante que se desea buscar en la lista para despues de hacer la busqueda preguntar al usuario si quiere realizar otar busqueda.
## 5. salir:
- Una vez seleccionada la opción Cuatro(4) del menú, está cerrará el programa agradeciendo por haberlo usado.
## 👷Ejemplo de Ejecución
```bash
Ingrese la cantidad de estudiantes: '3'
Ingrese el nombre del estudiante 1: 'Carlos'
Ingrese el nombre del estudiante 1: 'Luis'
Ingrese el nombre del estudiante 1: 'Catalina'
==============================
===    ¿Que desea hacer?   ===
==============================
1. Ver Lista de Estudiantes
2. Ver Lista En Orden A-Z
3. Buscar Estudiante
4. Salir

Selecione una opción: '1'
Lista completa de estudiantes:
Carlos
Luis
Catalina
```
```bash
==============================
===    ¿Que desea hacer?   ===
==============================
1. Ver Lista de Estudiantes
2. Ver Lista En Orden A-Z
3. Buscar Estudiante
4. Salir

Selecione una opción: '2'
Lista de estudiantes ordenada alfabéticamente:
Carlos
Catalina
Luis
```
```bash
==============================
===    ¿Que desea hacer?   ===
==============================
1. Ver Lista de Estudiantes
2. Ver Lista En Orden A-Z
3. Buscar Estudiante
4. Salir

Selecione una opción: '3'
Ingrese el nombre del estudiante que desea buscar:
Luis
El estudiante "Luis" está en la lista.
¿Desea Buscar otro estudiante? (S/N):
n
```
```bash
==============================
===    ¿Que desea hacer?   ===
==============================
1. Ver Lista de Estudiantes
2. Ver Lista En Orden A-Z
3. Buscar Estudiante
4. Salir

Selecione una opción: '4'
Gracias por usar este programa....
```
# 📋 Características
- Registro de estudiantes utilizando `List<String>` para almacenar nombres.
- Mostrar la lista completa de estudiantes registrados.
- Ordenar la lista de estudiantes alfabéticamente utilizando `Collections.sort()`.
- Verificar la existencia de un estudiante específico en la lista utilizando el método `contains()`.
# 🚨 Estado del Ejercicio
- Culminado.
# 👤 Autor
- Luis Alberto Talero Martinez