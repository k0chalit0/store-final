/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Campaign;
import edu.umss.storeservice.repository.CampaignRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CampaignServiceImpl extends GenericServiceImpl<Campaign> implements CampaignService {
    private final CampaignRepository repository;

    public CampaignServiceImpl(CampaignRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Campaign> getRepository() {
        return repository;
    }
}
