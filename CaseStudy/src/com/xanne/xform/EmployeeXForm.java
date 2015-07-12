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
		}
	}

	public void transformDtoToBo(EmployeeDTO dto, EmployeeBO bo) {
		if (dto != null) {
			bo.setCreateDate(dto.getCreateDate());
			//TODO next 3 attributes
		}
	}

}
