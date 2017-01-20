package com.goblinbag.controllers;

import com.goblinbag.beans.Campaign;
import com.goblinbag.beans.PlayerCharacter;

public class PlayerCharacterController {

    public PlayerCharacter createPlayerCharacter(String characterName, String playerName) throws Exception {

        PlayerCharacter player = createCharacterPlayerBean(characterName, playerName);

        try {
            savePlayerCharacter(player);
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return player;
    }

    private void savePlayerCharacter(PlayerCharacter player) {
    }

    private PlayerCharacter createCharacterPlayerBean(String characterName, String playerName) {
    }
}
