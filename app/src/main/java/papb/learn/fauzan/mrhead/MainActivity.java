package papb.learn.fauzan.mrhead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv_hair,iv_moustache,iv_eyebrow,iv_beard;
    CheckBox cb_hair,cb_moustache,cb_eyebrow,cb_beard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_hair=findViewById(R.id.iv_hair);
        iv_moustache=findViewById(R.id.iv_moustache);
        iv_eyebrow=findViewById(R.id.iv_eyebrow);
        iv_beard=findViewById(R.id.iv_beard);

        cb_hair = findViewById(R.id.cb_hair);
        cb_beard = findViewById(R.id.cb_beard);
        cb_eyebrow = findViewById(R.id.cb_eyebrow);
        cb_moustache = findViewById(R.id.cb_moustache);

        cb_hair.setOnClickListener(this);
        cb_beard.setOnClickListener(this);
        cb_moustache.setOnClickListener(this);
        cb_eyebrow.setOnClickListener(this); 
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cb_beard :
                iv_beard.setVisibility(iv_beard.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);

                break;
            case R.id.cb_moustache :
                iv_moustache.setVisibility(iv_moustache.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);

                break;
            case R.id.cb_eyebrow :
                iv_eyebrow.setVisibility(iv_eyebrow.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);

                break;
            case R.id.cb_hair :
                iv_hair.setVisibility(iv_hair.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);

                break;
        }
    }
}
