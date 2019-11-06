

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class ColorsActivity extends AppCompatActivity {
    
    private Firebase mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

     //impliment firebase ;
        mAuth = FirebaseAuth.getInstance();
        
        //find the auth button 
        btnLgin = findViewById(R.id.btngin);
        //set onClick Listener
        btnLgin.setOnClickListener()
        {
         //now give the firebase auth data   
        }
     //Create menu and inflate to allow user to switch easly between events.   

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
