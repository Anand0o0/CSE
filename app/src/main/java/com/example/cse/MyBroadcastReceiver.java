package com.example.cse;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.cse.ACTION_FOO".equals(intent.getAction())) {
            final String buttonClicked = intent.getStringExtra("EXTRA_BUTTON_CLICKED");
            handleActionFoo(context, buttonClicked);

        }
    }

    private void handleActionFoo(Context context, String buttonClicked) {
        // Simulate loading data based on the button clicked
        String loadedData = null;
        if (upgradeyou.Con.b1.equals(buttonClicked)) {
            loadedData = constants.Cdsa;
        } else if (upgradeyou.Con.b2.equals(buttonClicked)) {
            loadedData = constants.roadmaps;
        } else if (upgradeyou.Con.b3.equals(buttonClicked)) {
            loadedData = constants.materials;
        } else if (upgradeyou.Con.b4.equals(buttonClicked)) {
            loadedData = constants.certif;
        } else if (upgradeyou.Con.b5.equals(buttonClicked)) {
            loadedData = constants.inter;
        } else if (upgradeyou.Con.b6.equals(buttonClicked)) {
            loadedData = constants.intern;
        } else if (upgradeyou.Con.b7.equals(buttonClicked)) {
            loadedData = constants.should;
        } else if (upgradeyou.Con.b8.equals(buttonClicked)) {
            loadedData = constants.tre;
        }

        // Broadcast the loaded data
        Intent broadcastIntent = new Intent("com.example.cse.DATA_LOADED");
        broadcastIntent.putExtra("loadedData", loadedData);
        context.sendBroadcast(broadcastIntent);
    }
}

