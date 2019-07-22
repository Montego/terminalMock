package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.dto.AxDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AxDtoRepository extends JpaRepository<AxDto, Long> {
    public Optional<AxDto> findByProfileId(Long profileId);

}
