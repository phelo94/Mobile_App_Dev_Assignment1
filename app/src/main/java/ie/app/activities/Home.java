package ie.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import ie.app.visitwaterford.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    //to disable back button from retutning to theLogin activity on the H ome screen

    /*
    https://www.youtube.com/watch?v=8FuVcNmqTMM&fbclid=IwAR3mu_An913Zt5JSXfjSnkJNgnnKSVmJUHy6iTXsnmHAJRDA433OfHDxUcA
    */

    @Override
    public void onBackPressed(){

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }


    // david reference code from following class tutorials
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuPlace : startActivity (new Intent(this, Place.class));
                break;
            case R.id.menuRatings : startActivity (new Intent(this, Ratings.class));
                break;
            case R.id.menuReport : startActivity (new Intent(this, Report.class));
                break;
            case R.id.menuDonate : startActivity (new Intent(this, Donate.class));
                break;
            case R.id.menuCamera : startActivity (new Intent(this, Camera.class));
                break;
            case R.id.menuJournal : startActivity (new Intent(this, Journal.class));
                break;


        }


        return super.onOptionsItemSelected(item);
    }

}
