package mk.android.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import mk.android.loclibrary.LibraryActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLoc;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoc=findViewById(R.id.btn_location);
        btnLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });

    }
}

