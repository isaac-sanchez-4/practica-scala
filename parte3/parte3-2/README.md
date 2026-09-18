
# Analizador de Calificaciones (Scala)

## ¿Qué hace el programa?
El programa es app desarrollada en Scala que se encarga del analisis de las notas de un grupo. Permitiendo crear registros de los nombre con sus notas y las categoriza.

## Organización del Proyecto
- El archivo de configuración `build.sbt` en donde definimos el nombre y la versino de scala.
- El código fuente reside en `src/main/scala/Main.scala`.

## Funciones creadas
Se han implementado cuatro funciones puras y reutilizables:
- **`aprobado(nota: Int): Boolean`**: Evalúa matemáticamente si la nota es `>= 5`.
- **`estadoNota(nota: Int): String`**: Apoyándose en la función anterior, traduce el resultado booleano a texto ("APROBADO" o "SUSPENSO").
- **`maxNota(a: Int, b: Int): Int`**: Función de comparación clásica que devuelve el valor más alto entre dos enteros usando una estructura `if/else`.
- **`clasificacion(nota: Int): String`**: Múltiples bloques `if / else if` escalonados que mapean el entero en rangos textuales (EXCELENTE, NOTABLE, etc.).

## Colecciones utilizadas y el concepto de Inmutabilidad
El proyecto utiliza dos tipos de colecciones:
1. **`Array` (para las notas):** Una colección de tamaño fijo.
2. **`List` (para los estudiantes):** colecion por defecto. 

**¿Por qué no se modifica la lista original al añadir a Carlos?**
En Scala, la clase `List` representa listas enlazadas que son inmutables. Cuando utilizamos el operador `::` (cons) para añadir a "Carlos" al principio, Scala no altera la lista `estudiantes` sino que crea un nuevo nodo "Carlos" que apunta hacia la lista original, generando una estructura nueva (`nuevosEstudiantes`).

## captura de pantalla

`estructura y pluging`
![main](images/main.png)


`codigo`
![main](images/resultado.png)


`run`
![main](images/sbtrun.png)

`compile`
![main](images/sbtcompile.png)

`compile`
![main](images/sbc.png)
