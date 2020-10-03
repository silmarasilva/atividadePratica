package br.usjt.ucsist.atividade5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarMensagem(View view){
        EditText texto = findViewById(R.id.textoDigitado);
        String mensagem = texto.getText().toString();
        Intent intent = new Intent (this, TrataMensagemActivity.class);
        intent.putExtra("msg", mensagem);
        startActivity(intent);
    }

}