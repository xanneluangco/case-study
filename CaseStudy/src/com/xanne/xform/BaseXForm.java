package com.xanne.xform;

import com.xanne.bo.BaseBO;
import com.xanne.dto.BaseDTO;

public class BaseXForm {
	
	public void transformBoToDto(BaseBO bo, BaseDTO dto) {
		if (bo != null) {
			dto.setCreateDate(bo.getCreateDate());
			//TODO next 3 attributes
		}
	}

	public void transformDtoToBo(BaseDTO dto, BaseBO bo) {
		if (dto != null) {
			bo.setCreateDate(dto.getCreateDate());
			//TODO next 3 attributes
		}
	}
}
