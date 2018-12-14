package studium.prcticaandroidt4.practicatema4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;



/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2JDA extends Fragment {

    ListView list2jda;
    SearchView searchView;
    ArrayAdapter adapter;

    public Fragment2JDA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2_jda,container,false);
        list2jda = (ListView) view.findViewById(R.id.listCapitales);
        adapter = ArrayAdapter.createFromResource(getActivity(),R.array.capitalesA, android.R.layout.simple_list_item_1);
        list2jda.setAdapter(adapter);

        return view;
    }

}
