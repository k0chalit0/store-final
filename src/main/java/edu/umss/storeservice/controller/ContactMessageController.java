/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.ContactMessageDto;
import edu.umss.storeservice.model.ContactMessage;
import edu.umss.storeservice.service.ContactMessageService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contactmessages")
public class ContactMessageController extends GenericController<ContactMessage, ContactMessageDto> {
    private ContactMessageService service;

    public ContactMessageController(ContactMessageService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}