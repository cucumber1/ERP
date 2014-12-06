package org.erp.auth.employee.dao.dao;

import org.erp.auth.employee.entity.EmployeeModel;
import org.erp.util.base.BaseDao;
public interface EmployeeDao extends BaseDao<EmployeeModel>
{
	EmployeeModel findByNameAndPass(String userName, String userPass);

}