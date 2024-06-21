// HomeActivity.java
package app.ij.mlwithtensorflowlite;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Make sure your home layout is named 'home.xml'

        ImageButton startButton = findViewById(R.id.startButton);
        ImageButton dicButton = findViewById(R.id.dicButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivity when start button is clicked
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        dicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to DicActivity when dic button is clicked
                Intent intent = new Intent(HomeActivity.this, DicActivity.class);
                startActivity(intent);
            }
        });
    }
}

