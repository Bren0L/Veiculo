import java.util.Timer;
import java.util.TimerTask;

public class Moto extends Veiculo{
    int milissegundos = 1000;
    int intervalo = 10000;
    Timer cronometro = new Timer();
    TimerTask tarefa;
    Moto(){}

    void acelerar(int velocidade) throws InterruptedException {
        if(velocidade > 0 && getVelAtual() + velocidade < 241){
            while (0 != velocidade--){
                setVelAtual(getVelAtual()+1);
                System.out.println(getVelAtual());
                Thread.sleep(50);
            }
            verificaMarcha();
        }else System.out.println("ERRO: Valor acima do esperado ou negativo");
    }

    void desacelerar(int velocidade) throws InterruptedException {
        if(velocidade > 0 && getVelAtual() - velocidade > -1){
            while(0 != velocidade--){
                setVelAtual(getVelAtual()-1);
                System.out.println(getVelAtual());
                Thread.sleep(50);
            }

            verificaMarcha();
        }else System.out.println("Valor acima do esperado ou valor negativo");
    }

    private void verificaMarcha(){
        if(getVelAtual() < 61) setMarcha(1);
        else if(getVelAtual() < 121) setMarcha(2);
        else if(getVelAtual() < 181) setMarcha(3);
        else setMarcha(4);
    }

    @Override
    public void ligarVeiculo(){
        super.ligarVeiculo();
        esquentarMotor();
    }

    public void esquentarMotor(){
        tarefa = new TimerTask() {
            @Override
            public void run() {
                if(!isLigadoBool()) return;
                setQuilRodados(getVelAtual());
                gastarCombustivel(getVelAtual()*0.125);
                System.out.println(getCombustivel());
            }
        };
        cronometro.schedule(tarefa,milissegundos,intervalo);
    }
}
