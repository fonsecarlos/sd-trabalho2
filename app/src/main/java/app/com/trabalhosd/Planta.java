package app.com.trabalhosd;

import java.sql.Time;

/**
 * Created by caik on 24/01/15.
 */
public class Planta {

    int status;
    Time tempo_vida;
    boolean protecao;
    // 0- Destruído
    // 1- Semente
    // 2- Arbusto
    //3- Árvore

    public Planta(int status, Time tempo_vida) {
        this.status = status;
        this.tempo_vida = tempo_vida;
        this.protecao = false;
    }

    public int getStatus() {
        return status;
    }

    public boolean setStatus(int status) {
        // 0- Destruído
        // 1- Semente
        // 2- Arbusto
        //3- Árvore
        if(status < 4){
        this.status = status;
        return true;
        }else{
            this.status = this.status;
            return false;
        }
    }

    public Time getTempo_vida() {
        return tempo_vida;
    }

    public void setTempo_vida(Time tempo_vida) {
        this.tempo_vida = tempo_vida;
    }
}
