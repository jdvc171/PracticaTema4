package studium.prcticaandroidt4.practicatema4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class SeleccionandoImagenes extends FragmentActivity {

    Button btnRosa,btnGirasol,btnGladiolo,btnMargarita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);


        btnRosa =(Button) findViewById(R.id.btnRosa);
        btnGirasol =(Button) findViewById(R.id.btnGirasol);
        btnGladiolo =(Button) findViewById(R.id.btnGladiolo);
        btnMargarita =(Button) findViewById(R.id.btnMargarita);

        final Fragment [] misFragmentos;
        misFragmentos = new Fragment[4];
        misFragmentos[0]= FragmentsDesplazandoImagenes.newInstance(R.drawable.rosa);
        misFragmentos[1]= FragmentsDesplazandoImagenes.newInstance(R.drawable.girasol);
        misFragmentos[2]= FragmentsDesplazandoImagenes.newInstance(R.drawable.gladiolo);
        misFragmentos[3]= FragmentsDesplazandoImagenes.newInstance(R.drawable.margarita);

        btnRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manejador = getSupportFragmentManager();
                FragmentTransaction miTransaccion= manejador.beginTransaction();
                miTransaccion.replace(R.id.LayoutFlor,misFragmentos[0]);
                miTransaccion.commit();

            }
        });

        btnGirasol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manejador = getSupportFragmentManager();
                FragmentTransaction miTransaccion= manejador.beginTransaction();
                miTransaccion.replace(R.id.LayoutFlor,misFragmentos[1]);
                miTransaccion.commit();

            }
        });

        btnGladiolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manejador = getSupportFragmentManager();
                FragmentTransaction miTransaccion= manejador.beginTransaction();
                miTransaccion.replace(R.id.LayoutFlor,misFragmentos[2]);
                miTransaccion.commit();

            }
        });

        btnMargarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manejador = getSupportFragmentManager();
                FragmentTransaction miTransaccion= manejador.beginTransaction();
                miTransaccion.replace(R.id.LayoutFlor,misFragmentos[3]);
                miTransaccion.commit();

            }
        });

    }
}
