package cse.sust.abcapp.abcapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by ARA on 04-Jul-15.
 */
public class AbcCustomListAdapter extends BaseAdapter {

    ArrayList<String> capital_a;
    ArrayList<String> small_a;
    ArrayList<String> button;
    private Activity context;


    public AbcCustomListAdapter(Activity context, ArrayList<String> capital_a,ArrayList<String> small_a, ArrayList<String> button){
        this.context=context;
        this.capital_a= capital_a;
        this.small_a= small_a;
        this.button=button;
    }


    @Override
    public int getCount() {
        return capital_a.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        Log.e("Tageshfshd ", "jshdgfj" + i);
        if (view == null) {
            view =context.getLayoutInflater().inflate(R.layout.abc_list, viewGroup, false);
        }



        final ImageView capital_aa = (ImageView)view.findViewById(R.id.capital_a);
        ImageView small_aa = (ImageView)view.findViewById(R.id.small_a);
        final Button button1= (Button) view.findViewById(R.id.button);



        String name=  capital_a.get(i) ;

        if(name.contains("aa")){
            capital_aa.setImageResource(R.drawable.aa);
            small_aa.setImageResource(R.drawable.a);
        }

        else if(name.contains("bb")){
            capital_aa.setImageResource(R.drawable.bb);
            small_aa.setImageResource(R.drawable.b);
        }
        else if(name.contains("cc")){
            capital_aa.setImageResource(R.drawable.cc);
            small_aa.setImageResource(R.drawable.c);
        }
        else if(name.contains("dd")){
            capital_aa.setImageResource(R.drawable.dd);
           // small_aa.setImageResource(R.drawable.d);
        }
        else if(name.contains("ee")){
            capital_aa.setImageResource(R.drawable.ee);
            small_aa.setImageResource(R.drawable.e);
        }
        else if(name.contains("ff")){
            capital_aa.setImageResource(R.drawable.ff);
            small_aa.setImageResource(R.drawable.f);
        }
        else if(name.contains("gg")){
            capital_aa.setImageResource(R.drawable.gg);
            small_aa.setImageResource(R.drawable.g);
        }
        else if(name.contains("hh")){
            capital_aa.setImageResource(R.drawable.hh);
            small_aa.setImageResource(R.drawable.h);
        }





        return view;
    }
}
