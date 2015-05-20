package com.desdecuando.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);
        //array de objetos listaentrada
        ArrayList<ListaEntrada> datos = new ArrayList<ListaEntrada>();
        //cargamos los datos
        datos.add(new ListaEntrada(R.drawable.messi,"MESSI","Lionel Andrés Messi Cuccittini, " +
                "conocido también como Leo Messi, es un futbolista y medallista olímpico"
                +"argentino que también tienenacionalidad española desde 2005. Juega como " +
                "delantero en el F. C"));
        datos.add(new ListaEntrada(R.drawable.neymar,"NEYMAR","Neymar da Silva Santos Júnior, mejor" +
                " conocido como Neymar o Neymar Jr., es un futbolista brasileño que juega como " +
                "delantero en el Fútbol Club Barcelona de la Primera División de España."));
        datos.add(new ListaEntrada(R.drawable.suarez,"LUIS SUAREZ","Luis Alberto Suárez Díaz, " +
                "conocido simplemente como Luis Suárez, es un futbolista uruguayo que juega " +
                "como delantero en el F. C. Barcelona de la Primera División de España y en la" +
                " selección uruguaya de fútbol."));

        GridView lista = (GridView) findViewById(R.id.GridView);
        lista.setAdapter(new ListaAdaptador(this, R.layout.entrada, datos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                texto_superior_entrada.setText(((ListaEntrada) entrada).get_textoEncima());

                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                texto_inferior_entrada.setText(((ListaEntrada) entrada).get_textoDebajo());

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
                imagen_entrada.setImageResource(((ListaEntrada) entrada).get_idImagen());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
