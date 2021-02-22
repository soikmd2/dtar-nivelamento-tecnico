# ANOTAÇÕES

## Classes
* As classes funcionam como uma receita e servem para definir aspectos e ações de um objeto.
* Classe `main` (principal) é responsável por executar a aplicação Java.
* `void` determina que uma classe não contém retorno.
* `Static` determina que a classe pode ser executada sem a necessidade de ser instanciada.
* `import pacote.nome-da-classe` é necessário para viabilizar a utilização de uma classe dentro de outra.
* `ClassName varName = new ClassName();` é a forma de se instanciar um objeto de uma determinada classe.

## Atributos e Construtores
* 'Atributos' funcionam como os ingredientes de uma receita.
    * São implementados como variáveis de uma classe.
    * Servem para descrever os aspectos/propriedades de um objeto.
* 'Construtores' são métodos que são executados automaticamente quando um objeto da classe é instanciado, ou seja, sempre que houver _"new"_ de uma classe específica que contenha um método construtor.
    * Um método construtor é definido quando possui o mesmo nome que a classe pertencente.
    * Para referenciar um atributo da classe dentro de um método da mesma, usa-se a palavra-chave _"this"_. Ex: `this.atributo`.

## Encapsulamento
* Encapsulamento é uma solução de proteção para os atributos das classes.
* Por motivos de segurança, consistência e outras razões racionais, alguns atributos não devem ficar expostos para acesso externo à classe.
* Para intermediar os acessos aos atributos de forma controlada, métodos públicos (getters and setters) são utilizados.

## Glossário
<details>
<summary>Clique para expandir</summary>

* `DTO` - Data Transfer Object, Objeto de Transferência de Dados.
* `this` - Palavra-chave que funciona como _variável de referência_ que refere-se ao objeto atual daquele contexto. ([mais](https://www.javatpoint.com/this-keyword))

</details>