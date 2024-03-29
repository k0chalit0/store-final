/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Client;

public class ClientDto extends DtoBase<Client> {
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
