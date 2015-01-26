package app.com.trabalhosd;

/**
 * Created by caik on 24/01/15.
 */
public class Plantador extends Personagem{

    private int posicao;

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acao(Planta planta){
        int statusAtual = planta.getStatus();
        if(statusAtual == 0){
            planta.setStatus(1);
        }else if(statusAtual != 0 && statusAtual != 3){
            planta.setStatus(statusAtual+1);
        }else if (planta.getStatus() == 3 && !planta.protecao){
            planta.setProtecao(true);
        }
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void plantar(Planta planta){

    }

    public void regar(Planta planta){
        int statusAtual = planta.getStatus();

    }

    public void proteger(Planta planta){
        if (planta.getStatus() == 3 && !planta.protecao){
            planta.setProtecao(true);
        }
    }


}
