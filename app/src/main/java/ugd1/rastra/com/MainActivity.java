package ugd1.rastra.com;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPilihan(View view){
        Intent intentProfil = new Intent(this, ProfilActivity.class);
        Intent intentKalkulator = new Intent(this, KalkulatorActivity.class);

        String message = "";

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int rbc = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(rbc);
        message = radioButton.getText().toString();

        if (message.equals("Profil")){
            startActivity(intentProfil);
        }
        else if (message.equals("Kalkulator")){
            startActivity(intentKalkulator);
        }
    }
}