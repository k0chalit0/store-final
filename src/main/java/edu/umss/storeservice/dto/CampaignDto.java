/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Campaign;

public class CampaignDto extends DtoBase<Campaign> {
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
