/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.ContactMessage;
import edu.umss.storeservice.repository.ContactMessageRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageServiceImpl extends GenericServiceImpl<ContactMessage> implements ContactMessageService {
    private final ContactMessageRepository repository;

    public ContactMessageServiceImpl(ContactMessageRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<ContactMessage> getRepository() {
        return repository;
    }
}
