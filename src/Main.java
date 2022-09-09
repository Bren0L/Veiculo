import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Moto moto = new Moto();
        moto.setCombustivel(1);
        moto.printDados();

        do{
            System.out.println("O que dejeja fazer?");
            System.out.println("1.Acelerar 2.Desacelerar 3.Ligar 4.Desligar 5.Abastecer 6.Finalizar");
            switch(input.nextInt()){
                case 1 -> {
                    if(moto.isLigadoBool()){
                        if(moto.getCombustivel() > 0){
                            System.out.println("Quanto deseja acelerar?");
                            moto.acelerar(input.nextInt());
                        }else{
                            System.out.println("Sem combustívell");
                        }
                    }else{
                        System.out.println("Veículo desligado");
                    }
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
                case 6 -> {
                    System.out.println("Fechando programa");
                    exit(0);
                }
                default ->
                        System.out.println("Comando inválido");
            }
        }while(true);
    }
}