package com.example.memes;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.HttpResponseCache;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.ConversationActions;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private ImageView showMeme;
private Button nextMeme;
private List<Integer> imgList;
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMeme=findViewById(R.id.memes_test);
        nextMeme=findViewById(R.id.next_meme);
        imgList=new ArrayList<>();
        imgList.add(R.drawable.img1);
        imgList.add(R.drawable.img2);
        imgList.add(R.drawable.img3);
        imgList.add(R.drawable.img4);
        imgList.add(R.drawable.img5);
        imgList.add(R.drawable.img6);
        imgList.add(R.drawable.img7);
        imgList.add(R.drawable.img8);
        imgList.add(R.drawable.img9);
        imgList.add(R.drawable.img10);
        imgList.add(R.drawable.img11);
        imgList.add(R.drawable.img12);
        imgList.add(R.drawable.img13);
        imgList.add(R.drawable.img14);
        imgList.add(R.drawable.img15);
        nextMeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            try {
                Random random=new Random();
                int randomNumber=random.nextInt(15);
                int getPosition=imgList.get(randomNumber);
                showMeme.setImageResource(getPosition);

            }
            catch (IndexOutOfBoundsException e)
            {
                e.printStackTrace();
            }
            }
        });
    }
}