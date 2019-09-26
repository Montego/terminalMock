package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.dictionary.Document;
import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.entities.dictionary.TargOrg;
import com.terminalmock.test.entities.enums.DocType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TargOrg")
    private TargOrg company;
    private String contract;
    private LocalDate date;
    @Column(name = "\"courseNum\"")
    private int courseNum;
    @Column(name = "\"EduForm\"")
    private String eduForm;

    private boolean agree;
    private LocalDate agreeDate;
    private String orderGroupType;
    private boolean chose;
    private boolean specialRight;
    //TODO тип?
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TypeOfSpecialRight")
    private Preference typeOfSpecialRight;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProofSpecialRight1")
    private Document proofSpecialRight1;

    private String descriptionSpecialRight1;
    private String serialSpecialRight1;
    private String numberSpecialRight1;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType docTypeSpecialRight1;
    private LocalDate dateSpecialRight1;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProofSpecialRight2")
    private Document proofSpecialRight2;
    private String descriptionSpecialRight2;
    private String serialSpecialRight2;
    private String numberSpecialRight2;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType2")
    private DocType docTypeSpecialRight2;
    private LocalDate dateSpecialRight2;

    private String compGroupsId;
    private String compGroupsLineId;

    @JoinColumn(name="application_wizard_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Application application;
}
