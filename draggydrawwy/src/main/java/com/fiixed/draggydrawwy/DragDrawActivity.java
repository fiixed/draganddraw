package com.fiixed.draggydrawwy;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class DragDrawActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new DragDrawFragment();
    }
}
