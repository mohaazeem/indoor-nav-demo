package demo.indoornavigationdemo.model;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import demo.indoornavigationdemo.R;

public class MainActivity extends AppCompatActivity {

    private boolean ADD_DESTINATION_NODES_MODE;
    private boolean ADD_TRANSITION_NODES_MODE;
    private boolean CONNECT_EDGES_MODE;
    private boolean RUN_MODE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * TODO:
         * The layout hasn't been implemented yet. For the sake of the demo, it will only consist
         * of a background image, and a menu on top with some options
         */
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

        if (id == R.id.action_add_destination_nodes) {
            ADD_DESTINATION_NODES_MODE = true;
            return true;
        }

        else if (id == R.id.action_add_transition_nodes) {
            ADD_TRANSITION_NODES_MODE = true;
            return true;
        }

        else if (id == R.id.action_connect_edges) {
            CONNECT_EDGES_MODE = true;
            return true;
        }

        else if (id == R.id.action_run) {
            RUN_MODE = true;
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * TODO:
     * This will be called from onTouchEvent if its corresponding boolean is set to true
     *
     * 1. Create new DestinationNode
     * 2. Send it to server
     * 3. Draw it on canvas [circle]
     * 4. Call addNode() on graph instance
     */
    public void addDestinationNodesMode() {

    }

    /**
     * TODO:
     * This will be called from onTouchEvent if its corresponding boolean is set to true
     *
     * 1. Create new TransitionNode
     * 2. Send it to server
     * 3. Draw it on canvas [circle]
     * 4. Call addNode() on graph instance
     */
    public void addTransitionNodesMode() {

    }

    /**
     * TODO:
     * This will be called from onTouchEvent if its corresponding boolean is set to true
     *
     * 1. On 2 correct touches, create new Edge
     *  a. Send it to server
     *  b. Draw it on canvas [line segment]
     * 2. On false touches, do nothing
     * 3. On 1 correct touch, wait for 2nd touch. If correct, go to 1. Else, reset state
     */
    public void connectEdgesMode() {

    }

    /**
     * TODO:
     * This will be called from onTouchEvent if its corresponding boolean is set to true
     *
     * 1. Highlight dummy source and destination (on Android and the send it, or on Rails side)
     * 2. Apply A* (this will be done on Rails side)
     * 3. Receive path from A* (after sending it from Rails side)
     * 4. Update view on canvas with the highlighted path
     */
    public void run() {

    }

    /**
     * TODO: JSON SerDe
     */
    public void toJSON() { // parameters and return type will be changed later

    }

    public void fromJSON() { // parameters and return type will be changed later

    }
}
