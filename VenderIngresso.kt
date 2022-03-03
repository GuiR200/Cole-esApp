class VenderIngresso(
    val nome: String,
    val ano : Short

    ){
    private var assentos = mutableListOf<Assentos>()

    fun cadrastraAssentos(assento: Assentos): Boolean = assentos.add(assento)

    fun listarTodosOsAssentos() = assentos

    fun canselarmentoDeingresso() {

    }
}


