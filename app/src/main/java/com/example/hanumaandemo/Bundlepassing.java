package com.example.hanumaandemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bundlepassing extends AppCompatActivity {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bundlepassing);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Aarti_Activity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId== R.id.exit){
            Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show();
            finish();
        }
        else if (itemId==R.id.shere){
            Intent iShare = new Intent(Intent.ACTION_SEND);
            iShare.setType("text/plain");
            iShare.putExtra(Intent.EXTRA_TEXT,"Welcome Hanuman Chalisa App,");
            startActivity(iShare);
            Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(this,"Notification",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}