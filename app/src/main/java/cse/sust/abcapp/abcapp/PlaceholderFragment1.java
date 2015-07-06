
package cse.sust.abcapp.abcapp;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ARA on 04-Jul-15.
 */
public class PlaceholderFragment1 extends Fragment {

    ListView listView;
    ArrayList<String> capital_a;
    ArrayList<String> small_a;
    ArrayList<String> button;
    private Activity context;



    private static final String ARG_SECTION_NUMBER = "section_number";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        return rootView;
    }




}
