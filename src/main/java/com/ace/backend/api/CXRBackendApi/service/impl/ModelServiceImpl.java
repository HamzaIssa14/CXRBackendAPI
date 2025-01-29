package com.ace.backend.api.CXRBackendApi.service.impl;

import com.ace.backend.api.CXRBackendApi.entity.ModelInput;
import com.ace.backend.api.CXRBackendApi.entity.ModelResult;
import com.ace.backend.api.CXRBackendApi.payload.ModelInputDto;
import com.ace.backend.api.CXRBackendApi.payload.ModelResultDto;
import com.ace.backend.api.CXRBackendApi.service.ModelService;
import org.modelmapper.ModelMapper;

public class ModelServiceImpl implements ModelService {

    private final ModelMapper mapper;

    public ModelServiceImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ModelResultDto executeModel(ModelInputDto modelInputDto) {
        // 1. convert ModelInputDTO to ModelInput Entity
        // 2. call HuggingFace API Models given imageData input from ModelInput entity
        // 3. convert return JSON String to ModelResultEntity
        // 4. if successful, save ModelInput & ModelResult entities
        // 5. convert ModelResult entity to ModelResultDTO
        // 6. return ModelResultDTO
        return null;
    }

    private ModelResult convertAPIResponseToModelResult(String modelJsonResult){
        // ModelResult modelResult = new ModelResult();
        // Convert modelJsonResult String type to Jackson JSON
        // Convert Jackson JSON to ModelResult java object.
        return null;
    }

    private ModelInput mapModelInputDToToEntity(ModelInputDto modelInputDto){
        return mapper.map(modelInputDto, ModelInput.class);
    }

    private ModelResultDto mapModelResultToDTO(ModelResult modelResult){
        return mapper.map(modelResult, ModelResultDto.class);
    }
}
