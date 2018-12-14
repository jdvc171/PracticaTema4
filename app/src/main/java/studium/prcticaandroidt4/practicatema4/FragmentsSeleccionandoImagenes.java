package studium.prcticaandroidt4.practicatema4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentsSeleccionandoImagenes extends Fragment {
    public static final String IMAGE_MESSAGE = "IMAGE_MESSAGE";

    public static FragmentsSeleccionandoImagenes newInstance(int img) {
        // Required empty public constructor
        FragmentsSeleccionandoImagenes fragment = new FragmentsSeleccionandoImagenes();
        Bundle bdl = new Bundle();
        bdl.putInt(IMAGE_MESSAGE,img);
        fragment.setArguments(bdl);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragments_seleccionando_imagenes, container, false);
        int img = getArguments().getInt(IMAGE_MESSAGE);
        ImageView image = (ImageView)v.findViewById(R.id.imageSeleccionarFlor);
        image.setImageResource(img);
        return v;
    }

}
