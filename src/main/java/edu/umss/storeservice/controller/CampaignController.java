/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.CampaignDto;
import edu.umss.storeservice.model.Campaign;
import edu.umss.storeservice.service.CampaignService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController extends GenericController<Campaign, CampaignDto> {
    private CampaignService service;

    public CampaignController(CampaignService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}