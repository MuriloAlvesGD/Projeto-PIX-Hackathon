package com.api.pixcontrol.controller;

import com.api.pixcontrol.dtos.PixControlDto;
import com.api.pixcontrol.model.PixControlModel;
import com.api.pixcontrol.services.PixControlService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;

@RestController
public class PixControlController {
    final PixControlService pixControlService;

    public PixControlController(PixControlService pixControlService) {
        this.pixControlService = pixControlService;
    }

    @PostMapping( "/api/pix/chaves")
    public ResponseEntity<Object> savePixUser(@RequestBody @Valid PixControlDto pixControlDto) {
        if (pixControlService.existsByPixUserCpf(pixControlDto.getPixUserCpf())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CPF is Already in use!");
        }

        var pixControlModel = new PixControlModel();
        BeanUtils.copyProperties(pixControlDto, pixControlModel);
        pixControlModel.setRegistrationData(LocalDateTime.now(ZoneId.of("UTC-3")));
        pixControlModel.setPixKeyCpf(pixControlDto.getPixUserCpf());
        return ResponseEntity.status(HttpStatus.CREATED).body(pixControlService.save(pixControlModel));
    }

    @PutMapping("/api/pix/chaves/{id}")
    public ResponseEntity <Object>  UpdatePixKey(@PathVariable (value = "id") UUID id, @RequestBody @Valid PixControlDto pixControlDto){
        Optional<PixControlModel> pixControlModelOptional = pixControlService.findById(id);
        if (!pixControlModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }
        var pixControlModelUpdate = new PixControlModel();
        BeanUtils.copyProperties(pixControlDto, pixControlModelUpdate);

        var pixControlModel = new PixControlModel();
        BeanUtils.copyProperties(pixControlModelOptional, pixControlModel);

        pixControlModel.setPixKeyEmail(pixControlModelUpdate.getPixKeyEmail());
        pixControlModel.setPixKeyCpf(pixControlModelUpdate.getPixKeyCpf());
        pixControlModel.setPixKeyCell(pixControlModelUpdate.getPixKeyCell());

        return ResponseEntity.status(HttpStatus.OK).body(pixControlService.save(pixControlModel));
    }


    @GetMapping("/api/pix/chaves/{id}")
    public ResponseEntity<Object> getOnePixUser(@PathVariable (value = "id") UUID id){
        Optional<PixControlModel> pixControlModelOptional = pixControlService.findById(id);
        if (!pixControlModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(pixControlModelOptional.get());
    }

    @DeleteMapping("/api/pix/chaves/{id}")
    public ResponseEntity<Object> deletePixUser(@PathVariable (value = "id") UUID id){
        Optional<PixControlModel> pixControlModelOptional = pixControlService.findById(id);
        if (!pixControlModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }
        pixControlService.delete(pixControlModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("User deleted succesfully");
    }

}
