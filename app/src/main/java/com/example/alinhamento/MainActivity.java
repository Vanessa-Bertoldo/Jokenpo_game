package com.example.alinhamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void optionSelect(View view){
        int idDaView = view.getId();

        //0-stone 1-paper 2-scissors

        int choiceApp = new Random().nextInt(3);
        int choiceUser;

        TextView textResult = findViewById(R.id.choiceUserText);

        ImageView imageAppChoice = findViewById(R.id.choiceAppImg);

        if (idDaView == R.id.stone) {
            choiceUser = 0;
        } else if (idDaView == R.id.paper){
            choiceUser = 1;
        } else{
            choiceUser = 2;
        }

        switch (choiceApp){
            case 0: //stone
                imageAppChoice.setImageResource(R.drawable.pedra);
                break;
            case 1: //paper
                imageAppChoice.setImageResource(R.drawable.papel);
                break;
            case 2: //scissors
                imageAppChoice.setImageResource(R.drawable.tesoura);
                break;
        }
        //0-stone 1-paper 2-scissors

        if(//App champ
                (choiceApp == 2 && choiceUser == 1) ||
                (choiceApp == 1 && choiceUser == 0) ||
                (choiceApp == 0 && choiceUser == 2)
        ){
            textResult.setText("Você perdeu! Tente novamente.");
        } else if(
                (choiceUser == 2 && choiceApp == 1) ||
                (choiceUser == 1 && choiceApp == 0) ||
                (choiceUser == 0 && choiceApp == 2)
        ){ //User champ
            textResult.setText("Você ganhou! Parabéns");
        } else { //draw
            textResult.setText("Empate");
        }



    }

}
