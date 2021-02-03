# <h1 align="center"> Padrões de Projeto </h1>
<hr/>

## <h2 align="center">DESCUBRA E APLIQUE PADRÕES </h2>

<div align="justify">
  
 ## <h2 align="center">Instanciando Produtos</h2>
 
 <p>Considere que temos uma classe Produto com os seguintes atributos: </p>
 
     1. long id
     2. String codigoEan //código de barras
     3. String descricao
     4. String marca
     5. String modelo
     6. double preco
     7. LocalDate dataCadastro
     8. LocalDate dataUltimaAtualizacao
     9. int estoque
     10. String categoria
     11. String urlFoto

<p>A classe possui os seguintes requisitos:</p>

    * Os atributos são obrigatórios: long id, String descricao, String marca, double preco, LocalDate dataCadastro e String categoria.
    * Não pode ser informado um modelo se não for informada a marca
    * O preço deve ser maior que zero
    * A data de cadastro não pode ser alterada e deve ser definida por padrão com a data atual
    * A data da última atualização não pode ser anterior a data de cadastro
    * O estoque padrão deve ser zero e não pode ser atribuído valor negativo
    * Nenhum dos atributos String pode ser null


Responda:

1. Que padrão de projeto pode ser utilizado para tornar mais fácil e claro o processo de instanciação de tal classe, uma vez que há dependências entre diferentes atributos, atributos obrigatórios e outros não? Implemente tal padrão para esta classe. 

   <p>Ao meu ver, podemos aplicar o padrão Builder, porque em sua definição, diz: </p>

      <p>Ele separa a construção de um objeto complexo da sua representação, de modo que o mesmo processo de construção possa criar diferentes representações. Ou seja, ele separa o código utilizado para a instanciação de objetos complexos do código da classe de tais objetos e as representações são as instâncias da classe. Outra definição é a seguinte: O padrão Builder encapsula a construção de um objeto, permitindo que ele seja construído em passos. Um Builder exige a criação de um método construtor, já que ele não consegue instanciar um método por si só.</p>

   <p>Dito isso, ao meu ver, este padrão se encaixar melhor para resolver problema da classe Produto.</p>

</div>
 
