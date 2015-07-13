package com.xanne.xform;

import com.xanne.bo.BaseBO;
import com.xanne.dto.BaseDTO;

public class BaseXForm {
	
	public void transformBoToDto(BaseBO bo, BaseDTO dto) {
		if (bo != null) {
			dto.setCreateDate(bo.getCreateDate());
			dto.setCreateUser(bo.getCreateUser());
			dto.setUpdateDate(bo.getUpdateDate());
			dto.setUpdateUser(bo.getUpdateUser());
		}
	}

	public void transformDtoToBo(BaseDTO dto, BaseBO bo) {
		if (dto != null) {
			bo.setCreateDate(dto.getCreateDate());
			bo.setCreateUser(dto.getCreateUser());
			bo.setUpdateDate(dto.getUpdateDate());
			bo.setUpdateUser(dto.getUpdateUser());
		}
	}
}
