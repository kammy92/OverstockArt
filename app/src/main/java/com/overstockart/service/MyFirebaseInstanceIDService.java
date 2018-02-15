package com.overstockart.service;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.overstockart.utils.AppDetailsPref;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh () {
        super.onTokenRefresh ();
        AppDetailsPref appDetailsPref = AppDetailsPref.getInstance ();
        appDetailsPref.putStringPref (getApplicationContext (), AppDetailsPref.FIREBASE_ID, FirebaseInstanceId.getInstance ().getToken ());
    }
}

