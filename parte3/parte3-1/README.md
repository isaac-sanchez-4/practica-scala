# Mini proyecto 3.1 — Torneo de Twenty-One

## Entorno

-Visual Studio Code
-Metals
-Scala 2.12.21
-JDK 17
-sbt

## Descripción
Aplicacion desarollada con scala que analiza una partida de cartas durante 2rondas, y deternmina quien se pasa cuales son los mejores resultasoa y el ganador 
## Estructura
El proyecto sigue la estructura estándar de sbt:
- `build.sbt`: Define el nombre del proyecto (`torneo-twenty-one`) y fija la versión de Scala a la 2.12.21.
- `src/main/scala/Main.scala`: Contiene la lógica de la aplicación, las colecciones de datos (`List` y `Array`) y las funciones de evaluación.
- `project/`: Contiene la configuración interna de sbt.
## Funciones utilizadas
- `bust(puntuacion: Int): Boolean`: Comprueba si la puntuación supera los 21 puntos.
- `estadoMano(puntuacion: Int): String`: Llama a `bust` y devuelve "VALIDA" o "BUST".
- `mejorMano(handA: Int, handB: Int): Int`: Compara dos puntuaciones y devuelve la mayor válida (o 0 si ambas son Bust).
## Ejecución

```bash
sbt compile
sbt run
