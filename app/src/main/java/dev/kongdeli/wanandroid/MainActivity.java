package dev.kongdeli.wanandroid;

import android.app.TimePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements TimePickerDialog.OnTimeSetListener {

    @BindView(R.id.bt_show_time_picker)
    Button mBtShow;

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.bt_show_time_picker})
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_show_time_picker:
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                TimePickerDialog dialog = new TimePickerDialog(this, this, hour, minute, true);
                dialog.show();
                break;
        }
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

    }
}