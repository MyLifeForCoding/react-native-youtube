package com.inprogress.reactnativeyoutube;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.youtube.player.YouTubePlayerFragment;

/**
 * Created by johnlee on 2016/11/29.
 */

public class CustomYouTubePlayerFragment extends YouTubePlayerFragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {

        removeOldOne();

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        removeOldOne();
    }

    private void removeOldOne() {
        Fragment f = getFragmentManager()
                .findFragmentById(getId());
        if (f != null) {
            getFragmentManager().beginTransaction().remove(f).commit();
        }
    }
}
