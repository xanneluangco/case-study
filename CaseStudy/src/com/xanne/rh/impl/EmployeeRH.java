package com.xanne.rh.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xanne.bo.EmployeeBO;
import com.xanne.cmd.EmployeeGetDetailCmd;
import com.xanne.cmd.EmployeeGetListCmd;
import com.xanne.dto.EmployeeDTO;
import com.xanne.exception.CaseStudyException;
import com.xanne.rh.BaseRH;
import com.xanne.util.CaseUtils;
import com.xanne.xform.EmployeeXForm;

public class EmployeeRH implements BaseRH {

	@Override
	public String handle(HttpServletRequest request,
			HttpServletResponse response) {
		String cmd = CaseUtils.trimStringNull(request.getParameter("cmd"));
		String nextPage = null;
		try {
			if (cmd.equalsIgnoreCase("list")) {
				nextPage = doGetEmployeeList(request);
			} else if (cmd.equalsIgnoreCase("detail")) {
				nextPage = doGetEmployeeDetail(request);
			}
		} catch (CaseStudyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nextPage;
	}

	private String doGetEmployeeDetail(HttpServletRequest request) throws CaseStudyException {
		String nextPage = null;
		
		
		try {
			// execute the command
			EmployeeGetDetailCmd cmd = new EmployeeGetDetailCmd();
			cmd.setEmployeeId(100);
			cmd.execute();	
			
			// get the output
			EmployeeBO employee = cmd.getEmployee();
			
			// transform BO to DTO
			EmployeeXForm xForm = (EmployeeXForm) employee.getXForm();
			EmployeeDTO dto = new EmployeeDTO();
			xForm.transformBoToDto(employee, dto);
			
			// save the DTO to request
			request.setAttribute("employeeDetail", dto);
		} catch (CaseStudyException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CaseStudyException(e);
		}
		
		nextPage = "/jsp/Sample.jsp";
		return nextPage;

	}

	private String doGetEmployeeList(HttpServletRequest request) throws CaseStudyException {
		String nextPage = null;
		
		// execute the command
		EmployeeGetListCmd cmd = new EmployeeGetListCmd();
		cmd.execute();
		
		// get the output
		List <EmployeeBO> employees = (List<EmployeeBO>) cmd.getEmployees();
		for (EmployeeBO employee : employees) {
			// transform BO to DTO
			EmployeeXForm xForm = (EmployeeXForm) employee.getXForm();
			EmployeeDTO dto = new EmployeeDTO();
			xForm.transformBoToDto(employee, dto);
			
			// save the DTO to request
			
		}
		request.setAttribute("employeeList", employees);		
		nextPage = "/jsp/Sample.jsp";
		return nextPage;
	}
}
