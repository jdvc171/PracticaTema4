package studium.prcticaandroidt4.practicatema4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentJDA extends Fragment {

    ListView list1jda;

    ArrayAdapter adapter;

    public FragmentJDA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jda,container,false);
        list1jda = (ListView) view.findViewById(R.id.listPaises);
        adapter = ArrayAdapter.createFromResource(getActivity(),R.array.paisesA, android.R.layout.simple_list_item_1);
        list1jda.setAdapter(adapter);

        return view;
    }

}
