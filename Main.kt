import encap.Cliente

fun main() {
    /*Cria uma Classe Cliente, contendo os atributos encapsulados,
    um construtor padrão e pelo menos mais duas opções de construtores
    conforme sua percepção, com os atributos: nome (String), endereço (String),
    telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/

    print("Olá Cliente, qual o seu nome? ")
    val nome = readLine()!!

    print("Digite o seu endereço: ")
    val endereco = readLine()!!

    print("Digite o seu telefone: ")
    val telefone = readLine()!!

    try {
        val cliente = Cliente(nome, endereco, telefone)

        while(true){

            println("\nOPÇÕES\n")

            println("1 - Adicione itens no carrinho")
            println("2 - Remove itens do carrinho")
            println("3 - Liste os itens do carrinho")
            println("4 - sair")

            var opc = 0

            println("\nDigite a opção desejada: ")

            try {
                opc = readLine()!!.toInt()
                break
            }catch (e: Exception){
                println("Valor inválido")
            }


            when(opc){

                1 -> {
                    println("Digite o item que desejo adicionar em sua lista: ")
                    val item = readLine()!!
                    cliente.adicionar(item)
                }
                2 -> {
                    println("Digite o item a ser removido em sua lista: ")
                    val item = readLine()!!
                    cliente.remover(item)
                }

                3 -> cliente.mostrarLista()

                4 -> break

            }

        }

    }catch (e: Exception){
        println(e.message)
    }



}