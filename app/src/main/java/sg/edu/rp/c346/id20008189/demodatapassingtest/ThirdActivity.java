package sg.edu.rp.c346.id20008189.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvChar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvChar=findViewById(R.id.tvChar);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("char", '1');
        tvChar.setText("Character value received is: " + value);
    }
}