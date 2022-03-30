package com.example.ndhjb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn00;
    Button btn01;
    Button btn02;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn20;
    Button btn21;
    Button btn22;
    Button btnStart;

    Button[][] arrayBtn = new Button[3][3];

    int k = 0;

    void startGame(){
        for(int i = 0; i <3; i++)
        {
            for(int j = 0; j <3; j++)
            {
                arrayBtn[i][j].setText("");
                arrayBtn[i][j].setClickable(true);

            }
        }
        k = 0;
        return;
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn00 = (Button)findViewById(R.id.b00);
        btn01 = (Button)findViewById(R.id.b01);
        btn02 = (Button)findViewById(R.id.b02);
        btn10 = (Button)findViewById(R.id.b10);
        btn11 = (Button)findViewById(R.id.b11);
        btn12 = (Button)findViewById(R.id.b12);
        btn20 = (Button)findViewById(R.id.b20);
        btn21 = (Button)findViewById(R.id.b21);
        btn22 = (Button)findViewById(R.id.b22);

        btnStart = (Button)findViewById(R.id.bStart);

        arrayBtn[0][0] = btn00;
        arrayBtn[0][1] = btn01;
        arrayBtn[0][2] = btn02;
        arrayBtn[1][0] = btn10;
        arrayBtn[1][1] = btn11;
        arrayBtn[1][2] = btn12;
        arrayBtn[2][0] = btn20;
        arrayBtn[2][1] = btn21;
        arrayBtn[2][2] = btn22;



        View.OnClickListener oclStart = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startGame();
            }
        };



        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setClickable(false);

                switch (v.getId()) {

                    //00
                    case R.id.b00:  if (k % 2 == 0)
                    {
                        btn00.setText("X");
                    }
                    else
                    {
                        btn00.setText("O");
                    }
                        k++;
                    break;
                    //01
                    case R.id.b01:  if (k % 2 == 0)
                    {
                        btn01.setText("X");
                    }
                    else
                    {
                        btn01.setText("O");
                    }
                        k++;
                        break;

                        //02
                    case R.id.b02:  if (k % 2 == 0)
                    {
                        btn02.setText("X");
                    }
                    else
                    {
                        btn02.setText("O");
                    }
                        k++;
                        break;

                    //10
                    case R.id.b10:  if (k % 2 == 0)
                    {
                        btn10.setText("X");
                    }
                    else
                    {
                        btn10.setText("O");
                    }
                        k++;
                        break;

                    //11
                    case R.id.b11:  if (k % 2 == 0)
                    {
                        btn11.setText("X");
                    }
                    else
                    {
                        btn11.setText("O");
                    }
                        k++;
                        break;

                    //12
                    case R.id.b12:  if (k % 2 == 0)
                    {
                        btn12.setText("X");
                    }
                    else
                    {
                        btn12.setText("O");
                    }
                        k++;
                        break;

                    //20
                    case R.id.b20:  if (k % 2 == 0)
                    {
                        btn20.setText("X");
                    }
                    else
                    {
                        btn20.setText("O");
                    }
                        k++;
                        break;

                    //21
                    case R.id.b21:  if (k % 2 == 0)
                    {
                        btn21.setText("X");
                    }
                    else
                    {
                        btn21.setText("O");
                    }
                        k++;
                        break;

                    //12
                    case R.id.b22:  if (k % 2 == 0)
                    {
                        btn22.setText("X");
                    }
                    else
                    {
                        btn22.setText("O");
                    }
                        k++;
                        break;
                }

                if(btn00.getText() == btn01.getText() && btn01.getText() == btn02.getText() && btn00.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn00.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn10.getText() == btn11.getText() && btn11.getText() == btn12.getText() && btn10.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn10.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn20.getText() == btn21.getText() && btn21.getText() == btn22.getText() && btn20.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn20.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn00.getText() == btn10.getText() && btn10.getText() == btn20.getText() && btn00.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn00.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn01.getText() == btn11.getText() && btn11.getText() == btn21.getText() && btn01.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn01.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn02.getText() == btn12.getText() && btn12.getText() == btn22.getText() && btn02.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn02.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn00.getText() == btn11.getText() && btn11.getText() == btn22.getText() && btn00.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn00.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }

                if(btn02.getText() == btn11.getText() && btn11.getText() == btn20.getText() && btn02.getText() != ""){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Win " + btn02.getText(), Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }


                if(k==9){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ничья!", Toast.LENGTH_SHORT);
                    toast.show();
                    startGame();
                }


            }
        };

        for(int i = 0; i <3; i++)
        {
            for(int j = 0; j <3; j++)
            {
                arrayBtn[i][j].setOnClickListener(oclBtn);
            }
        }
        btnStart.setOnClickListener(oclStart);


    }
}