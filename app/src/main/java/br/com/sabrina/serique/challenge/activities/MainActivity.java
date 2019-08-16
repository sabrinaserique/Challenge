package br.com.sabrina.serique.challenge.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.sabrina.serique.challenge.R;
import br.com.sabrina.serique.challenge.constants.Constantes;
import br.com.sabrina.serique.challenge.fragments.ListFragment;
import br.com.sabrina.serique.challenge.fragments.StartFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, Constantes {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private FragmentManager fragmentManager;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();

        fragment = getSupportFragmentManager().findFragmentByTag(FRAG_START);
        if (fragment == null) {

            fragment = new StartFragment();
        }
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment, FRAG_START)
                .commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
                case R.id.nav_item1: {
                    fragment = getSupportFragmentManager().findFragmentByTag(FRAG_LIST);
                    if (fragment == null) {

                        fragment = new ListFragment();
                    }
                    fragmentManager.beginTransaction()
                            .replace(R.id.container, fragment, FRAG_LIST)
                            .commit();
                    break;
                }
                default: {
                    Toast.makeText(this, "Menu Default", Toast.LENGTH_SHORT).show();
                    break;
                }
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void abrirActivity(Class activityDestino, Bundle bundle) {

        Intent intent = new Intent(this, activityDestino);
        intent.putExtra(PARAM_BUNDLE, bundle);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
