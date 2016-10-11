package com.pnworangecake.aquariumplantapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Called by a ListFragment or by a random selection on the main fragment. This will display the
 * information on the plants passed in by arguments.
 */
public class PlantFragment extends Fragment {
    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_plant, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Read the arguments passed into this fragment and generate the view for the user.
        Bundle args = getArguments();
        String commonName = "sample common plant name";
        String scientificName = args.getString("sci-name");
        ((TextView) view.findViewById(R.id.common_name_header)).setText(commonName);
    }
}
