package com.xanne.xform;

import com.xanne.bo.EmployeeBO;
import com.xanne.dto.EmployeeDTO;

public class EmployeeXForm extends BaseXForm {
	
	public void transformBoToDto(EmployeeBO bo, EmployeeDTO dto) {
		if (bo != null) {
			super.transformBoToDto(bo, dto);	
			dto.setLastName(bo.getLastName());
			dto.setFirstName(bo.getFirstName());
			dto.setMiddleName(bo.getMiddleName());
			dto.setAge(bo.getAge());
			dto.setBirthday(bo.getBirthday());
			dto.setPosition(bo.getPosition());
			dto.setGender(bo.getGender());
		}
	}

	public void transformDtoToBo(EmployeeDTO dto, EmployeeBO bo) {
		if (dto != null) {
			super.transformDtoToBo(dto, bo);
			bo.setLastName(dto.getLastName());
			bo.setFirstName(dto.getFirstName());
			bo.setMiddleName(dto.getMiddleName());
			bo.setAge(dto.getAge());
			bo.setBirthday(dto.getBirthday());
			bo.setPosition(dto.getPosition());
			bo.setGender(dto.getGender());
		}
	}
}
