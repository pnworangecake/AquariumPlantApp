package com.pnworangecake.aquariumplantapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is meant to display a list of selectable items to the user. This list is passed in
 * as a fragment's arguments. Once a plants is selected, the callbacks will return information
 * about the plants to the activity and it is decided how the activity will display the information.
 */
public class ListFragment extends Fragment {
    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // From fragment's arguments, retrieve the list of plants to display onto the list view for
        // this fragment.
        // This step will be replaced by the parser.
        List<String> plants = new ArrayList<>();
        plants.add("Plant 1");
        plants.add("Plant 2");
        // Add more plants.
        BaseAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.activity_list_item, plants);
        ListView list = (ListView) view.findViewById(R.id.plant_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Create a PlantFragment by a callback similar to a button in name fragment.
            }
        });
    }
}
