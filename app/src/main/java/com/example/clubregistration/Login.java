

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        //create an Array of words to be displayed (10) Elemets
        String [] words = new String [10];

        words [0] = "One";
        words [1] = "Two";
        words [2] = "Three";
        words [3] = "Four";
        words [4] = "Five";
        words [5] = "Six";
        words [6] = "Seven";
        words [7] = "Eight";
        words [8] = "Nine";
        words [9] = "Ten";

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_navigate, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.navigateback:
                startActivity(new Intent(ColorsActivity.this, MainActivity.class));
            return true;
            case R.id.add_language:
                //cal admin method
                return true;
            case R.id.exit_app:
                //exit the application method
            default:
            return super.onOptionsItemSelected(item);
        }


    }

}
