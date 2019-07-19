package com.terminalmock.test.entities.view;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Immutable
//@Embeddable
@Table(name = "\"Wizard\"" )
public class Wizard {
    @Id
    @Column(name = "\"PortalApplWizardId\"")
    private int portalApplWizardId;
    @Column(name = "\"DeparCode\"")
    private String deparCode;
    @Column(name = "\"DeparName\"")
    private String deparName;
    @Column(name = "\"SpecialityId\"")
    private String specialityId;
    @Column(name = "\"EnvironmentId\"")
    private String environmentId;
    @Column(name = "\"courseNum\"")
    private int courseNum;
    @Column(name = "\"EduForm\"")
    private String eduForm;
}
