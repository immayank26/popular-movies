package com.example.ma26.popularmovies_i;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
private ArrayAdapter<String> movieArray;

    ListView ls;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_main, container, false);
        String [] movieName=
                {
                        "Abcd",
                        "Mayank"
                };
        List<String> allMovies= new ArrayList<String>(
                Arrays.asList(movieName)
        );
        movieArray= new ArrayAdapter<String>(getActivity(),R.layout.movie_layout,R.id.movie_display_view,allMovies);
        ls=(ListView) rootView.findViewById(R.id.movie_list);
        ls.setAdapter(movieArray);
        return rootView;
    }
}
