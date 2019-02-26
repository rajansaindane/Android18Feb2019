package demoapp.melayer.com.android18feb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button  btnLogin;
    Bundle bundle;
    EditText edtUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtUserName=findViewById(R.id.edtUserName);
        btnLogin=findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle=new Bundle();
                bundle.putString("callFrom",edtUserName.getText().toString());
                Intent intent=new Intent(MainActivity.this,SecondActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP & Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
