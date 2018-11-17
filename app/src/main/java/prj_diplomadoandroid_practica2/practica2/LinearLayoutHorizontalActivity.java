package prj_diplomadoandroid_practica2.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutHorizontalActivity extends AppCompatActivity {
    /*
    * Para poder cambiar los colores primero hay que crear la View de abajo como parametro de la clase
    * hay que crear los nombres de los colores y asignarle el valor HEX en el values/colors.xml
    * en el XML del Layout, dentro del xml del boton se crean el metodo para cambiar el color de
     * ese boton. En el onCreate se toma el view creado en la clase y se le asigna el DecorView
     * por ultimo fuera del onCreat se cada metodo que fue creado en el xml del boton.
     * Demasiado lucha para cambiar color de background*/
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_horizontal);
        setTitle("Linear Layout Horizontal");

        view= this.getWindow().getDecorView();
    }

    public void goAmarillo(View v){
        view.setBackgroundResource(R.color.Amarillo);
    }

    public void goRojo(View v){
        view.setBackgroundResource(R.color.Rojo);
    }

    public void goVerde(View v){
        view.setBackgroundResource(R.color.Verde);
    }

    public void goAzul(View v){
        view.setBackgroundResource(R.color.Azul);
    }

}
