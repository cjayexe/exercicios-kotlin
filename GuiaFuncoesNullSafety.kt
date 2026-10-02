
fun saudarUsuario(nome: String) {
    println("Bem-vindo de volta, $nome!")
}

fun verificarBiografia(bio: String?) {
    val tamanho = bio?.length ?: 0
    println("Tamanho da biografia: $tamanho")
}

fun filtrarNotas(notas: List<Int>) {
    val notasAprovadas = notas.filter { it >= 7 }

    for (nota in notasAprovadas) {
        println("Nota aprovada: $nota")
    }
}

fun main() {
    // Exercício 1
    saudarUsuario("Cjay")

    println()

    // Exercício 2
    verificarBiografia("Estudando Kotlin")
    verificarBiografia(null)
    verificarBiografia("")

    println()

    // Exercício 3
    val notas = listOf(5, 7, 9, 4, 10, 6, 8)
    filtrarNotas(notas)
}