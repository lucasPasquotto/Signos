package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos =
            {
                    "Áries",
                    "Touro",
                    "Gêmeos",
                    "Câncer",
                    "Leão",
                    "Virgem",
                    "Libra",
                    "Escorpião",
                    "Sagitário",
                    "Capricórnio",
                    "Aquário",
                    "Peixes",
            };
    private String[] perfis =
            {
                    "Áries",
                    "Touro",
                    "Gêmeos",
                    "Câncer",
                    "Leão",
                    "Virgem",
                    "Libra",
                    "Escorpião",
                    "Sagitário",
                    "Capricórnio",
                    "Aquário",
                    "Peixes",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), perfis[i], Toast.LENGTH_LONG).show();
            }
        });

    }
}
