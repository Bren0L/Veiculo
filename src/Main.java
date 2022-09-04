import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Moto moto = new Moto();
        moto.setCombustivel(1);
        moto.printDados();

        do{
            System.out.println("O que dejeja fazer?");
            System.out.println("1.Acelerar 2.Desacelerar 3.Ligar 4.Desligar 5.Abastecer");
            switch(input.nextInt()){
                case 1 -> {
                    System.out.println("Quanto deseja acelerar?");
                    moto.acelerar(input.nextInt());
                }
                case 2 ->{
                    System.out.println("O quanto deseja desacelerar?");
                    moto.desacelerar(input.nextInt());
                }
                case 3 -> {
                    moto.ligarVeiculo();
                    System.out.println(moto.isLigadoStr());
                }
                case 4 -> {
                    moto.desligarVeiculo();
                    System.out.println(moto.isLigadoStr());
                }
                case 5 -> {
                    System.out.println("Insira a quantidade de combust�vel em litros:");
                    moto.setCombustivel(input.nextDouble());
                }
                default ->
                        System.out.println("Comando inv�lido");
            }
        }while(true);
    }
}