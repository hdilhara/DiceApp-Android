package com.hdilhara.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button rollButton = findViewById(R.id.roll_btn);
        final ImageView leftDice = findViewById(R.id.lftDice);
        final ImageView rightDice = findViewById(R.id.ritDice);

        //declare all dice images in drawable
        final int[] dicePic = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RollButton", "user clicked the button! ");

                //define a random number 1-6
                Random randomNumGenerator = new Random();
                int num1;
                int num2;

                num1 = randomNumGenerator.nextInt(6);
                num2 = randomNumGenerator.nextInt(6);

                Log.d("RandomNumber", "genarated number : " + num1);
                Log.d("RandomNumber", "genarated number : " + num2);

                //change dice image
                leftDice.setImageResource(dicePic[num1]);
                rightDice.setImageResource(dicePic[num2]);

            }
        });


    }


}
