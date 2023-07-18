package jp.suntech.s22021.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btConfirm=findViewById(R.id.btConfirm);

        //リスナオブジェクトの用意
        HellowListener listener=new HellowListener();
        btConfirm.setOnClickListener(listener);

        //homeクリアボタンであるButtonobjectを取得
        Button btHome=findViewById(R.id.btHome);
        //クリアボタンにリスナを追加
        btHome.setOnClickListener(listener);

        //nameクリアボタン2であるButtonobjectを取得
        Button btName=findViewById(R.id.btName);
        //クリアボタン2にリスナを追加
        btName.setOnClickListener(listener);
    }

    private class HellowListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText input =findViewById(R.id.editTextTextPostalAddress);//住所
            EditText  input2 =findViewById(R.id.editTextText);//名前

            TextView output=findViewById(R.id.tvOutput);
            TextView output2=findViewById(R.id.editTextText);

            int id= v.getId();


            if (id==R.id.btConfirm){

                String inputStr=input.getText().toString();

                String inputStr2=input2.getText().toString();


                String inputText = inputStr+"にお住いの"+inputStr2+"さん、こんにちは！";
                Snackbar.make(v,inputText, Snackbar.LENGTH_LONG).show();

            }

            else if(id==R.id.btHome){
                input.setText("");

                output.setText("");

            }
            else if(id==R.id.btName){
                input2.setText("");

                output2.setText("");

            }
        }
    }
}