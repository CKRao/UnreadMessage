package com.example.clark.unreadmessage;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private BottomBarView mBarView;
    private Button send,check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBarView = (BottomBarView) findViewById(R.id.id_bar);
        send = (Button) findViewById(R.id.id_sendMessage);
        check = (Button) findViewById(R.id.id_checkMessage);
        send.setOnClickListener(this);
        check.setOnClickListener(this);
        mBarView.setImag(R.mipmap.text_message);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_sendMessage:
                mBarView.addMsg();
                break;
            case R.id.id_checkMessage:
                mBarView.setMessageCount(0);
                break;
        }
    }
}
