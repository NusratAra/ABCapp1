package cse.sust.abcapp.abcapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ARA on 04-Jul-15.
 */
public class FragmeExample2 extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        return rootView;
    }
    public static FragmeExample2 newInstance(int sectionNumber) {
        FragmeExample2 fragment = new FragmeExample2();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

}




