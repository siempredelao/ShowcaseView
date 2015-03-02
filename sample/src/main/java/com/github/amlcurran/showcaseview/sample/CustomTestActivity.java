package com.github.amlcurran.showcaseview.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

public class CustomTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_test);

        final TextView stupidButton = (TextView) findViewById(R.id.stupid_textview);
        stupidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomTestActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });

        new ShowcaseView.Builder(this, true)
                .setTarget(new ViewTarget(stupidButton))
                .setContentTitle("Titulo")
                .setContentText("Contenido")
                .setStyle(R.style.CustomShowcaseTheme2)
                .withInnerCircleRadius(100f)
                .withOuterCircleRadius(300f)
                .setButtonText("Go for it!")
                .buildAfterDelay(1000);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_test, menu);
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
        }

        return super.onOptionsItemSelected(item);
    }
}
