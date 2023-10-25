package com.api.pixcontrol.controller;

import com.api.pixcontrol.dtos.PixControlDto;
import com.api.pixcontrol.model.PixControlModel;
import com.api.pixcontrol.services.PixControlService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/pix")
public class PixControlController {
    final PixControlService pixControlService;

    public PixControlController(PixControlService pixControlService){
        this.pixControlService = pixControlService;
    }

    @PostMapping
    public ResponseEntity<Object> savePixUser (@RequestBody @Valid PixControlDto pixControlDto){
        if (pixControlService.existsByPixUserCPF(pixControlDto.getPixUserCPF())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CPF is already Registred");
        }
        if (pixControlService.existsByPixKeyCPF(pixControlDto.getPixKeyCPF())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: this CPF is already Registred whit key");
        }
        if (pixControlService.existsByPixKeyEmail(pixControlDto.getPixKeyEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: this Email is already Registred whit key");
        }
        if (pixControlService.existsByPixKeyCell(pixControlDto.getPixKeyCell())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: this Fone Number is already Registred whit key");
        }

        var pixControlModel = new PixControlModel();
        BeanUtils.copyProperties(parkingSpotDto, Par);
    }
}
