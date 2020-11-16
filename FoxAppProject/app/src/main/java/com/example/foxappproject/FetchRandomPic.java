package com.example.foxappproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

class FetchRandomPic extends AsyncTask<String, Void, Bitmap> {
    ImageView fPic;
    public FetchRandomPic(ImageView imageView) {
        this.fPic = imageView;
    }

    @Override
    protected Bitmap doInBackground(String... urls) {
        String url = urls[0];
        Bitmap bmap = null;
        try {
            InputStream in = new java.net.URL(url).openStream();
            bmap = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return bmap;
    }

    protected void onPostExecute(Bitmap result) {
        fPic.setImageBitmap(result);
    }
}