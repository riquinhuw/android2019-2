package br.com.chdr.example.prj_rev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_descontoo;
    private Button btn_acrescimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("meuLog","Evento abriu Cena MainActivity");

        btn_descontoo = (Button) findViewById(R.id.btn_desconto);
        btn_acrescimo = (Button) findViewById(R.id.btn_acrescimo);

        btn_descontoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, CalculoActivity.class);
                startActivity(intent);
            }
        });

        btn_acrescimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,acrescimoActivity.class);
                startActivity(intent);
            }
        });


    }

    protected void onStop(){
        super.onStop();
        Log.d("meuLog","Ele Evento Saindo do MainActivity!");

    }

    protected boolean onToutchEvento(MotionEvent event){
        Log.d("meuLog","Evento Tocou na Cena MainActivity");
        return super.onTouchEvent(event);

    }

}
