package prj_diplomadoandroid_practica2.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinearLayoutVertical= (Button) findViewById(R.id.btnAmarillo);
        Button btnLinearLayoutHorizontal= (Button) findViewById(R.id.btnLinearLayoutHorizontal);
        Button btnRelativeLayout= (Button)findViewById(R.id.btnRelativeLayout);
        Button btnTableLayout= (Button) findViewById(R.id.btnTableLayout);
        Button btnFrameLayout= (Button) findViewById(R.id.btnFrameLayout);

        btnLinearLayoutVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLinearVLayout= new Intent(getApplicationContext(), LinearLayoutVerticalActivity.class);
                startActivity(toLinearVLayout);
            }
        });

        btnLinearLayoutHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLinearHLayout= new Intent(getApplicationContext(), LinearLayoutHorizontalActivity.class);
                startActivity(toLinearHLayout);
            }
        });

        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRelativeLayout= new Intent(getApplicationContext(), RelativeLayoutActivity.class);
                startActivity(toRelativeLayout);
            }
        });

        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTableLayout= new Intent(getApplicationContext(), TableLayoutActivity.class);
                startActivity(toTableLayout);
            }
        });
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFrameLayout= new Intent(getApplicationContext(), FrameLayoutActivity.class);
                startActivity(toFrameLayout);
            }
        });



    }
}
