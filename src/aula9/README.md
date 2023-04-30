1. Crie a classe LeituraJDBC que deve ler no banco de dados (tabela pessoa) vários objetos do tipo
   Pessoa. Esses objetos podem estar armazenados em uma coleção (List ou Set). Após, imprima
   essa coleção e verifique se todos os dados do banco de dados foram carregados.


2. Usando a figura abaixo crie a tabela e a classe POJO correspondente. Após, crie uma classe
   chamada Teste1 que deve cadastrar 3 objetos do tipo Endereco e listá-los.

   <img alt="Class Diagram" height="300" src="http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/leonardogoandete/PW1/java_interface/src/aula9/uml/endereco.puml" width="400"/>


3. Refaça a Questão anterior usando a inserção de dados que retorna a chave primária gerada pelo BD.


4. Usando a figura abaixo crie a tabela e a classe POJO correspondente. Após, crie uma classe
   chamada Teste1 que deve cadastrar 5 objetos do tipo Produto e listá-los (para a listagem faça
   um código semelhante ao da Questão 5).

<img alt="Class Diagram" height="200" src="http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/leonardogoandete/PW1/java_interface/src/aula9/uml/produto.puml" width="300"/>

5) Refaça a Questão anterior usando a inserção de dados que retorna a chave primária gerada pelo BD.


6) Crie as classes POJO Carro e Placa conforme apresenta a figura abaixo:

<img alt="Class Diagram" height="700" src="http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/leonardogoandete/PW1/java_interface/src/aula9/uml/carro_placa.puml" width="400"/>

7) Agora, crie as classes DAO correspondentes, bem como as enumerações para os SQLs das duas
   classes. Nessas classes crie os métodos insert, listAll, delete, update e findById.


8) Nas classes DAO faça o tratamento das exceções.


9) Inclua nas classes Carro e Placa os métodos que chamam os métodos dos DAOs (insert, listAll,
   delete, update e findById).


10) Monte uma classe de testes para ver se os métodos insert, listAll, delete, update e findById estão funcionando corretamente
