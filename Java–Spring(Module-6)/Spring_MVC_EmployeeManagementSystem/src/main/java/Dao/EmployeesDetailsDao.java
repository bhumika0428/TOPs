package Dao;




import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import Model.EmployeesDetails;

public class EmployeesDetailsDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void insertEmployeeDetails(EmployeesDetails e)
	{
		 this.hibernateTemplate.saveOrUpdate(e);
	}
	public List<EmployeesDetails> getAllEmployee()
	{
		return this.hibernateTemplate.loadAll(EmployeesDetails.class);
	}
	public EmployeesDetails getbyIDEmployee(int id)
	{
		return this.hibernateTemplate.get(EmployeesDetails.class, id);
	}
	@Transactional
	public void deleteEmployee(int id)
	{
		EmployeesDetails obj=this.hibernateTemplate.get(EmployeesDetails.class, id);
		 this.hibernateTemplate.delete(obj);
	}
}
