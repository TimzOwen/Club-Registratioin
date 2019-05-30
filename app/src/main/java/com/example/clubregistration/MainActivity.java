package com.example.clubregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
      EditText etUserName, etPassword;
    Button btnLogin;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          //call the find view by ids Methods
        findIds();

        //set a click listener to the btn RegisterActivity
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //move to a new intent
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });

    }

    //function ot find Ids
    public void findIds()
    {
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etUserPassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        tvRegister = (TextView)findViewById(R.id.tvRegister);

    }
    }
}
