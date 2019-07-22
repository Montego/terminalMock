package com.terminalmock.test.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AxDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long axDtoId;
    private Long profileId;
    private String contactPersonId;
    private String applicationId;
    private String agreementId;
}
