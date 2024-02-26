public class ControleEstoque {
    public static void main(String[] args) {
        
        String marcaProduto;
        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;
        
        marcaProduto = "Apple";
        nomeProduto = "fone de ouvido";
        precoProduto = 59.99;
        quantidadeProduto = 8;
       
        System.out.println("Dados do Produto: ");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Marca: " + marcaProduto);
        System.out.println("Preco: $" + precoProduto);
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
    }
}
