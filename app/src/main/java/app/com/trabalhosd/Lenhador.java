package app.com.trabalhosd;

/**
 * Created by caik on 24/01/15.
 */
public class Lenhador extends Personagem {

    private int forca = 1;

    private int posicao;

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void acao(Planta planta){
        int statusAtual = planta.getStatus();
        if(statusAtual == 3 && !planta.protecao){
            planta.setStatus(0);
        }
    }
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

}
