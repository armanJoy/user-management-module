package com.arcgen.usermgt.models.domain.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AccessDef")
public class AccessDef {

    @Id
    @Column(name = "accessDefId")
    private String accessDefId;

    @Column(name = "accessTitle")
    private String accessTitle;

    @Column(name = "accessCode")
    private String accessCode;

    @Column(name = "accessDescription")
    private String accessDescription;

    public String getAccessDefId() {
        return accessDefId;
    }

    public void setAccessDefId(String accessDefId) {
        this.accessDefId = accessDefId;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getAccessDescription() {
        return accessDescription;
    }

    public void setAccessDescription(String accessDescription) {
        this.accessDescription = accessDescription;
    }

    public String getAccessTitle() {
        return accessTitle;
    }

    public void setAccessTitle(String accessTitle) {
        this.accessTitle = accessTitle;
    }

}
