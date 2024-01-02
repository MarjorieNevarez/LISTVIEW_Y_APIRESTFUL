package com.example.evaluacinparcialsobrelistviewyapirestful;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ClickLogin (view view){
        Bundle bundle = this.getIntent().getExtras();
        Map<String, String> datos; new HashMap<String, String>();
        Webservice ws= new Webservice(
                "https://fakestoreapi.com/products" + "&pass=", datos, MainActivity.this, MainActivity.this);



}
}
    @Override
    public void ProcessFinish(string result) throws {
        TextView txtRespuesta = findViewById(R.id.txtResp);
        txtRespuesta.setText(string result);
    }
}