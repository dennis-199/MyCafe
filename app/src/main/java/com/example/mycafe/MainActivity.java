package com.example.mycafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        fooddata[] Fooddata = new fooddata[]{
                new fooddata("it will 30 minutes","a good ice cream ", R.drawable.ice_cream),
                new fooddata("it will 2 hours","a nice donut ", R.drawable.donut2),
                new fooddata("Prep and  cook :1 hour","a good froyo ", R.drawable.froyo),
        };

        foodadaptar Foodadapter = new foodadaptar(Fooddata, MainActivity.this);
        recyclerView.setAdapter(Foodadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_open, R.string.menu_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.pizza:
                        Log.i("MENU_DRAWER_TAG","Pizza clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.cocktails:
                        Log.i("MENU_DRAWER_TAG","Cocktail clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.pasta:
                        Log.i("MENU_DRAWER_TAG","Pasta clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.contactus:
                        Log.i("MENU_DRAWER_TAG","Contact us clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.aboutUs:
                        Log.i("MENU_DRAWER_TAG","About us clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.share:
                        Log.i("MENU_DRAWER_TAG","Share app clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });


    }
}