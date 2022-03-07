package encap
/*Cria uma Classe Cliente, contendo os atributos encapsulados,
um construtor padrão e pelo menos mais duas opções de construtores
conforme sua percepção, com os atributos: nome (String), endereço (String),
telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/

class Cliente (val nome: String){

    private var endereco = ""
    private var tel = ""

    private val listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(
        nome: String, endereco: String, tel: String
    ) : this(nome, endereco){
        this.tel = tel
    }

    init {
        if(nome.isEmpty()){
            throw Exception("A classe cliente não foi instanciada corretamente")
        }
    }

    fun adicionar(valor: String){
        if(valor.isEmpty()){
            println("Valor invalido")
        } else{
            listaDeCompras.add(valor)
            println("O item $valor foi adicionado com sucesso!")
        }
    }
    fun remover (valor: String){
        if(valor.isEmpty()){
            println("Valor invalido")
        } else if(listaDeCompras.contains(valor)){
            listaDeCompras.remove(valor)
            println("O item $valor foi removido com sucesso!")
        } else {
            println("O item $valor não existe na lista")
        }
    }
    fun mostrarLista(){
        println("*Lista de Compras: $nome*\n")

        listaDeCompras.forEach() {
            println(it)
        }
    }
}