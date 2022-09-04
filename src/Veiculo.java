public abstract class Veiculo {
    private boolean liga_desliga;
    private double combustivel;
    private int ano;
    private int velAtual;
    private int marcha;
    private int quilRodados;
    private String marca;
    private String modelo;
    private String cor;

    protected void ligarVeiculo() {
        this.liga_desliga = true;
    }

    protected void desligarVeiculo(){
        this.liga_desliga = false;
    }

    protected String isLigadoStr() {
        return liga_desliga ? "Ligado" : "Desligado";
    }

    protected boolean isLigadoBool(){
        return liga_desliga;
    }

    protected int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        this.ano = ano;
    }

    protected int getVelAtual() {
        return velAtual;
    }

    protected void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    protected int getMarcha() {
        return marcha;
    }

    protected void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    protected int getQuilRodados(){
        return quilRodados;
    }

    protected void setQuilRodados(int quilometros){
        this.quilRodados += quilometros;
    }

    protected double getCombustivel() {
        return combustivel;
    }

    protected void setCombustivel(double combustivel) {
        this.combustivel += combustivel;
    }

    protected void gastarCombustivel(double combustivel) {
        if(this.combustivel - combustivel < 0){
            this.combustivel = 0;
            velAtual = 0;
        }else this.combustivel -= combustivel;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected void printDados(){
        System.out.printf("Marca: %s\nModelo: %s\nAno: %d\nCor: %s\nEstado: %s\nVelocidade atual: %d\nMarcha: %d\nCombustível: %.2f Litros\n", marca, modelo, ano, cor, isLigadoStr(), velAtual, marcha, combustivel);
    }
}