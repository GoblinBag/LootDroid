package com.goblinbag.lootdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.goblinbag.Exceptions.SameNameException;
import com.goblinbag.controllers.CampaignController;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void createCampaign(View view) {
        EditText textName = (EditText)findViewById(R.id.editText);
        String campaignName = textName.getText().toString();

        // save campaign
        CampaignController cc = new CampaignController();
        try {
            cc.createCampaign(campaignName);
        }
        catch(SameNameException ex)
        {
            Toast.makeText(this, getString(R.string.errSameNameCampaign), Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex)
        {
            Toast.makeText(this, getString(R.string.errCampaign), Toast.LENGTH_SHORT).show();
        }

        // add campaign in list

        // go to campaign
    }
}
