package ugd1.rastra.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    Double inputI1, inputI2, hasilI;
    EditText input1, input2;
    Button plus, minus, bagi, kali, kembaliK;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        input1 = (EditText) findViewById(R.id.edtInput1);
        input2 = (EditText) findViewById(R.id.edtInput2);

        plus = (Button) findViewById(R.id.btnPlus);
        minus = (Button) findViewById(R.id.btnMinus);
        kali = (Button) findViewById(R.id.btnKali);
        bagi = (Button) findViewById(R.id.btnBagi);
        kembaliK = (Button) findViewById(R.id.btnKembaliK);

        hasil = (TextView) findViewById(R.id.txHasil);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {
                    inputI1 = Double.parseDouble(input1.getText().toString());
                    inputI2 = Double.parseDouble(input2.getText().toString());
                    hasilI = inputI1 + inputI2;
                    hasil.setText(Double.toString(hasilI));
                }
                else{
                    hasil.setText("...");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {
                    inputI1 = Double.parseDouble(input1.getText().toString());
                    inputI2 = Double.parseDouble(input2.getText().toString());
                    hasilI = inputI1 - inputI2;
                    hasil.setText(Double.toString(hasilI));
                }
                else{
                    hasil.setText("...");
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {
                    inputI1 = Double.parseDouble(input1.getText().toString());
                    inputI2 = Double.parseDouble(input2.getText().toString());
                    hasilI = inputI1 * inputI2;
                    hasil.setText(Double.toString(hasilI));
                }
                else{
                    hasil.setText("...");
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)) {
                    inputI1 = Double.parseDouble(input1.getText().toString());
                    inputI2 = Double.parseDouble(input2.getText().toString());
                    hasilI = inputI1 / inputI2;
                    hasil.setText(Double.toString(hasilI));
                }
                else{
                    hasil.setText("...");
                }
            }
        });

        kembaliK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KalkulatorActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}