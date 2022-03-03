fun main(args: Array<String>) {
    val homenAranha = VenderIngresso("Homen Aranha sem voutar para casa",2022)

    println("N° de ingressos ${homenAranha.listarTodosOsAssentos().size}")

    homenAranha.cadrastraAssentos(
        Assentos(
            numero = 6f,
            fileira = "F"
        )
    )

    println("N° de ingressos ${homenAranha.canselarmentoDeingresso().size}")
}
