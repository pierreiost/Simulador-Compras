import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Produto {
    private String nomeProduto;
    private double valorProduto;
    public Produto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }
}