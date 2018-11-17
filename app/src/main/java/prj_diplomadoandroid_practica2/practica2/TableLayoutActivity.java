package prj_diplomadoandroid_practica2.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableLayoutActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        setTitle("Table Layout");

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

    public void goRosa(View v){
        view.setBackgroundResource(R.color.Rosa);
    }

    public void goAzul(View v){
        view.setBackgroundResource(R.color.Azul);
    }
}
