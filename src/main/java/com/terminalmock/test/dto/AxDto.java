package com.terminalmock.test.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "\"AxDto\"")
public class AxDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"axDtoId\"")
    private Long axDtoId;
    @Column(name = "\"profileId\"")
    private Long profileId;
    @Column(name = "\"contactPersonId\"")
    private String contactPersonId;
    @Column(name = "\"applicationId\"")
    private String applicationId;
    @Column(name = "\"agreementId\"")
    private String agreementId;
}
