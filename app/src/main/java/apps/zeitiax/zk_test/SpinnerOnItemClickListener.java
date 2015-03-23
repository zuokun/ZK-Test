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
            Toast.makeText(TestApp.getContext(), parent.getItemAtPosition(position).toString() + "/nCount: " + parent.getAdapter().getCount() + "/nPosition: " + position, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(TestApp.getContext(), parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
        }

    }
}
