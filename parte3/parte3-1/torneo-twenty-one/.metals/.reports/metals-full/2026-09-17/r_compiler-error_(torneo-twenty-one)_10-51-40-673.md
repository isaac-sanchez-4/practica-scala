error id: D2E7C80970D44FFFA6E734A43BE32B39
file:///C:/Users/AlumnoM_AI/Desktop/torneo-twenty-one/src/main/scala/Main.scala
### scala.reflect.internal.FatalError: 
  ThisType(value <local Main>) for sym which is not a class
     while compiling: file:///C:/Users/AlumnoM_AI/Desktop/torneo-twenty-one/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.21
    compiler version: version 2.12.21
  reconstructed args: -classpath <WORKSPACE>\.bloop\torneo-twenty-one\bloop-bsp-clients-classes\classes-Metals-K5p93eXBTlydqd5s6zHB1w==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.12.3\semanticdb-javac-0.12.3.jar;<HOME>\.sbt\boot\scala-2.12.21\lib\scala-library.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(_CURSOR_)
       tree position: line 78 of file:///C:/Users/AlumnoM_AI/Desktop/torneo-twenty-one/src/main/scala/Main.scala
            tree tpe: <error>
              symbol: value <error: <none>>
   symbol definition: val <error: <none>>: <error> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <error: <none>> -> value <local Main> -> object Main
           call site: <none> in <none>

