package prj_diplomadoandroid_practica2.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RelativeLayoutActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        setTitle("Relative Layout");
        view= this.getWindow().getDecorView();
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
