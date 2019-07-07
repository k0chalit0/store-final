/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.ContactMessage;
import org.modelmapper.ModelMapper;

public class ContactMessageDto extends DtoBase<ContactMessage> {
    String contentMessage;
    private Long clientId;

    public String getContentMessage() {
        return contentMessage;
    }

    public void setContentMessage(String contentMessage) {
        this.contentMessage = contentMessage;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Override
    public DtoBase toDto(ContactMessage element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setClientId(element.getClient().getId());
        return this;
    }
}
