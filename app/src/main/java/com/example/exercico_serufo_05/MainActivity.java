package com.example.exercico_serufo_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner opcao;
    private Button botao;
    private EditText txtnome;
    private ImageView imagem;
    int [] Imagens = {
            R.drawable.lula,
            R.drawable.manuela
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner opcao = (Spinner) findViewById(R.id.opcao);

        ArrayAdapter adapter =
                ArrayAdapter.createFromResource (
                        this,
                        R.array.sexo,
                        R.layout.support_simple_spinner_dropdown_item);
        opcao.setAdapter(adapter);

        botao = (Button) findViewById(R.id.botao);

        txtnome = (EditText) findViewById(R.id.txtnome);

        imagem = (ImageView) findViewById(R.id.imageView);

        imagem.setImageResource(Imagens[0]);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String item = opcao.getSelectedItem().toString();
            int posicao = opcao.getSelectedItemPosition();
            String nome = txtnome.toString();

            if (posicao == 0) {

                imagem.setImageResource(Imagens[1]);

                Toast.makeText(getBaseContext(),
                        "Senhora"+nome+", cadastro realizado com sucesso!",
                        Toast.LENGTH_SHORT);
                }
            if (posicao == 1) {

                imagem.setImageResource(Imagens[0]);

                Toast.makeText(getBaseContext(),
                        "Senhor" + nome + ", cadastro realizado com sucesso!",
                        Toast.LENGTH_SHORT);
                }


            }
        });


    }
}
