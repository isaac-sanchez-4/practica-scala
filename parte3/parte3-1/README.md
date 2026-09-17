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
- `build.sbt`: Define el nombre del proyecto (`torneo-twenty-one`) y fija la versión de Scala a la `2.12.21`.
- `src/main/scala/Main.scala`: Contiene la lógica de la aplicación.
- `project/`: Contiene la configuración interna de sbt(creado automaticamente).
## Funciones utilizadas
- `bust(puntuacion: Int): Boolean`: Comprueba si la puntuación supera los 21 puntos.
- `estadoMano(puntuacion: Int): String`: Llama a `bust` y devuelve "VALIDA" o "BUST".
- `mejorMano(handA: Int, handB: Int): Int`: Compara dos puntuaciones y devuelve la mayor válida (o 0 si ambas son Bust).
## Colecciones utilizadas
- **`List` (`jugadores`)**: Colección inmutable usada para guardar los nombres de los participantes de forma ordenada.
- **`Array` (`puntuaciones`, `puntuacionesRonda2`)**: Estructura mutable por posiciones utilizada para guardar las puntuaciones numéricas de cada ronda, permitiendo un acceso rápido por índice con un bucle `while`.

## Resultados obtenidos
- Listado individual de cada jugador con la puntuacion y el estado.
- Comparativa final de ambasrondas indicando la mejor puntuacíon.
- Uso de un bucle foreach.

## Problemas encontrados y soluciones 
Incompatibilidad de rutas y comandos sbt en la terminal:** Al abrir nuevas sesiones de PowerShell, el sistema operativo no encontraba el comando `sbt`. 
   - *Solución encontrada :* Configuración de la variable de entorno temporal.
![Error](images/error_sbt.png)
