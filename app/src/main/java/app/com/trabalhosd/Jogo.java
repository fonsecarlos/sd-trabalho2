package app.com.trabalhosd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Jogo extends Activity {

    public static ArrayList<Planta> jardim = new ArrayList<Planta>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        final ImageButton c11 = (ImageButton) findViewById(R.id.c11);
        c11.setBackgroundResource((R.drawable.grass2));
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* status.get(0)++;
                if(status[0][0] > 3){
                    status[0][0] = 3;
                }
                switch(status[0][0]){
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
                }*/

            }
        });

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