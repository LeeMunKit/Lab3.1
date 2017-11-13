package my.edu.tarc.lab31;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int COMPLEX_UNIT_SP =20;
    private TextView textViewMessage;
    public float size=14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking UI to program
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        size = textViewMessage.getTextSize();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if (id == R.id.increase_action){
            //TODO: increase front size of pf textViewMessage
            size++;
            textViewMessage.setTextSize(COMPLEX_UNIT_SP,size);
        }else if(id == R.id.decrease_action){
            //TODO: decrease front size of pf textViewMessage
            size--;
            textViewMessage.setTextSize(COMPLEX_UNIT_SP,size);
        }else if(id == R.id.action_about){
            Intent intent = new Intent(this, Sub.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
