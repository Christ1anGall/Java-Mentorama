public class Carro {

    private int quantidadePneus;
    private int quantidadeCalotas;
    private int quantidadeParafusos;
    private String modelo;
    private String marca;
    private String cor;
    private int ano;

    public Carro(int quantidadePneus, String modelo, String marca, String cor, int ano) {
        setQuantidadePneus(quantidadePneus);
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public int getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadePneus(int quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
        this.quantidadeCalotas = quantidadePneus;
        this.quantidadeParafusos = quantidadePneus * 4;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimeValores() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Quantidade de Pneus: " + getQuantidadePneus());
        System.out.println("Quantidade de Calotas: " + quantidadeCalotas);
        System.out.println("Quantidade de Parafusos: " + quantidadeParafusos);
    }
}