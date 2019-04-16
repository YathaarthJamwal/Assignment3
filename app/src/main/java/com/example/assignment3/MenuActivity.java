package com.example.assignment3;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.assignment3.fragments.AboutFragment;
import com.example.assignment3.fragments.ContactFragment;
import com.example.assignment3.fragments.HelpFragment;
import com.example.assignment3.fragments.Primary;
import com.example.assignment3.fragments.SendFragment;

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Activity context;
    NavigationView navigationView;
    DrawerLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.placeholder, new Primary());
        ft.commit();

        layout = findViewById(R.id.drawer);
        ImageView hamburger=findViewById(R.id.image);

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.openDrawer(GravityCompat.START);
            }
        });
        navigationView=findViewById(R.id.nav_view);
        context=this;
        navigationView.setNavigationItemSelectedListener(this);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {

        layout.closeDrawer(GravityCompat.START);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        switch(menuItem.getItemId())
        {
            case R.id.primary:
                Toast.makeText(context,"Primary Fragment",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.placeholder, new Primary());
                ft.commit();

                break;
            case R.id.send:
                Toast.makeText(context,"Send Fragment",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.placeholder, new SendFragment());
                ft.commit();
                break;
            case R.id.contact:
                Toast.makeText(context,"Contact Fragment",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.placeholder, new ContactFragment());
                ft.commit();
                break;
            case R.id.about:
                Toast.makeText(context,"About Fragment",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.placeholder, new AboutFragment());
                ft.commit();
                break;
            case R.id.help:
                Toast.makeText(context,"Help",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.placeholder, new HelpFragment());
                ft.commit();
                break;
        }
        return true;
    }
}
