package com.ace.backend.api.CXRBackendApi.controller;

import com.ace.backend.api.CXRBackendApi.payload.ModelInputDto;
import com.ace.backend.api.CXRBackendApi.payload.ModelResultDto;
import com.ace.backend.api.CXRBackendApi.service.ModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController {

    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    // submit ModelInput to ML Model
    @PostMapping()
    public ResponseEntity<ModelResultDto> executeModel(@RequestBody ModelInputDto modelInputDto){
        ModelResultDto modelResultDto = modelService.executeModel(modelInputDto);
        return new ResponseEntity<>(modelResultDto, HttpStatus.CREATED);
    }
}
