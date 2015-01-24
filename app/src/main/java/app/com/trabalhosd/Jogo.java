package app.com.trabalhosd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Jogo extends Activity {

    public static ArrayList<Planta> jardim = new ArrayList<Planta>(9);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        for(int i = 0; i < 9; i++){
            Planta pt = new Planta();
            jardim.add(pt);
        }
        /*final ImageButton c11 = (ImageButton) findViewById(R.id.c11);
        c11.setBackgroundResource((R.drawable.grass2));
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int statusAtual = jardim.get(0).getStatus();
                if(statusAtual < 3){
                    jardim.get(0).setStatus(statusAtual++);
                }
                switch(jardim.get(0).getStatus()){
                    case 0:
                        c11.setBackgroundResource(R.drawable.grass2);
                        break;
                    case 1:
                        c11.setBackgroundResource(R.drawable.seed);
                        break;
                    case 2:
                        c11.setBackgroundResource(R.drawable.bush);
                        break;
                    case 3:
                        c11.setBackgroundResource(R.drawable.tree2);
                        break;
                }

            }
        });*/

    }

    public void acao(View view){
        int botao = 0;
        switch(view.getId()){
            case R.id.planta_0:
                botao = 0;
                break;
            case R.id.planta_1:
                botao = 1;
                break;
            case R.id.planta_2:
                botao = 2;
                break;
        }


        int statusAtual = jardim.get(botao).getStatus();
            jardim.get(botao).setStatus(statusAtual+1);

        switch(jardim.get(botao).getStatus()){
            case 0:
                view.setBackgroundResource(R.drawable.grass2);
                break;
            case 1:
                view.setBackgroundResource(R.drawable.seed);
                break;
            case 2:
                view.setBackgroundResource(R.drawable.bush);
                break;
            case 3:
                view.setBackgroundResource(R.drawable.tree2);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jogo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}