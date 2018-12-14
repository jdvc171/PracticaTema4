package studium.prcticaandroidt4.practicatema4;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FragmentsDesplazandoImagenes extends android.support.v4.app.Fragment {
    public static final String IMAGE_MESSAGE = "IMAGE_MESSAGE";

    public static FragmentsDesplazandoImagenes newInstance(int img) {
        // Required empty public constructor
        FragmentsDesplazandoImagenes fragment = new FragmentsDesplazandoImagenes();
        Bundle bdl = new Bundle();
        bdl.putInt(IMAGE_MESSAGE,img);
        fragment.setArguments(bdl);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragments_desplazando_imagenes, container, false);
        int img = getArguments().getInt(IMAGE_MESSAGE);
        ImageView image = (ImageView)v.findViewById(R.id.imageDesplazar);
        image.setImageResource(img);

        return v;
    }

}
