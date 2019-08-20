package com.terminalmock.test.entities.entity;

import com.terminalmock.test.entities.dictionary.Speciality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"PortalApplWizard\"")
public class PortalApplWizard {
    @Id
    @Column(name = "\"PortalApplWizardId\"")
    private int portalApplWizardId;
    @Column(name = "\"ApplWizardId\"")
    private String applWizardId;
    @Column(name = "\"CompanyId\"")
    private String companyId;
    @Column(name = "\"CompGroupsId\"")
    private String compGroupsId;
    @Column(name = "\"CompGroupsLineId\"")
    private String compGroupsLineId;
    @Column(name = "\"StudentCategory\"")
    private int studentCategory;
    @Column(name = "\"ApplicationLineType\"")
    private String applicationLineType;
    @Column(name = "\"EnvironmentId\"")
    private String environmentId;
    @Column(name = "\"EduForm\"")
    private int eduForm;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"SpecialityId\"")

    private Speciality specialityId;
    @Column(name = "\"DirectivityId\"")
    private String directivityId;
    @Column(name = "\"DeparCode\"")
    private String deparCode;
}
