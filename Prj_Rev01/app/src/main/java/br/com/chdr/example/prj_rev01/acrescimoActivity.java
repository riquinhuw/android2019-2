package br.com.chdr.example.prj_rev01;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class acrescimoActivity extends AppCompatActivity {

    private Button btn_voltar2;
    private Button btn_calcularAcrescimo;
    private TextView valorProduto2;
    private TextView txt_acrescimo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acrescimo);

        btn_voltar2 = (Button) findViewById(R.id.btn_voltar2);
        btn_calcularAcrescimo = (Button) findViewById(R.id.btn_calcularAcrescimo);
        final TextView valorProduto2 = ( TextView ) findViewById ( R.id.txt_valorProduto2 ) ;
        final TextView txt_acrescimo = ( TextView ) findViewById ( R.id.txt_acrescimo ) ;
        btn_voltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(acrescimoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_calcularAcrescimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double produto = Double.parseDouble(valorProduto2.getText().toString());
                double acrescimo = Double.parseDouble(txt_acrescimo.getText().toString());
                AlertDialog.Builder builder = new AlertDialog.Builder(acrescimoActivity.this);
                builder.setMessage("O Acrescimo é de:"+(acrescimo/100)*produto)
                        .setPositiveButton("Entendeu?", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // FIRE ZE MISSILES!
                            }
                        })
                        .setNegativeButton("CAncelar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancelled the dialog
                            }
                        });

                builder.show();
            }
        });

    }


}
