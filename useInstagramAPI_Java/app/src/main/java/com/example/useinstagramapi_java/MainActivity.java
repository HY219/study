package com.example.useinstagramapi_java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main의 버튼을 가져오기
        Button shareButton = findViewById(R.id.shareButton);

        // 클릭 리스너 구현
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ACTION_SEND를 이용해 공유하기 창 띄우기
                Intent intent = new Intent(Intent.ACTION_SEND);
                //intent로 보낼 공유 내용의 타입을 정하기
                intent.setType("text/plain");
                intent.setType("image/gif");
                intent.setType("image/jpeg");

                //String으로 받아서 넣기
                String sendMessage = "이렇게 스트링으로 만들어서 넣어주면 됩니다.";
                //String sendImage = "ic_launcher.webp";
                intent.putExtra(Intent.EXTRA_TEXT, sendMessage);
                //intent.putExtra(Intent.image)

                Intent shareIntent = Intent.createChooser(intent, "share");
                startActivity(shareIntent);
            }
        });
    }
}