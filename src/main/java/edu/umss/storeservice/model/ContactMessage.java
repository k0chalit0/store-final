/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ContactMessageDto;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class ContactMessage extends ModelBase<ContactMessageDto> {
    String contentMessage;
    @OneToOne(targetEntity = Client.class)
    private Client client;

    public String getContentMessage() {
        return contentMessage;
    }

    public void setContentMessage(String contentMessage) {
        this.contentMessage = contentMessage;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}