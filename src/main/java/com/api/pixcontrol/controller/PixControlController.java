package com.api.pixcontrol.controller;

import com.api.pixcontrol.services.PixControlService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/pix")
public class PixControlController {
    final PixControlService pixControlService;

    public PixControlController(PixControlService pixControlService){
        this.pixControlService = pixControlService;
    }

}
