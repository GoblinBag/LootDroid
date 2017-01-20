package com.goblinbag.lootdroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.goblinbag.beans.PlayerCharacter;
import com.goblinbag.controllers.CampaignController;
import com.goblinbag.controllers.PlayerCharacterController;

public class CampaignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewPlayer(View view) throws Exception {
        EditText textName = (EditText)findViewById(R.id.editText);
        String characterName = textName.getText().toString();
        EditText textName2 = (EditText)findViewById(R.id.editText2);
        String playnerName = textName.getText().toString();

        PlayerCharacterController cc = new PlayerCharacterController();
        cc.createPlayerCharacter(characterName, playnerName);
    }

    public void createNewSession(View view) {

    }

}
