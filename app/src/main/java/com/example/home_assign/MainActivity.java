package com.example.home_assign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox Box1, Box2, Box3, Box4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Box1 = (CheckBox) findViewById(R.id.Box1);
        Box2 = (CheckBox) findViewById(R.id.Box2);
        Box3 = (CheckBox) findViewById(R.id.Box3);
        Box4 = (CheckBox) findViewById(R.id.Box4);

    }


    public void OnCheckBox(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.Box1:
                str = checked ? "Chocolate Syrup Selected" : "Chocolate Syrup Deselected";
                break;
            case R.id.Box2:
                str = checked ? "Sprinkkles Selected" : "Sprinkles Deselected";
                break;
            case R.id.Box3:
                str = checked ? "Crushed Nuts Selected" : "Crushed Nuts Deselected";
                break;
            case R.id.Box4:
                str = checked ? "Oreo Cookie Crumbles Selected" : "Oreo Cookie Crumbles Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

    public void OnClick(View view) {
        String result = " ";
        if(Box1.isChecked()){
            result += "\nChocolate Syrup";
        }
        if(Box2.isChecked()){
            result += "\nSprinkles";
        }
        if(Box3.isChecked()){
            result += "\nCrushed Nuts";
        }
        if(Box4.isChecked()){
            result += "\nOreo Cookie Crushed";
        }
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
    }


}