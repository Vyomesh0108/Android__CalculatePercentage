package com.example.calculatepercentage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
   EditText etnum1,etnum2,etnum3;
   Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);
        etnum3 = findViewById(R.id.etnum3);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(etnum1.getText().toString());
                int n2 = Integer.parseInt(etnum2.getText().toString());
                int n3 = Integer.parseInt(etnum3.getText().toString());

                int total = n1+n2+n3;
                float per = (float)total/3;

                if(per>=90 && per<100)
                {
                    String grade = "A+";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=80 && per<90)
                {
                    String grade = "A";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=75 && per<80)
                {
                    String grade = "B+";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=70 && per<75)
                {
                    String grade = "B";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=65 && per<70)
                {
                    String grade = "C+";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=60 && per<65)
                {
                    String grade = "C";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=55 && per<60)
                {
                    String grade = "D+";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=50 && per<55)
                {
                    String grade = "D";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=45 && per<50)
                {
                    String grade = "E+";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else if(per>=40 && per<45)
                {
                    String grade = "E";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
                else
                {
                    String grade = "F (Fail)";

                    Toast.makeText(MainActivity.this, "Grade is "+grade, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("per",""+per);
                    intent.putExtra("grade",""+grade);
                    startActivity(intent);
                }
            }
        });
    }
}