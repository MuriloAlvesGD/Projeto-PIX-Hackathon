package com.api.pixcontrol.repositories;

import com.api.pixcontrol.model.PixControlModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PixControlRepositorie extends JpaRepository<PixControlModel, UUID> {
    boolean existsByPixUserCpf(String pixUserCpf);
}
