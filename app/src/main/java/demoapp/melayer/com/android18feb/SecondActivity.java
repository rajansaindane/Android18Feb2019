package demoapp.melayer.com.android18feb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    Bundle bundle=null;
    final String TAG_NAME="@SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            //when bundle have some data
                Log.i(TAG_NAME, "bundle data=======>" + bundle.getString("callFrom"));

            }
            else
        {
            //when bundle null
            Log.i(TAG_NAME, "bundle data=======>" +"null");
        }
    }
}
