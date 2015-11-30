package normal.wayhome.com.wayhome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_test)
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "7769827f0f2d433286bf3bc97514d53e");
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_test)
    void click(){
        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}
