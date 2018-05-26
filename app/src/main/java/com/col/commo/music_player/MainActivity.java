package com.col.commo.music_player;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;


public class MainActivity extends Activity {

    private ImageView hello,stop,play,next,item;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (ImageView) findViewById(R.id.imageView);
        play = (ImageView) findViewById(R.id.play_view);
        stop = (ImageView) findViewById(R.id.stop_view);
        next = (ImageView) findViewById(R.id.next_view);
        item = (ImageView) findViewById(R.id.item_view);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupWindow();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    private void showPopupWindow(){

        View view = getLayoutInflater().inflate(R.layout.list,null,false);
        PopupWindow pop = new PopupWindow(view,250,280);
        pop.setAnimationStyle(R.style.AppTheme);

    }
}
