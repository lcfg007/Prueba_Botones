package com.example.myapplication.prueba_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton b_StamdBy = (ImageButton)findViewById(R.id.Standby);

            b_StamdBy.setOnTouchListener(new View.OnTouchListener() {
            @Override

            public boolean onTouch(View v, MotionEvent event) {
                return false;/*

        @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    b_StamdBy.setImageResource(R.drawable.boton_piloto_automaticol);
                    return true;
                }else if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    b_StamdBy.setImageResource(R.drawable.boton_piloto_automaticol_pulsado);
                    return true;
                }
                return false;*/
            }
        });

    }


}