== Source file context for tree position ==

    75 
    76     if (mejorPuntuacionRonda1 > mejorPuntuacionRonda2) {
    77         println("La primera ronda tuvo la mejor puntuación.")
    78     _CURSOR_} else if (mejorPuntuacionRonda2 > mejorPuntuacionRonda1) {
    79         println("La segunda ronda tuvo la mejor puntuación.")
    80     } else {
    81         println("Ambas rondas tuvieron la misma mejor puntuación.")

occurred in the presentation compiler.



action parameters:
offset: 2519
uri: file:///C:/Users/AlumnoM_AI/Desktop/torneo-twenty-one/src/main/scala/Main.scala
text:
```scala
object Main extends App {
  
    val jugadores = List("Alex", "Chen", "Marta", "Sindhu", "Luis")
    val puntuaciones = Array(18, 24, 21, 20, 26)

    def bust(puntuacion: Int): Boolean = puntuacion > 21  

    def estadoMano(puntuacion: Int) = if(bust(puntuacion)) "BUST" else  "VALIDA"

    def mejorMano(handA: Int, handB: Int): Int = { 
        if (bust(handA) && bust(handB)) 0  
        else if (bust(handA)) handB
        else if (bust(handB)) handA
        else if (handA > handB) handA 
        else handB
    }
    
    var i = 0
    var manosValidas = 0
    var manosBust = 0
    var mejorPuntuacionRonda1 = 0
    
    println("Ronda 1")
    while(i < puntuaciones.length) {
        val jug = jugadores(i)
        val punt = puntuaciones(i) 
        val estado = estadoMano(punt)
        
        println(s"$jug -> $punt -> $estado")

        if (estado == "VALIDA") manosValidas += 1
        else manosBust += 1

        mejorPuntuacionRonda1 = mejorMano(mejorPuntuacionRonda1, punt)
        
        i += 1
    }

    println("Resumen")
    println(s"Jugadores: ${jugadores.length}")
    println(s"Manos válidas: $manosValidas")
    println(s"Bust: $manosBust")
    println(s"Mejor puntuación válida: $mejorPuntuacionRonda1")
    
    val puntuacionesRonda2 = Array(22, 19, 20, 21, 17)
    var j = 0
    var manosValidas2 = 0 
    var manosBust2 = 0
    var mejorPuntuacionRonda2 = 0
    
    println("\nRonda 2")
    while (j < puntuacionesRonda2.length){
        val jug = jugadores(j)
        val punt = puntuacionesRonda2(j) // CORREGIDO: Leer array de la ronda 2
        val estado = estadoMano(punt)    // CORREGIDO: Evaluar la puntuación, no el índice
        
        println(s"$jug -> $punt -> $estado")
        
        if (estado == "VALIDA") manosValidas2 += 1 else manosBust2 += 1 //
        
        mejorPuntuacionRonda2 = mejorMano(mejorPuntuacionRonda2, punt) 
        
        j += 1
    }
    
    println("Resumen")
    println(s"Jugadores: ${jugadores.length}")
    println(s"Manos válidas: $manosValidas2")
    println(s"Bust: $manosBust2")
    println(s"Mejor puntuación válida: $mejorPuntuacionRonda2")

    println("\nComparación de las dos rondas")
    println(s"Mejor puntuación Ronda 1: $mejorPuntuacionRonda1")
    println(s"Mejor puntuación Ronda 2: $mejorPuntuacionRonda2")

    if (mejorPuntuacionRonda1 > mejorPuntuacionRonda2) {
        println("La primera ronda tuvo la mejor puntuación.")
    @@} else if (mejorPuntuacionRonda2 > mejorPuntuacionRonda1) {
        println("La segunda ronda tuvo la mejor puntuación.")
    } else {
        println("Ambas rondas tuvieron la misma mejor puntuación.")
    }
    
    println("\nForeach")
    puntuaciones.foreach { puntos => 
        println(s"La puntuacion es de $puntos")
    }
}
```


presentation compiler configuration:
Scala version: 2.12.21
Classpath:
<WORKSPACE>\.bloop\torneo-twenty-one\bloop-bsp-clients-classes\classes-Metals-K5p93eXBTlydqd5s6zHB1w== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.12.3\semanticdb-javac-0.12.3.jar [exists ], <HOME>\.sbt\boot\scala-2.12.21\lib\scala-library.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb




#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:69)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.reflect.internal.Types$ThisType.<init>(Types.scala:1193)
	scala.reflect.internal.Types$UniqueThisType.<init>(Types.scala:1213)
	scala.reflect.internal.Types$ThisType$.apply(Types.scala:1217)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$1.applyOrElse(AutoImportsProvider.scala:108)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$1.applyOrElse(AutoImportsProvider.scala:90)
	scala.collection.immutable.List.collect(List.scala:315)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:399)
	scala.meta.internal.pc.CompilerAccess.retryWithCleanCompiler(CompilerAccess.scala:182)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withSharedCompiler$1(CompilerAccess.scala:155)
	scala.Option.map(Option.scala:230)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:154)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withInterruptableCompiler$1(CompilerAccess.scala:92)
	scala.meta.internal.pc.CompilerAccess.$anonfun$onCompilerJobQueue$1(CompilerAccess.scala:209)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:152)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
	java.base/java.lang.Thread.run(Thread.java:1447)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  ThisType(value <local Main>) for sym which is not a class
     while compiling: file:///C:/Users/AlumnoM_AI/Desktop/torneo-twenty-one/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.21
    compiler version: version 2.12.21
  reconstructed args: -classpath <WORKSPACE>\.bloop\torneo-twenty-one\bloop-bsp-clients-classes\classes-Metals-K5p93eXBTlydqd5s6zHB1w==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.12.3\semanticdb-javac-0.12.3.jar;<HOME>\.sbt\boot\scala-2.12.21\lib\scala-library.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(_CURSOR_)
       tree position: line 78 of file:///C:/Users/AlumnoM_AI/Desktop/torneo-twenty-one/src/main/scala/Main.scala
            tree tpe: <error>
              symbol: value <error: <none>>
   symbol definition: val <error: <none>>: <error> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <error: <none>> -> value <local Main> -> object Main
           call site: <none> in <none>

== Source file context for tree position ==

    75 
    76     if (mejorPuntuacionRonda1 > mejorPuntuacionRonda2) {
    77         println("La primera ronda tuvo la mejor puntuación.")
    78     _CURSOR_} else if (mejorPuntuacionRonda2 > mejorPuntuacionRonda1) {
    79         println("La segunda ronda tuvo la mejor puntuación.")
    80     } else {
    81         println("Ambas rondas tuvieron la misma mejor puntuación.")