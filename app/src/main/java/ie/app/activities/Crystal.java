package ie.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import ie.app.visitwaterford.R;

public class Crystal extends AppCompatActivity {

    /*
    Reference for how to setup list view
    https://www.youtube.com/watch?v=hIVAFrq3DCI

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crystal);

        //https://www.youtube.com/watch?v=hIVAFrq3DCI

        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Button submitButton = (Button) findViewById(R.id.palaceSubmit);
        final TextView crystalText = (TextView) findViewById(R.id.palaceText);
        final TextView crystalRatingText = (TextView) findViewById(R.id.crystalRatingText);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crystalRatingText.setText("Your Rating is: " + ratingBar.getRating());
            }
        });
    }

    // All Code above untill comment

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_subplaces, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuHome : startActivity (new Intent(this, Home.class));
                break;
            case R.id.menuRatings : startActivity (new Intent(this, Ratings.class));
                break;
            case R.id.menuDonate : startActivity (new Intent(this, Donate.class));
                break;
            case R.id.menuReport : startActivity (new Intent(this, Report.class));
                break;
            case R.id.menuPlace : startActivity (new Intent(this, Place.class));
                break;
            case R.id.menuCamera : startActivity (new Intent(this, Camera.class));
                break;
            case R.id.menuJournal : startActivity (new Intent(this, Journal.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}
