1. Criar uma lista genérica com os métodos:
   ``` Metodos
   public interface ListaGen<E> {
   public void adicionar(E obj);
   public E remover(); //qual método usar para remover o primeiro elemento da lista?
   public String listar();
   public int totalizar();
   public void removerTodos();
   public boolean contemElemento(E obj);
   public E pegarElemento(int i);
   public E pegarPrimeiroElemento();
   public E pegarUltimoElemento();
   public void removerElementoPosicao(int indice);
   }

  Enunciado
2. Criar a classe MinhaListaGenerica que implementa a interface ListaGen 
3. O método pegarElemento() deve tratar a exceção indicada na documentação da classe
   LinkedList
4. O método pegarPrimeiroElemento() deve propagar a exceção indicada na documentação da
   classe LinkedList
5. O método pegarUltimoElemento() deve causar a exceção indicada na documentação da classe
   LinkedList
6. O método removerElementoPosicao() deve tratar a exceção indicada na documentação da
   classe LinkedList