
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}

fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun processarTransacoes(transacoes: List<Double?>) {
    var total = 0.0

    for (transacao in transacoes) {
        if (transacao != null) {
            total += transacao
        } else {
            println("Transação ignorada")
        }
    }

    println("Total das transações: $total")
}

fun avaliarMotorista(nota: Int?) {
    val notaFinal = nota ?: 0

    when (notaFinal) {
        5 -> println("Motorista excelente")
        4 -> println("Motorista bom")
        1, 2, 3 -> println("Motorista precisa melhorar")
        0 -> println("Motorista sem avaliação")
        else -> println("Nota inválida")
    }
}

// QUESTÃO 6 - Função Lambda e Null Safety
val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0) 0.0 else it
}

fun limparEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Conta inválida: será apagada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    // QUESTÃO 1 - Cálculo de desconto com cupom
    println("QUESTÃO 1")
    println(calcularDesconto(100.0, "PROMO10"))
    println(calcularDesconto(100.0, "PROMO20"))
    println(calcularDesconto(100.0, null))

    // QUESTÃO 2 - Auditoria de entregas
    println("\nQUESTÃO 2")
    val enderecos = listOf(
        "Rua das Flores, 123",
        null,
        "Av. Brasil, 500",
        null,
        "Rua Central, 45"
    )
    auditarEntregas(enderecos)

    // QUESTÃO 3 - Validação de biografia infantil
    println("\nQUESTÃO 3")
    validarBioInfantil("Olá, sou estudante de Kotlin!")
    validarBioInfantil(null)
    validarBioInfantil(
        "Esta biografia é muito longa e ultrapassa o limite de cinquenta caracteres permitido."
    )

    // QUESTÃO 4 - Processamento de transações
    println("\nQUESTÃO 4")
    val transacoes = listOf(50.0, null, 120.5, null, 10.0)
    processarTransacoes(transacoes)

    // QUESTÃO 5 - Avaliação de motorista
    println("\nQUESTÃO 5")
    avaliarMotorista(5)
    avaliarMotorista(4)
    avaliarMotorista(2)
    avaliarMotorista(null)
    avaliarMotorista(7)

    // QUESTÃO 6 - Cálculo de gorjeta com Lambda
    println("\nQUESTÃO 6")
    println("Gorjeta válida: ${calcularGorjeta(15.0)}")
    println("Gorjeta nula: ${calcularGorjeta(null)}")
    println("Gorjeta negativa: ${calcularGorjeta(-5.0)}")

    // QUESTÃO 7 - Limpeza de e-mails inválidos
    println("\nQUESTÃO 7")
    val emails = listOf(
        "cjay@email.com",
        null,
        "",
        "contato@email.com",
        null
    )
    limparEmails(emails)
}