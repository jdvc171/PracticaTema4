package studium.prcticaandroidt4.practicatema4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {


    Button btnCalcular,btnJDA,btnDesplazar,btnSeleccionar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular =(Button) findViewById(R.id.btnCalcular);
        btnJDA =(Button) findViewById(R.id.btnJDA);
        btnDesplazar =(Button) findViewById(R.id.btnDesplazar);
        btnSeleccionar =(Button) findViewById(R.id.btnSeleccionar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,
                        NumerosPrimos.class);
                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });



        btnJDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,
                        JuegoDeAciertos.class);
                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        btnDesplazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,
                        DesplazandoImagenes.class);
                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });


        btnSeleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,
                        SeleccionandoImagenes.class);
                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

    }
}
