package com.bjh.www.a1026_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editID = (EditText)findViewById(R.id.editID);
        EditText editPW = (EditText)findViewById(R.id.editPW);
        EditText editPW_num = (EditText)findViewById(R.id.editPW_num);
        EditText edit_Email = (EditText)findViewById(R.id.edit_Email);

        editID.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if( (event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(v.getContext(), ((EditText)v).getText().toString(), Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}
