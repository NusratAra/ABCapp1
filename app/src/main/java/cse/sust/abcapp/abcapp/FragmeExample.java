package cse.sust.abcapp.abcapp;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ARA on 04-Jul-15.
 */
public class FragmeExample extends Fragment{

    ListView listView;
    ArrayList<String> capital_a;
    ArrayList<String> small_a;
    ArrayList<String> button;
    private Activity context;


    private static final String ARG_SECTION_NUMBER = "section_number";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        listView= (ListView) rootView.findViewById(R.id.listView1);
        //listView=(ListView)findViewById(R.id.listView1);
        button= new ArrayList<String>();

        capital_a =new ArrayList<String>();
        small_a= new ArrayList<String>();

        capital_a.add("aa");
        capital_a.add("bb");
        capital_a.add("cc");
        capital_a.add("dd");
        capital_a.add("ee");
        capital_a.add("ff");
        capital_a.add("gg");
        capital_a.add("hh");

        /*
        small_a.add("a");
        capital_a.add("bb");
        small_a.add("b");
*/

            context = getActivity();
            AbcCustomListAdapter adapter= new AbcCustomListAdapter(context, capital_a,small_a,button);
            listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(FragmeExample.this.getActivity(), MainActivity2Activity.class);
                startActivity(intent);
            }
        });



        /*

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                intent = new Intent(context, MainActivity2Activity.class);
                startActivity(intent);
            }
        });
        */




        /*
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(context, Fragment_details.class);
                startActivity(intent);
            }
        });*/


        return rootView;
    }
    public static FragmeExample newInstance(int sectionNumber) {
        FragmeExample fragment = new FragmeExample();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

}
