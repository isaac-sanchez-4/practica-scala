object Main extends App {

  val estudiantes = List("Ana", "Luis", "Marta", "Pedro", "Sofia")
  val notas = Array(8, 4, 10, 6, 3)

  def aprobado(nota: Int): Boolean = {
    nota >= 5
  }

  def estadoNota(nota: Int): String = {
    if (aprobado(nota)) "APROBADO" else "SUSPENSO"
  }

  def maxNota(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  def clasificacion(nota: Int): String = {
    if (nota >= 9) "EXCELENTE"
    else if (nota >= 7) "NOTABLE"
    else if (nota >= 5) "APROBADO"
    else "SUSPENSO"
  }

  println("Primera ev")
  var i = 0
  while (i < estudiantes.length) {
    println(s"${estudiantes(i)} -> ${notas(i)} -> ${estadoNota(notas(i))}")
    i += 1
  }

  var totalAprobados = 0
  var totalSuspensos = 0
  var mejorNota = 0

  var j = 0
  while (j < notas.length) {
    if (aprobado(notas(j))) {
      totalAprobados += 1
    } else {
      totalSuspensos += 1
    }
    mejorNota = maxNota(mejorNota, notas(j))
    j += 1
  }

  println("Resumen")
  println(s"Estudiantes: ${estudiantes.length}")
  println(s"Aprobados: $totalAprobados")
  println(s"Suspensos: $totalSuspensos")
  println(s"Mejor nota: $mejorNota")

  println("Calificacion detallada")
  var k = 0
  while (k < estudiantes.length) {
    println(s"${estudiantes(k)} -> ${notas(k)} -> ${clasificacion(notas(k))}")
    k += 1
  }

  val notasSegundaEvaluacion = Array(9, 5, 8, 7, 6)

  var aprobadosSegunda = 0
  var mejorNotaSegunda = 0

  var m = 0
  while (m < notasSegundaEvaluacion.length) {
    if (aprobado(notasSegundaEvaluacion(m))) {
      aprobadosSegunda += 1
    }
    mejorNotaSegunda = maxNota(mejorNotaSegunda, notasSegundaEvaluacion(m))
    m += 1
  }

  println("Comparativa")
  println(s"Mejor nota de la primera evaluación: $mejorNota")
  println(s"Mejor nota de la segunda evaluación: $mejorNotaSegunda")
  println(s"Número de aprobados de la primera: $totalAprobados")
  println(s"Número de aprobados de la segunda: $aprobadosSegunda")

  print("Evolucion del grupo: ")
  if (aprobadosSegunda > totalAprobados) {
    println("Ha mejorado.")
  } else if (aprobadosSegunda < totalAprobados) {
    println("Ha empeorado.")
  } else {
    println("Se ha mantenido igual.")
  }

  println("Nuevo estudiante")
  val nuevosEstudiantes = "Carlos" :: estudiantes

  println(s"Lista original: $estudiantes")
  println(s"Lista nueva   : $nuevosEstudiantes")
}