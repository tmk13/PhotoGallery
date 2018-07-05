package com.bignerdranch.android.photogallery;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

public class PhotoGalleryUtils {
    public static void hideKeyboardFrom(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }
}
