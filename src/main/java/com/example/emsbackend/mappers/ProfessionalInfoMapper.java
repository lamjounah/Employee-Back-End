package com.example.emsbackend.mappers;

import com.example.emsbackend.dto.PofessionalInfoDto;
import com.example.emsbackend.entity.ProfessionalInfo;
import org.springframework.beans.BeanUtils;

public class  ProfessionalInfoMapper{

    public static PofessionalInfoDto mapToProfessionalInfoDto(ProfessionalInfo professionalInfo) {
        PofessionalInfoDto professionalInfoDto = new PofessionalInfoDto();

        BeanUtils.copyProperties(professionalInfo,professionalInfoDto);

        return professionalInfoDto;
    }

    public static ProfessionalInfo mapToProfessionalInfo(PofessionalInfoDto professionalInfoDto) {
        ProfessionalInfo professionalInfo = new ProfessionalInfo();

        BeanUtils.copyProperties(professionalInfoDto,professionalInfo);

        return professionalInfo;
    }
}
