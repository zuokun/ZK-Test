package apps.zeitiax.zk_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by ZeitiaX on 3/22/2015.
 */
public class AddNewRowDialog extends DialogFragment {

    private EditText textbox;

    public AddNewRowDialog() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.new_row_dialog_layout, container);
        textbox = (EditText) view.findViewById(R.id.editText1);
        getDialog().setTitle("Please enter new row's name");

        // return super.onCreateView(inflater, container, savedInstanceState);

        return view;

    }
}
