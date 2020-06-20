package me.creatorguy.androideventhandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Button btnMain2, btnMain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain2 = findViewById(R.id.btnMain2);
        btnMain3 = findViewById(R.id.btnMain3);

        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Button 2 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnMain3.setOnClickListener(this);
    }

    public void btnMain1Click(View view) {
        Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnMain3:
                Toast.makeText(this, "Button 3 Clicked", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}