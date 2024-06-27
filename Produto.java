public class Produto{
private int codigo;
private int descricao;
private double precoDeCompra;
private double precoDeVenda;
private String statusDoProduto;

public void setCodigo(int codigo) {
    this.codigo = codigo;
}
public int getCodigo() {
    return codigo;
}
public void setDescricao(int descricao) {
    this.descricao = descricao;
}
public int getDescricao() {
    return descricao;
}
public void setPrecoDeCompra(double precoDeCompra) {
    this.precoDeCompra = precoDeCompra;
}
public double getPrecoDeCompra() {
    return precoDeCompra;
}
public void setPrecoDeVenda(double precoDeVenda) {
    this.precoDeVenda = precoDeVenda;
}
public double getPrecoDeVenda() {
    return precoDeVenda;
}
public void setStatusDoProduto(String statusDoProduto) {
    this.statusDoProduto = statusDoProduto;
}
public String getStatusDoProduto() {
    return statusDoProduto;
}

}

