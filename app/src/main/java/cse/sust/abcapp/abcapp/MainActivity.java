package cse.sust.abcapp.abcapp;

import java.util.ArrayList;
import java.util.Locale;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements  ActionBar.TabListener {


    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    private ActionBar actionBar;
    private String[] tabs =
            {"ABC", "", "123"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        actionBar = getSupportActionBar();

        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (int i = 0; i < tabs.length; i++) {
            actionBar.addTab(actionBar.newTab().setText(tabs[i]).setTabListener(this));
        }


        mViewPager.setOnPageChangeListener(
                new ViewPager.OnPageChangeListener() {

                    @Override
                    public void onPageSelected(int position) {
                        // TODO Auto-generated method stub

                        actionBar.setSelectedNavigationItem(
                                position);

                    }

                    @Override
                    public void onPageScrolled(int arg0, float arg1, int arg2) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onPageScrollStateChanged(int arg0) {
                        // TODO Auto-generated method stub

                    }
                });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(
            ActionBar.Tab tab, FragmentTransaction ft) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(
            ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(
            ActionBar.Tab tab, FragmentTransaction ft) {

    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        ListView listView;
        ArrayList<String> capital_a;
        ArrayList<String> small_a;
        ArrayList<String> button;
        private Activity context;


        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 2){
                return FragmeExample2.newInstance(position + 1);

            }


            else if(position == 1){
                return FragmeExample2.newInstance(position + 1);

            }
            return FragmeExample.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return "Section 1".toUpperCase(l);
                case 1:
                    return "Section 2".toUpperCase(l);
                case 2:
                    return "Section 3".toUpperCase(l);
            }
            return null;
        }
    }
}





