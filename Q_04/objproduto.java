package Q_04;

public class objproduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Feijão", 7, 10);
        produto.exNomePreco();
        produto.comprar(1);
        System.out.println("Quantidade em estoque: " + produto.getEstoque());
        produto.comprar(1);
        System.out.println("\nQuantidade em estoque: " + produto.getEstoque());
        produto.comprar(9);
        System.out.println("\nQuantidade em estoque: " + produto.getEstoque());

    }
}
