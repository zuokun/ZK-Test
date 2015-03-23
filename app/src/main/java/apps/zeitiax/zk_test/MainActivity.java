package apps.zeitiax.zk_test;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private Spinner spinner = (Spinner) findViewById(R.id.spinner1);
    private Button button = (Button) findViewById(R.id.button1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> list = new ArrayList<String>();

        list.add("Row 1");
        list.add("Row 2");
        list.add("Add new row..");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        //addListenerOnSpinnerItemSelection();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddNewRowDialog();
            }
        });



    }

    private void addListenerOnSpinnerItemSelection() {

        spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setOnItemClickListener(new SpinnerOnItemClickListener());

    }

    private void showAddNewRowDialog() {

        FragmentManager fm = getSupportFragmentManager();
        AddNewRowDialog dia = new AddNewRowDialog();
        dia.show(fm, "dialog");

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

    public void showDialog() {
        showAddNewRowDialog();
    }
}
