package franciscojavierjimenezjaimes.edu.tesoem.itics.archivostxt;

import android.app.Activity;
import android.content.Context;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class ManejoArchivoTXT {

    public void grabar(String dato, Context contexto) throws IOException {
        OutputStreamWriter archivo = new OutputStreamWriter(contexto.openFileOutput("DatosFJJJ.txt", Activity.MODE_PRIVATE));
    archivo.write(dato);
    archivo.flush();
    archivo.close();
    }

    public boolean leer(){
        return true;
    }

}
