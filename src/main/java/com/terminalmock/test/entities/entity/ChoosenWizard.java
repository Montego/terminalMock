package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChoosenWizard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

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

    @JoinColumn(name="application_wizard_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Application application;
}
