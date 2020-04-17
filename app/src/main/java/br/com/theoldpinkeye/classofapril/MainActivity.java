package br.com.theoldpinkeye.classofapril;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {

        Toast.makeText(getApplicationContext(),
                "Método onStart() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onStart();
    }

    @Override
    protected void onStop() {

        Toast.makeText(getApplicationContext(),
                "Método onStop() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(getApplicationContext(),
                "Método onDestroy() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Override
    protected void onPause() {

        Toast.makeText(getApplicationContext(),
                "Método onPause() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onPause();
    }

    @Override
    protected void onResume() {

        Toast.makeText(getApplicationContext(),
                "Método onResume() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onResume();
    }

    @Override
    protected void onRestart() {

        Toast.makeText(getApplicationContext(),
                "Método onRestart() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onRestart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Toast.makeText(getApplicationContext(),
                "Método onCreate() Iniciado!",
                Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
