package it.jaschke.alexandria;

import android.content.Intent;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

/**
 * Created by Rafael on 09/09/2015.
 */
public class CaptureActivityAnyOrientation extends com.journeyapps.barcodescanner.CaptureActivity {

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        /*AddBook.updateData(result);
        if (result != null) {
            if (result.getContents() == null) {
                toast = "Cancelled from fragment";
            } else {
                toast = "Scanned from fragment: " + result.getContents();
                ean.setText(result.getContents() + "");
                getBookData(result.getContents());
            }

            showToast();
        }*/
    }
}
