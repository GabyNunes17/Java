public class TelefoneCelularModel {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private String cor;
    private double preco;

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        TelefoneCelularModel celular = new TelefoneCelularModel();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S21");
        celular.setCapacidadeBateria(5000);
        celular.setCor("Preto");
        celular.setPreco(2999.99);

        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Capacidade da bateria: " + celular.getCapacidadeBateria() + " mAh");
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Preço: R$" + celular.getPreco());
    }
}