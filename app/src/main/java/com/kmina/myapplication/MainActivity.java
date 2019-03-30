package com.kmina.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll_1, ll_2, ll_4, ll_3, ll_5, ll_6, ll_7, ll_8, ll_9;
    TextView tv_1,tv_2,tv_3,tv_4,tv_5,tv_6,tv_7,tv_8,tv_9;
    int prod1, prod2, prod3, prod4 ,prod5, prod6, prod7, prod8, prod9;
    EditText mEdit_user, mEdit_email;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_1=findViewById(R.id.ll_prod1);
        ll_2=findViewById(R.id.ll_prod2);
        ll_3=findViewById(R.id.ll_prod3);
        ll_4=findViewById(R.id.ll_prod4);
        ll_5=findViewById(R.id.ll_prod5);
        ll_6=findViewById(R.id.ll_prod6);
        ll_7=findViewById(R.id.ll_prod7);
        ll_8=findViewById(R.id.ll_prod8);
        ll_9=findViewById(R.id.ll_prod9);


        tv_1=findViewById(R.id.tv_prod1);
        tv_2=findViewById(R.id.tv_prod2);
        tv_3=findViewById(R.id.tv_prod3);
        tv_4=findViewById(R.id.tv_prod4);
        tv_5=findViewById(R.id.tv_prod5);
        tv_6=findViewById(R.id.tv_prod6);
        tv_7=findViewById(R.id.tv_prod7);
        tv_8=findViewById(R.id.tv_prod8);
        tv_9=findViewById(R.id.tv_prod9);

        mEdit_user=findViewById(R.id.et_usuario);
        mEdit_email=findViewById(R.id.et_correo);

        bt=findViewById(R.id.bt_send);

        ll_1.setOnClickListener(v -> {
            prod1++;
            tv_1.setText(prod1+"");

        });

        ll_2.setOnClickListener(v -> {
            prod2++;
            tv_2.setText(prod2+"");

        });

        ll_3.setOnClickListener(v -> {
            prod3++;
            tv_3.setText(prod3+"");

        });

        ll_4.setOnClickListener(v -> {
            prod4++;
            tv_4.setText(prod4+"");

        });

        ll_5.setOnClickListener(v -> {
            prod5++;
            tv_5.setText(prod5+"");

        });

        ll_1.setOnClickListener(v -> {
            prod1++;
            tv_1.setText(prod1+"");

        });

        ll_6.setOnClickListener(v -> {
            prod6++;
            tv_6.setText(prod6+"");

        });

        ll_7.setOnClickListener(v -> {
            prod7++;
            tv_7.setText(prod7+"");

        });

        ll_8.setOnClickListener(v -> {
            prod8++;
            tv_8.setText(prod8+"");

        });

        ll_9.setOnClickListener(v -> {
            prod9++;
            tv_9.setText(prod9+"");

        });


        Producto producto = new Producto(); //Creamos un nuevo objeto Usuario y le asignamos las propiedades nombre y edad

        Gson gson = new Gson();//Creamos un objeto Gson


        bt.setOnClickListener(v -> {
            producto.setProducto1(prod1+"");
            producto.setProducto2(prod2+"");
            producto.setProducto3(prod3+"");
            producto.setProducto4(prod4+"");
            producto.setProducto5(prod5+"");
            producto.setProducto6(prod6+"");
            producto.setProducto7(prod7+"");
            producto.setProducto8(prod8+"");
            producto.setProducto9(prod9+"");
            producto.setUsuario(mEdit_user.getText().toString());
            producto.setEmail(mEdit_email.getText().toString());
            //usuario.setmUser(mEditText1.getText().toString());

            Log.d("qwerty","rrrrr: "+producto.getUsuario());



            //Convertimos el objeto usuario a json
            String json = gson.toJson(producto);
             Log.d("qwerty",json);

            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra("json",json);
            startActivity(mIntent);
        });

    }
}
