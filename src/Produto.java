public class Produto {

    private String nomeProduto;
    private double precoProduto;

    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +
                " | Preço: R$ " +  precoProduto;
    }
}