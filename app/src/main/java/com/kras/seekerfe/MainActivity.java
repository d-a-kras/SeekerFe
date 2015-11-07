package com.kras.seekerfe;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.maps.*;

public class MainActivity extends AppCompatActivity {
    //GoogleMap googleMap;
    mainFragment frag1;
    //Fragment2 frag2;
    FragmentTransaction fTrans;

    private void createMapView() {
        /**
         * Catch the null pointer exception that
         * may be thrown when initialising the map
         */
        try {

           // if (null == googleMap) {
            //   googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                   //    R.id.mapView)).getMap();

                /**
                 * If the map is still null after attempted initialisation,
                 * show an error to the user
                 */
             //   if (null == googleMap) {
                    Toast.makeText(getApplicationContext(),
                            "Error creating map", Toast.LENGTH_SHORT).show();
            //    }
        //    }
        } catch (NullPointerException exception) {
            Log.e("mapApp", exception.toString());
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag1=new mainFragment();
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
    public void C(View v){
        fTrans = getFragmentManager().beginTransaction();
        fTrans.replace(R.id.frgmCont, frag1);
        fTrans.addToBackStack(null);
        fTrans.commit();
        Toast.makeText(this,"edf",Toast.LENGTH_SHORT).show();
    }
}
