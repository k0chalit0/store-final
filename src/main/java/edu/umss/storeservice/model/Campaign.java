/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.CampaignDto;

import javax.persistence.Entity;

@Entity
public class Campaign extends ModelBase<CampaignDto> {
    String name;
    String details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}