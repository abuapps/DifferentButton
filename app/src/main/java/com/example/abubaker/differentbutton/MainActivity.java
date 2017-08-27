package com.example.abubaker.differentbutton;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view)
    {
        Intent intent = null;
        if(view.getId() == R.id.buttonMap)
        {
            intent = new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076.72.8777"));
            startActivity(intent);
        }

        if(view.getId() == R.id.buttonMarket)
        {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store?hl=en"));
            startActivity(intent);
        }

        if(view.getId() == R.id.buttonSend)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"abu@gmail.com" , "baker@yahol.com"};
            intent.putExtra(Intent.EXTRA_EMAIL , to);
            intent.putExtra(Intent.EXTRA_SUBJECT , "this is the subject");
            intent.putExtra(Intent.EXTRA_TEXT , "what is up bro this is the text....");
            intent.setType("message/rfc822");
            startActivity(intent);
        }




    }
}
