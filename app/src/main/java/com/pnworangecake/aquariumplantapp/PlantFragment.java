package com.pnworangecake.aquariumplantapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Called by a ListFragment or by a random selection on the main fragment. This will display the
 * information on the plant passed in by arguments.
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
}
