package com.example.basicquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    Button button1;
    Button button2;
    int index = 0, score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        String[] arr = {"How often do you check your smartphone?", "How would you feel if you had to go a day without your phone?", "Does anyone close to you ever complain that you’re on your phone or social media too much?", "How important is it for you to stay connected with everything your friends say and do online?","How often do you talk to your friends face-to-face, instead of through social media, games or texting?","How often do you post something on social media only to take it down later because of others’ reactions?","Do you ever get up in the night to check your phone?","Do you ever miss out on things happening around you because you’re busy taking pictures for social media, or looking to see what others have posted?","Do you lose track of time when you’re on your device?","Have you ever felt envious about something you’ve seen on social media?"};
        boolean[] ans = {true,true,false,false};

        textView.setText(arr[index]);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(index<arr.length)
                {
                    if(index==arr.length-1)
                    {
                        if(ans[index]==true)
                        {
                            score++;
                        }
                        index++;
                        Toast.makeText(MainActivity.this, "Your score is: " + score + "/4", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        if (ans[index] == true)
                        {
                            score++;
                        }
                        index++;
                        textView.setText(arr[index]);
                    }

                }

                else
                {
                    Toast.makeText(MainActivity.this, "Restart to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(index<arr.length)
                {
                    if(index==arr.length-1)
                    {
                        if(ans[index]==false)
                        {
                            score++;
                        }
                        index++;
                        Toast.makeText(MainActivity.this, "Your score is: " + score + "/4", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        if(ans[index]==false)
                        {
                            score++;
                        }
                        index++;
                        textView.setText(arr[index]);
                    }

                }

                else
                {
                    Toast.makeText(MainActivity.this, "Restart to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}