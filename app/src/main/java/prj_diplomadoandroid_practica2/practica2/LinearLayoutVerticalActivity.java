package prj_diplomadoandroid_practica2.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LinearLayoutVerticalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_vertical);
        setTitle("Linear Layout Vertical");

        Button btnNotifcacion= (Button) findViewById(R.id.btnNotificacion);

        btnNotifcacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tNotificacion= Toast.makeText (getApplicationContext(), "Notificando\nHola Usuario", Toast.LENGTH_LONG);
                tNotificacion.show();
            }
        });
    }
}
