package edu.washington.nadava.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate event fired");
        if (savedInstanceState != null) {
            Log.i(TAG, savedInstanceState.toString());
        }

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart event fired");
    }

    @Override
    protected void onRestart() {
        super.onStart();
        Log.i(TAG, "onRestart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy event fired");
        Log.e(TAG, "We're going down, Captain!");
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
        }

        return super.onOptionsItemSelected(item);
    }
}
