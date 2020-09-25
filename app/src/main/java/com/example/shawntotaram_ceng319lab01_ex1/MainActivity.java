package com.example.shawntotaram_ceng319lab01_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        String[] activity = {"AIActivity", "VRActivity"};

        final ListView listView=(ListView)findViewById(R.id.lst);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,activity);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Object o = listView.getItemAtPosition(position);
                String str=(String)o;//As you are using Default String Adapter
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText(str); //set text for text view
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "List fragment has started!", 2).show();

    }
}