package comp5216.sydney.edu.au.runningdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pace_calculator);

        final EditText distanceValue = (EditText) findViewById(R.id.distanceValue);
        final EditText timeValue = (EditText) findViewById(R.id.timeValue);
        final TextView paceValue = (TextView) findViewById(R.id.paceValue);
        final TextView speedValue = (TextView) findViewById(R.id.speedValue);

        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String distance= distanceValue.getText().toString();
                String time= timeValue.getText().toString();
                // Code here executes on main thread after user presses button
                if (!distance.equals("") && !time.equals("")) {
                    float timeInt=Integer.parseInt(time);
                    float distanceInt=Integer.parseInt(distance);
                    // TODO: Fix the calculations
                    speedValue.setText("" + (distanceInt/timeInt));
                    paceValue.setText("" + (timeInt/distanceInt));
                } else {
                    //Toast.makeText(this,"Enter 2 numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void onMusicButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, MusicPlayer.class);
        if (intent != null) {
            startActivity(intent);

        }
    }
}
