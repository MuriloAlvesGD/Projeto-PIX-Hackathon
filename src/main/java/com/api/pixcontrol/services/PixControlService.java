package com.api.pixcontrol.services;

import com.api.pixcontrol.model.PixControlModel;
import com.api.pixcontrol.repositories.PixControlRepositorie;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PixControlService {

    @Autowired
    PixControlRepositorie pixControlRepositorie;

    @Transactional
    public Object save(PixControlModel pixControlModel){
        return pixControlRepositorie.save(pixControlModel);
    }

    public boolean existsByPixUserCpf(String pixUserCpf) {
        return pixControlRepositorie.existsByPixUserCpf(pixUserCpf);
    }

    public Optional<PixControlModel> findById(UUID id) {
        return pixControlRepositorie.findById(id);
    }

    public void delete(PixControlModel pixControlModel) {
        pixControlRepositorie.delete(pixControlModel);
    }
}
