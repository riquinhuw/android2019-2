package br.com.chdr.example.prj_rev01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculoActivity extends AppCompatActivity {

    private Button btn_voltar;
    private Button btn_desconto;
    private TextView valorProduto;
    private TextView valorDesconto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        final TextView valorDesconto= (TextView) findViewById(R.id.txt_desconto);
        final TextView valorProduto = (TextView) findViewById(R.id.txt_valorProduto);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);
        btn_desconto = (Button) findViewById(R.id.btn_calcularDesconto);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculoActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        btn_desconto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double produto = Double.parseDouble(valorProduto.getText().toString());
                double desconto = Double.parseDouble(valorDesconto.getText().toString());
                AlertDialog.Builder builder = new AlertDialog.Builder(CalculoActivity.this);
                builder.setMessage("O Desconto é de: "+(desconto/100)*produto)
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
