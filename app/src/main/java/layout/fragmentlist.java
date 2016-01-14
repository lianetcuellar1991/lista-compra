package layout;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.*;
import com.cuban.lianetcuellar.listacompraoriginal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentlist extends Fragment {

    @Nullable @Bind(R.id.btAddCAtegoria) Button btAddCategoria;
    @Nullable @Bind(R.id.nmbCategoria) EditText nmbCategoria;
    @Nullable @Bind(R.id.textoPruebaBoton) TextView textoPrueba;

    public fragmentlist() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_fragmentlist, container, false);
        ButterKnife.bind(this,view);
        return view;

    }
}
