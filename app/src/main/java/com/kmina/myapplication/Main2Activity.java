package com.kmina.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

public class Main2Activity extends AppCompatActivity {
    TextView tv_user,tv_email,tv_1,tv_2,tv_3,tv_4,tv_5,tv_6,tv_7,tv_8,tv_9;
    //String user, pass, email, gender, string_share;
    Button mButton_Share;
    String json="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_1=findViewById(R.id.tv_prod1);
        tv_2=findViewById(R.id.tv_prod2);
        tv_3=findViewById(R.id.tv_prod3);
        tv_4=findViewById(R.id.tv_prod4);
        tv_5=findViewById(R.id.tv_prod5);
        tv_6=findViewById(R.id.tv_prod6);
        tv_7=findViewById(R.id.tv_prod7);
        tv_8=findViewById(R.id.tv_prod8);
        tv_9=findViewById(R.id.tv_prod9);

        tv_user=findViewById(R.id.et_usuario);
        tv_email=findViewById(R.id.et_correo);

        mButton_Share = findViewById(R.id.bt_send);


        Intent mIntent = this.getIntent();


        Gson gson = new Gson();  //Creamos un objeto Gson

        if(mIntent != null){
            //Recuperamos la cadena json
            json = mIntent.getStringExtra("json");

            //Creamos un nuevo Usuario a partir de json
            Producto producto = gson.fromJson(json, Producto.class);
            tv_1.setText(producto.getProducto1());
            tv_2.setText(producto.getProducto2());
            tv_3.setText(producto.getProducto3());
            tv_4.setText(producto.getProducto4());
            tv_5.setText(producto.getProducto5());
            tv_6.setText(producto.getProducto6());
            tv_7.setText(producto.getProducto7());
            tv_8.setText(producto.getProducto8());
            tv_9.setText(producto.getProducto9());
            tv_1.setText(producto.getProducto1());
            tv_1.setText(producto.getProducto1());

            tv_user.setText(producto.getUsuario());
            tv_email.setText(producto.getEmail());

        }

        final String mJson_share = json;

        mButton_Share.setOnClickListener(v -> {
            Intent mIntent_Share = new Intent();

            mIntent_Share.setAction(Intent.ACTION_SEND);
            mIntent_Share.setType("text/plain");

            mIntent_Share.putExtra(Intent.EXTRA_TEXT,mJson_share);

            if (mIntent_Share.resolveActivity(getPackageManager()) != null) {
                startActivity(mIntent_Share);
            }


        });
    }

    @Override
    protected void onResume(){
        super.onResume();





    }
}

/*tipos de mime type
 * recibir texto con intent*/
