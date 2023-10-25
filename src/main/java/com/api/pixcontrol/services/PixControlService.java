package com.api.pixcontrol.services;

import com.api.pixcontrol.repositories.PixControlRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PixControlService {

    @Autowired
    PixControlRepositorie pixControlRepositorie;

}
