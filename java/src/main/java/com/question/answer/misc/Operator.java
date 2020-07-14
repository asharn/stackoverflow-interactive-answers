package com.question.answer.misc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Operator {

    private int a, b;

    public Operator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public float calculate(){
        // here I want to return the result depending on the operator. If Plus extends Operator then the returned value is this.a + this.b
        if(this instanceof Plus ){
            return a + (float)b;
        }else if(this instanceof Subtract ){
            return a - (float)b;
        }
        return 0.0f;
    }

    public void print() throws ParseException {
        System.out.println(String.format("This is the result :  %f", this.calculate()));

        /*public void startAlert() throws ParseException {

            TextView text = (TextView) findViewById(R.id.time1);
            //int i = Integer.parseInt(text.getText().toString());
            Date alarmSetDate = new SimpleDateFormat("HH:mm").parse(text.getText().toString());
            long i = TimeUnit.MINUTES.convert(Math.abs(alarmSetDate.getTime() - new Date().getTime()), TimeUnit.MILLISECONDS);

            Intent intent = new Intent(this, MyBroadcastReceiver.class);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(
                    this.getApplicationContext(), 234324243, intent, 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() +
                    (i * 1000), pendingIntent);
            Toast.makeText(this, "Alarm set in " + i + " seconds", Toast.LENGTH_LONG).show();
        }*/
    }
}
