package com.nitroja.kbennett.upmodule;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Calendar;

public class Quotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
        int day = now.get(Calendar.DAY_OF_MONTH);

        final String [] quotes;
        quotes = new String[263];

        quotes[11] = new String("default");
        quotes[12] = new String("default");
        quotes[13] = new String("default");
        quotes[14] = new String("default");
        quotes[15] = new String("default");
        quotes[16] = new String("default");
        quotes[17] = new String("default");
        quotes[18] = new String("default");
        quotes[19] = new String("default");
        quotes[20] = new String("default");
        quotes[21] = new String("default");
        quotes[22] = new String("default");
        quotes[23] = new String("default");
        quotes[24] = new String("default");
        quotes[25] = new String("default");
        quotes[26] = new String("default");
        quotes[27] = new String("default");
        quotes[28] = new String("default");
        quotes[29] = new String("default");


        int month_count = 0, day_count = 0, month_correct = 0, day_correct = 0;

        int month_of_year[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        int date_april[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        final Button april_12 = (Button) findViewById(R.id.april12);
        final Button april_13 = (Button) findViewById(R.id.april13);
        final Button april_14 = (Button) findViewById(R.id.april14);
        final Button april_15 = (Button) findViewById(R.id.april15);
        final Button april_16 = (Button) findViewById(R.id.april16);
        final Button april_17 = (Button) findViewById(R.id.april17);
        final Button april_18 = (Button) findViewById(R.id.april18);
        final Button april_19 = (Button) findViewById(R.id.april19);
        final Button april_20 = (Button) findViewById(R.id.april20);
        final Button april_21 = (Button) findViewById(R.id.april21);
        final Button april_22 = (Button) findViewById(R.id.april22);
        final Button april_23 = (Button) findViewById(R.id.april23);
        final Button april_24 = (Button) findViewById(R.id.april24);
        final Button april_25 = (Button) findViewById(R.id.april25);
        final Button april_26 = (Button) findViewById(R.id.april26);
        final Button april_27 = (Button) findViewById(R.id.april27);
        final Button april_28 = (Button) findViewById(R.id.april28);
        final Button april_29 = (Button) findViewById(R.id.april29);
        final Button april_30 = (Button) findViewById(R.id.april30);


       final TextView text1 = (TextView) findViewById(R.id.textView);



        april_12.setVisibility(View.GONE);
        april_13.setVisibility(View.GONE);
        april_14.setVisibility(View.GONE);
        april_15.setVisibility(View.GONE);
        april_16.setVisibility(View.GONE);
        april_17.setVisibility(View.GONE);
        april_18.setVisibility(View.GONE);
        april_19.setVisibility(View.GONE);
        april_20.setVisibility(View.GONE);
        april_21.setVisibility(View.GONE);
        april_22.setVisibility(View.GONE);
        april_23.setVisibility(View.GONE);
        april_24.setVisibility(View.GONE);
        april_25.setVisibility(View.GONE);
        april_26.setVisibility(View.GONE);
        april_27.setVisibility(View.GONE);
        april_28.setVisibility(View.GONE);
        april_29.setVisibility(View.GONE);
        april_30.setVisibility(View.GONE);



        while (month_count < 13) {

            if (month_count == month) {

                month_correct = month_count;

            }

            month_count = month_count + 1;

        }


        if (month == 4 || month == 6 || month == 9 || month == 11) {


            while (day_count < 31) {

                if (day_count == day) {

                    day_correct = day_count;

                }

                day_count = day_count + 1;

            }
        }
        else {
            while (day_count < 32) {

                if (day_count == day) {

                    day_correct = day_count;

                }

                day_count = day_count + 1;

            }
        }


            if (month_correct == 4) {


                if (day_correct == 12) {

                    april_12.setVisibility(View.VISIBLE);

                    april_12.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_12.setTextColor(Color.parseColor("#fe5a13"));

                    april_12.setTextSize(28);

                    text1.setText(quotes[11]);

                }

                if (day_correct == 13) {

                    april_12.setVisibility(View.VISIBLE);

                    april_13.setVisibility(View.VISIBLE);

                    april_13.setTextColor(Color.parseColor("#fe5a13"));

                    april_13.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_13.setTextSize(28);

                    text1.setText(quotes[12]);

                }


                if (day_correct == 14) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);

                    april_14.setVisibility(View.VISIBLE);

                    april_14.setTextColor(Color.parseColor("#fe5a13"));

                    april_14.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_14.setTextSize(28);

                    text1.setText(quotes[13]);

                }


                if (day_correct == 15) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);

                    april_15.setVisibility(View.VISIBLE);

                    april_15.setTextColor(Color.parseColor("#fe5a13"));

                    april_15.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_15.setTextSize(28);

                    text1.setText(quotes[14]);

                }


                if (day_correct == 16) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);

                    april_16.setVisibility(View.VISIBLE);

                    april_16.setTextColor(Color.parseColor("#fe5a13"));

                    april_16.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_16.setTextSize(28);

                    text1.setText(quotes[15]);

                }

                if (day_correct == 17) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);

                    april_17.setVisibility(View.VISIBLE);

                    april_17.setTextColor(Color.parseColor("#fe5a13"));

                    april_17.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_17.setTextSize(28);

                    text1.setText(quotes[16]);

                }

                if (day_correct == 18) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);

                    april_18.setVisibility(View.VISIBLE);

                    april_18.setTextColor(Color.parseColor("#fe5a13"));

                    april_18.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_18.setTextSize(28);

                    text1.setText(quotes[17]);

                }

                if (day_correct == 19) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);

                    april_19.setVisibility(View.VISIBLE);

                    april_19.setTextColor(Color.parseColor("#fe5a13"));

                    april_19.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_19.setTextSize(28);

                    text1.setText(quotes[18]);

                }

                if (day_correct == 20) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);

                    april_20.setVisibility(View.VISIBLE);

                    april_20.setTextColor(Color.parseColor("#fe5a13"));

                    april_20.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_20.setTextSize(28);

                    text1.setText(quotes[19]);

                }

                if (day_correct == 21) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);

                    april_21.setVisibility(View.VISIBLE);

                    april_21.setTextColor(Color.parseColor("#fe5a13"));

                    april_21.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_21.setTextSize(28);

                    text1.setText(quotes[20]);

                }

                if (day_correct == 22) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);

                    april_22.setVisibility(View.VISIBLE);

                    april_22.setTextColor(Color.parseColor("#fe5a13"));

                    april_22.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_22.setTextSize(28);

                    text1.setText(quotes[21]);

                }


                if (day_correct == 23) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);

                    april_23.setVisibility(View.VISIBLE);

                    april_23.setTextColor(Color.parseColor("#fe5a13"));

                    april_23.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_23.setTextSize(28);

                    text1.setText(quotes[22]);

                }

                if (day_correct == 24) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);

                    april_24.setVisibility(View.VISIBLE);

                    april_24.setTextColor(Color.parseColor("#fe5a13"));

                    april_24.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_24.setTextSize(28);

                    text1.setText(quotes[23]);

                }

                if (day_correct == 25) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);
                    april_24.setVisibility(View.VISIBLE);

                    april_25.setVisibility(View.VISIBLE);

                    april_25.setTextColor(Color.parseColor("#fe5a13"));

                    april_25.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_25.setTextSize(28);

                    text1.setText(quotes[24]);

                }

                if (day_correct == 26) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);
                    april_24.setVisibility(View.VISIBLE);
                    april_25.setVisibility(View.VISIBLE);

                    april_26.setVisibility(View.VISIBLE);

                    april_26.setTextColor(Color.parseColor("#fe5a13"));

                    april_26.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_26.setTextSize(28);

                    text1.setText(quotes[25]);

                }

                if (day_correct == 27) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);
                    april_24.setVisibility(View.VISIBLE);
                    april_25.setVisibility(View.VISIBLE);
                    april_26.setVisibility(View.VISIBLE);

                    april_27.setVisibility(View.VISIBLE);

                    april_27.setTextColor(Color.parseColor("#fe5a13"));

                    april_27.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_27.setTextSize(28);

                    text1.setText(quotes[26]);

                }

                if (day_correct == 28) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);
                    april_24.setVisibility(View.VISIBLE);
                    april_25.setVisibility(View.VISIBLE);
                    april_26.setVisibility(View.VISIBLE);
                    april_27.setVisibility(View.VISIBLE);

                    april_28.setVisibility(View.VISIBLE);

                    april_28.setTextColor(Color.parseColor("#fe5a13"));

                    april_28.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_28.setTextSize(28);

                    text1.setText(quotes[27]);

                }

                if (day_correct == 29) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);
                    april_24.setVisibility(View.VISIBLE);
                    april_25.setVisibility(View.VISIBLE);
                    april_26.setVisibility(View.VISIBLE);
                    april_27.setVisibility(View.VISIBLE);
                    april_28.setVisibility(View.VISIBLE);

                    april_29.setVisibility(View.VISIBLE);

                    april_29.setTextColor(Color.parseColor("#fe5a13"));

                    april_29.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_29.setTextSize(28);

                    text1.setText(quotes[28]);

                }

                if (day_correct == 30) {

                    april_12.setVisibility(View.VISIBLE);
                    april_13.setVisibility(View.VISIBLE);
                    april_14.setVisibility(View.VISIBLE);
                    april_15.setVisibility(View.VISIBLE);
                    april_16.setVisibility(View.VISIBLE);
                    april_17.setVisibility(View.VISIBLE);
                    april_18.setVisibility(View.VISIBLE);
                    april_19.setVisibility(View.VISIBLE);
                    april_20.setVisibility(View.VISIBLE);
                    april_21.setVisibility(View.VISIBLE);
                    april_22.setVisibility(View.VISIBLE);
                    april_23.setVisibility(View.VISIBLE);
                    april_24.setVisibility(View.VISIBLE);
                    april_25.setVisibility(View.VISIBLE);
                    april_26.setVisibility(View.VISIBLE);
                    april_27.setVisibility(View.VISIBLE);
                    april_28.setVisibility(View.VISIBLE);
                    april_29.setVisibility(View.VISIBLE);

                    april_30.setVisibility(View.VISIBLE);

                    april_30.setTextColor(Color.parseColor("#fe5a13"));

                    april_30.setBackgroundColor(Color.parseColor("#39ff14"));

                    april_30.setTextSize(28);

                    text1.setText(quotes[29]);

                }

                    april_12.setOnClickListener(new View.OnClickListener() {

                        public void onClick(View v) {

                            april_12.setTextColor(Color.parseColor("#fe5a13"));
                            april_13.setTextColor(Color.parseColor("#b30afb"));
                            april_14.setTextColor(Color.parseColor("#b30afb"));
                            april_15.setTextColor(Color.parseColor("#b30afb"));
                            april_16.setTextColor(Color.parseColor("#b30afb"));
                            april_17.setTextColor(Color.parseColor("#b30afb"));
                            april_18.setTextColor(Color.parseColor("#b30afb"));
                            april_19.setTextColor(Color.parseColor("#b30afb"));
                            april_20.setTextColor(Color.parseColor("#b30afb"));
                            april_21.setTextColor(Color.parseColor("#b30afb"));
                            april_22.setTextColor(Color.parseColor("#b30afb"));
                            april_23.setTextColor(Color.parseColor("#b30afb"));
                            april_24.setTextColor(Color.parseColor("#b30afb"));
                            april_25.setTextColor(Color.parseColor("#b30afb"));
                            april_26.setTextColor(Color.parseColor("#b30afb"));
                            april_27.setTextColor(Color.parseColor("#b30afb"));
                            april_28.setTextColor(Color.parseColor("#b30afb"));
                            april_29.setTextColor(Color.parseColor("#b30afb"));
                            april_30.setTextColor(Color.parseColor("#b30afb"));

                            text1.setText(quotes[11]);

                        }
                    });


                    april_13.setOnClickListener(new View.OnClickListener() {

                        public void onClick(View v) {

                            april_12.setTextColor(Color.parseColor("#b30afb"));
                            april_13.setTextColor(Color.parseColor("#fe5a13"));
                            april_14.setTextColor(Color.parseColor("#b30afb"));
                            april_15.setTextColor(Color.parseColor("#b30afb"));
                            april_16.setTextColor(Color.parseColor("#b30afb"));
                            april_17.setTextColor(Color.parseColor("#b30afb"));
                            april_18.setTextColor(Color.parseColor("#b30afb"));
                            april_19.setTextColor(Color.parseColor("#b30afb"));
                            april_20.setTextColor(Color.parseColor("#b30afb"));
                            april_21.setTextColor(Color.parseColor("#b30afb"));
                            april_22.setTextColor(Color.parseColor("#b30afb"));
                            april_23.setTextColor(Color.parseColor("#b30afb"));
                            april_24.setTextColor(Color.parseColor("#b30afb"));
                            april_25.setTextColor(Color.parseColor("#b30afb"));
                            april_26.setTextColor(Color.parseColor("#b30afb"));
                            april_27.setTextColor(Color.parseColor("#b30afb"));
                            april_28.setTextColor(Color.parseColor("#b30afb"));
                            april_29.setTextColor(Color.parseColor("#b30afb"));
                            april_30.setTextColor(Color.parseColor("#b30afb"));

                            text1.setText(quotes[12]);

                        }
                    });


                    april_14.setOnClickListener(new View.OnClickListener() {

                        public void onClick(View v) {

                            april_12.setTextColor(Color.parseColor("#b30afb"));
                            april_13.setTextColor(Color.parseColor("#b30afb"));
                            april_14.setTextColor(Color.parseColor("#fe5a13"));
                            april_15.setTextColor(Color.parseColor("#b30afb"));
                            april_16.setTextColor(Color.parseColor("#b30afb"));
                            april_17.setTextColor(Color.parseColor("#b30afb"));
                            april_18.setTextColor(Color.parseColor("#b30afb"));
                            april_19.setTextColor(Color.parseColor("#b30afb"));
                            april_20.setTextColor(Color.parseColor("#b30afb"));
                            april_21.setTextColor(Color.parseColor("#b30afb"));
                            april_22.setTextColor(Color.parseColor("#b30afb"));
                            april_23.setTextColor(Color.parseColor("#b30afb"));
                            april_24.setTextColor(Color.parseColor("#b30afb"));
                            april_25.setTextColor(Color.parseColor("#b30afb"));
                            april_26.setTextColor(Color.parseColor("#b30afb"));
                            april_27.setTextColor(Color.parseColor("#b30afb"));
                            april_28.setTextColor(Color.parseColor("#b30afb"));
                            april_29.setTextColor(Color.parseColor("#b30afb"));
                            april_30.setTextColor(Color.parseColor("#b30afb"));

                            text1.setText(quotes[13]);

                        }
                    });

                april_15.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#fe5a13"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[14]);

                    }
                });

                april_16.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#fe5a13"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[15]);

                    }
                });

                april_17.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#fe5a13"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[16]);

                    }
                });

                april_18.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#fe5a13"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[17]);

                    }
                });

                april_19.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#fe5a13"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[18]);

                    }
                });

                april_20.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#fe5a13"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[19]);

                    }
                });

                april_21.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#fe5a13"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[20]);

                    }
                });

                april_22.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#fe5a13"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[21]);

                    }
                });

                april_23.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#fe5a13"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[22]);

                    }
                });

                april_24.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#fe5a13"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[23]);

                    }
                });

                april_25.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#fe5a13"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[24]);

                    }
                });

                april_26.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#fe5a13"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[25]);

                    }
                });

                april_27.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#fe5a13"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[26]);

                    }
                });

                april_28.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#fe5a13"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[27]);

                    }
                });

                april_29.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#fe5a13"));
                        april_30.setTextColor(Color.parseColor("#b30afb"));

                        text1.setText(quotes[28]);

                    }
                });

                april_30.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        april_12.setTextColor(Color.parseColor("#b30afb"));
                        april_13.setTextColor(Color.parseColor("#b30afb"));
                        april_14.setTextColor(Color.parseColor("#b30afb"));
                        april_15.setTextColor(Color.parseColor("#b30afb"));
                        april_16.setTextColor(Color.parseColor("#b30afb"));
                        april_17.setTextColor(Color.parseColor("#b30afb"));
                        april_18.setTextColor(Color.parseColor("#b30afb"));
                        april_19.setTextColor(Color.parseColor("#b30afb"));
                        april_20.setTextColor(Color.parseColor("#b30afb"));
                        april_21.setTextColor(Color.parseColor("#b30afb"));
                        april_22.setTextColor(Color.parseColor("#b30afb"));
                        april_23.setTextColor(Color.parseColor("#b30afb"));
                        april_24.setTextColor(Color.parseColor("#b30afb"));
                        april_25.setTextColor(Color.parseColor("#b30afb"));
                        april_26.setTextColor(Color.parseColor("#b30afb"));
                        april_27.setTextColor(Color.parseColor("#b30afb"));
                        april_28.setTextColor(Color.parseColor("#b30afb"));
                        april_29.setTextColor(Color.parseColor("#b30afb"));
                        april_30.setTextColor(Color.parseColor("#fe5a13"));

                        text1.setText(quotes[29]);

                    }
                });


            }
    }
}
