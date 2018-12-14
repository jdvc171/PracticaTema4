package studium.prcticaandroidt4.practicatema4;


import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.support.v4.app.FragmentActivity;

public class JuegoDeAciertos extends FragmentActivity {
    ListView listP,listC;
    TextView textoPais,textoCapital;
    Button btnVerificar;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);

        listP = (ListView) findViewById(R.id.listPaises);
        textoPais = findViewById(R.id.textPais2);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        imagen = (ImageView) findViewById(R.id.imageAciertoFallo);

        listC = (ListView) findViewById(R.id.listCapitales);
        textoCapital = findViewById(R.id.textCapital2);

        listP.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                textoPais.setText("");
                textoPais.setText(listP.getItemAtPosition(position).toString() );
            }
        });

        listC.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textoCapital.setText("");
                textoCapital.setText(listC.getItemAtPosition(position).toString() );

            }
        });


        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pais=textoPais.getText().toString();
                String capital=textoCapital.getText().toString();

                if((pais.equals("España")&&capital.equals("Madrid"))||(pais.equals("Spain")&&capital.equals("Madrid"))||(pais.equals("Espagne")&&capital.equals("Madrid"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Portugal")&&capital.equals("Lisboa"))||(pais.equals("Portugal")&&capital.equals("Lisboa"))||(pais.equals("Portugal")&&capital.equals("Lisbonne"))){

                    imagen.setImageResource(R.drawable.acierto);
                }

                else if((pais.equals("Francia")&&capital.equals("París"))||(pais.equals("France")&&capital.equals("Paris"))||(pais.equals("France")&&capital.equals("Paris"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Inglaterra")&&capital.equals("Londres"))||(pais.equals("England")&&capital.equals("London"))||(pais.equals("Angleterre")&&capital.equals("Londres"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Brasil")&&capital.equals("Brasilia"))||(pais.equals("Brazil")&&capital.equals("Brasilia"))||(pais.equals("Brésil")&&capital.equals("Brasilia"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Argentina")&&capital.equals("Buenos Aires"))||(pais.equals("Argentina")&&capital.equals("Buenos Aires"))||(pais.equals("Argentine")&&capital.equals("Buenos Aires"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Alemania")&&capital.equals("Berlín"))||(pais.equals("Germany")&&capital.equals("Berlin"))||(pais.equals("Allemagne")&&capital.equals("Berlin"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Suecia")&&capital.equals("Estocolmo"))||(pais.equals("Sweden")&&capital.equals("Stockholm"))||(pais.equals("Suède")&&capital.equals("Stockholm"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("Rusia")&&capital.equals("Moscú"))||(pais.equals("Russia")&&capital.equals("Moscu"))||(pais.equals("Russie")&&capital.equals("Moscou"))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else if((pais.equals("EE.UU")&&capital.equals("Washington D.C."))||(pais.equals("EE.UU")&&capital.equals("Washington D.C."))||(pais.equals("EE.UU")&&capital.equals("Washington D.C."))){

                    imagen.setImageResource(R.drawable.acierto);
                }
                else{
                    imagen.setImageResource(R.drawable.error);
                }
            }
        });

    }

}
