package ie.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ie.app.visitwaterford.Greenway;
import ie.app.visitwaterford.Museum;
import ie.app.visitwaterford.Palace;
import ie.app.visitwaterford.R;

public class Ratings extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);

        listView = (ListView)findViewById(R.id.list_item);
        String[] values = new String[]{"Waterford Crystal","Reginal's Tower","Greenway", "Medieval Museum", "Bishops Palace"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent myIntent = new Intent(view.getContext(), Crystal.class);
                    startActivityForResult(myIntent, 0);

                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), Tower.class);
                    startActivityForResult(myIntent, 0);

                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), Greenway.class);
                    startActivityForResult(myIntent, 0);

                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), Museum.class);
                    startActivityForResult(myIntent, 0);

                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), Palace.class);
                    startActivityForResult(myIntent, 0);


                }

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ratings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuHome : startActivity (new Intent(this, Home.class));
                break;
            case R.id.menuPlace : startActivity (new Intent(this, Place.class));
                break;
            case R.id.menuDonate : startActivity (new Intent(this, Donate.class));
                break;
            case R.id.menuReport : startActivity (new Intent(this, Report.class));
                break;
            case R.id.menuCamera : startActivity (new Intent(this, Camera.class));
                break;
            case R.id.menuJournal : startActivity (new Intent(this, Journal.class));
                break;



        }
        return super.onOptionsItemSelected(item);
    }

}


