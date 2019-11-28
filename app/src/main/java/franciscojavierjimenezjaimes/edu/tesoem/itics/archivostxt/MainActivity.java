package franciscojavierjimenezjaimes.edu.tesoem.itics.archivostxt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);

    }

    public void MGrabar(View view){
        ManejoArchivoTXT controlador = new ManejoArchivoTXT();
        try {
            controlador.grabar(txtnombre.getText().toString(),this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
