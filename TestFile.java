package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		          
		    EmployeeDaoTest dao=(EmployeeDaoTest)ctx.getBean("edao2");  
		    dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));  
		}  
		}  