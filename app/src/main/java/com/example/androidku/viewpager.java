package com.example.androidku;

import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

//20-mei-2019
// Nim 10116314
// nama : Sabadi Dwiputra
// kelas : IF-7


public class viewpager extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabInfo;
    TabItem tabprofile;
    TabItem tabMedsos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);


        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);
        tabInfo = findViewById(R.id.tabinfo);
        tabprofile = findViewById(R.id.tabprofile);
        tabMedsos = findViewById(R.id.tabMedsos);

        pageAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
           public void onTabSelected(TabLayout.Tab tab) {
               viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(viewpager.this,
                           R.color.colorAccent));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(viewpager.this,
                                R.color.colorAccent));
                    }
                }else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(viewpager.this,
                            android.R.color.darker_gray));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(viewpager.this,
                            android.R.color.darker_gray));
                   if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                       getWindow().setStatusBarColor(ContextCompat.getColor(viewpager.this,
                                android.R.color.darker_gray));
                    }
                }else {
                   toolbar.setBackgroundColor(ContextCompat.getColor(viewpager.this,R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(viewpager.this, R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                      getWindow().setStatusBarColor(ContextCompat.getColor(viewpager.this,
                               R.color.colorPrimary));

                    }

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }


    }

