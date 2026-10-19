import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Produto> produto = new ArrayList<>();
        produto.add(new Produto("Mouse", 80.0));
        produto.add(new Produto("Teclado", 150.0));
        produto.add(new Produto("Monitor", 900.0));
        produto.add(new Produto("Cabo USB", 25.0));
        produto.add(new Produto("Headset", 180.0));

        System.out.println("===== CATÁLOGO DE PRODUTOS =====");
        produto.forEach(System.out::println);

        List<Produto> produtosCaros = produto.stream()
                .filter(p -> p.getPrecoProduto() > 100)
                .collect(Collectors.toList());

        System.out.println("\n===== PRODUTOS ACIMA DE R$ 100 =====");
        produtosCaros.forEach(System.out::println);

        List<Produto> produtosOrdenados = produto.stream()
                .sorted(Comparator.comparing(Produto::getNomeProduto))
                .collect(Collectors.toList());

        System.out.println("\n===== PRODUTOS EM ORDEM ALFABÉTICA =====");
        produtosOrdenados.forEach(System.out::println);

        Optional<Produto> resultadoBusca = produto.stream()
                .filter(p -> p.getNomeProduto().equals("Teclado"))
                .findFirst();

        System.out.println("\n===== BUSCA DE PRODUTO =====");
        resultadoBusca.ifPresentOrElse(
                p -> System.out.println("Encontrado: " + p),
                () -> System.out.println("Produto não encontrado.")
        );
    }
}