package com.goblinbag.controllers;

import com.goblinbag.Exceptions.SameNameException;
import com.goblinbag.beans.Campaign;

import java.util.Date;

public class CampaignController {

    public Campaign createCampaign(String name) throws Exception {

        Campaign campaign = createCampaignBean(name);

        try {
            saveCampaign(campaign);
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return campaign;
    }

    private Campaign createCampaignBean(String name) {

        Campaign campaign = new Campaign();
        campaign.setTitle(name);
        campaign.setCreated(new Date(System.currentTimeMillis()));

        return campaign;
    }

    private void saveCampaign(Campaign campaign) {
    }
}
