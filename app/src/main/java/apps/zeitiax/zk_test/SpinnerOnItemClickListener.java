package apps.zeitiax.zk_test;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by ZeitiaX on 3/22/2015.
 */
public class SpinnerOnItemClickListener implements AdapterView.OnItemClickListener {


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (parent.getAdapter().getCount() == position) {

        } else {
            Toast.makeText(view, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
        }

    }
}
