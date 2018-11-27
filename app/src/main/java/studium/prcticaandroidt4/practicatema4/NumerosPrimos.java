package studium.prcticaandroidt4.practicatema4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends Activity {

    Button btnCalcularNumPrimo;
    EditText editNumPrimo;
    TextView textViewSolucion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        btnCalcularNumPrimo = findViewById (R.id.btnCalcularNumPrimo);
        editNumPrimo = findViewById(R.id.editNumPrimo);
        textViewSolucion = findViewById(R.id.textViewSolucion);


        btnCalcularNumPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSolucion.setText("");
                Boolean primo;



                if(editNumPrimo.getText().toString().isEmpty()){textViewSolucion.setText("Por favor introudzca un número entero");}
                else{
                    primo = esPrimo(Integer.parseInt(editNumPrimo.getText().toString()));

                    if (primo==true){
                        textViewSolucion.setText("El número introducido es primo");

                    }else{

                        textViewSolucion.setText("El número introducido no es primo");
                    }

                }


            }
        });




    }

    public static Boolean esPrimo(int numero)
    {
        Boolean esPrimoActual = true;
        if(numero<2)
        {
            esPrimoActual = false;
        }
        else
        {
            for(int x=2; x*x<=numero; x++)
            {
                if( numero%x==0 ){esPrimoActual = false;break;}
            }
        }
        return esPrimoActual;
    }




}
