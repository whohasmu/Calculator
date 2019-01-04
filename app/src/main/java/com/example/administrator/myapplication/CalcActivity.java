package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CalcActivity extends AppCompatActivity {
    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;

    Button button_Divide;
    Button button_Multiple;
    Button button_Minus;
    Button button_Plus;

    Button button_Equal;
    Button button_Clear;

    TextView TV_result;
    TextView TV_input;

    Animation ani;
    Integer sum;

    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<String> ops = new ArrayList<>();

    Boolean calcResult = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ani = AnimationUtils.loadAnimation(CalcActivity.this, R.anim.alpha_button);

        button_0 = findViewById(R.id.Button_0);
        button_1 = findViewById(R.id.Button_1);
        button_2 = findViewById(R.id.Button_2);
        button_3 = findViewById(R.id.Button_3);
        button_4 = findViewById(R.id.Button_4);
        button_5 = findViewById(R.id.Button_5);
        button_6 = findViewById(R.id.Button_6);
        button_7 = findViewById(R.id.Button_7);
        button_8 = findViewById(R.id.Button_8);
        button_9 = findViewById(R.id.Button_9);

        button_Divide = findViewById(R.id.Button_Divide);
        button_Multiple = findViewById(R.id.Button_Multiple);
        button_Minus = findViewById(R.id.Button_Minus);
        button_Plus = findViewById(R.id.Button_Plus);

        button_Equal = findViewById(R.id.Button_Equal);
        button_Clear = findViewById(R.id.Button_Clear);

        TV_result = findViewById(R.id.result);
        TV_input = findViewById(R.id.inputNum);
        sum=0;


        button_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TV_input.equals(null)) {
                    if(calcResult){
                        TV_result.setText(TV_input.getText().toString());
                        TV_input.setText("!");
                    }else {

                        nums.add(Integer.parseInt(TV_input.getText().toString()));
                    }
                    ops.add("/");
                    String temp = "";

                    for(int i=0;i<ops.size();i++){
                        temp+=nums.get(i).toString();

                        temp+=ops.get(i).toString();
                    }


                    TV_result.setText(temp);
                    TV_input.setText("");
                }


            }
        });

        button_Multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calcResult){
                    TV_result.setText(TV_input.getText().toString());
                    TV_input.setText("!");
                }else {

                    nums.add(Integer.parseInt(TV_input.getText().toString()));
                }
                ops.add("x");

                String temp = "";

                for(int i=0;i<ops.size();i++){
                    temp+=nums.get(i).toString();
                    temp+=ops.get(i).toString();
                }


                TV_result.setText(temp);
                TV_input.setText("");

            }
        });

        button_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(calcResult){
                    TV_result.setText(TV_input.getText().toString());
                    TV_input.setText("!");
                }else {

                    nums.add(Integer.parseInt(TV_input.getText().toString()));
                }
                ops.add("-");
                String temp = "";

                for(int i=0;i<ops.size();i++){
                    temp+=nums.get(i).toString();
                    temp+=ops.get(i).toString();
                }



                TV_result.setText(temp);
                TV_input.setText("");

            }
        });

        button_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(calcResult){
                    TV_result.setText(TV_input.getText().toString());
                    TV_input.setText("!");
                }else {

                    nums.add(Integer.parseInt(TV_input.getText().toString()));
                }
                ops.add("+");
                String temp = "";

                for(int i=0;i<ops.size();i++){
                    temp+=nums.get(i).toString();
                    temp+=ops.get(i).toString();
                }


                TV_result.setText(temp);
                TV_input.setText("");

            }
        });

        button_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nums.clear();
                ops.clear();
                TV_input.setText("");
                TV_result.setText("");
                calcResult = false;

            }
        });

        button_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.add(Integer.parseInt( TV_input.getText().toString() ) );

                String temp = "";
                for(int i=0;i<ops.size();i++){
                    temp+=nums.get(i).toString();
                    temp+=ops.get(i).toString();
                }
                temp += nums.get(nums.size()-1).toString();
                TV_result.setText(temp);

                TV_input.setText(calculate().toString());

                calcResult = true;
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TV_input.setText(TV_input.getText()+"0");
                button_0.startAnimation(ani);


            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"1");
                button_1.startAnimation(ani);

            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"2");
                button_2.startAnimation(ani);

            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"3");
                button_3.startAnimation(ani);

            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"4");
                button_4.startAnimation(ani);

            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"5");
                button_5.startAnimation(ani);

            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"6");
                button_6.startAnimation(ani);

            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"7");
                button_7.startAnimation(ani);

            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"8");
                button_8.startAnimation(ani);

            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_input.setText(TV_input.getText()+"9");
                button_9.startAnimation(ani);

            }
        });




    }

    public Integer calculate(){

        Log.d("로그","nums  : " + nums.toString());
        Log.d("로그","ops  : " + ops.toString());
        Integer sum=nums.get(0);

        for(int i=0;i<ops.size();i++){
            switch(ops.get(i)){
                case "+":
                    sum += nums.get(i+1);
                    break;
                case "/":
                    sum /= nums.get(i+1);
                    break;
                case "-":
                    sum -= nums.get(i+1);
                    break;
                case "x":
                    sum *= nums.get(i+1);
                    break;

            }
        }
        nums.clear();
        nums.add(sum);
        ops.clear();
        return sum;


    }
}
