package orangehrm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	
	AddEmployeeKeywords keys=new AddEmployeeKeywords();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void addEmployeeTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		int rowCount=eo.getRowCount(path1,1);
		for(int i=1;i<=rowCount;i++)
		{
			String action=eo.excelRead(path1,1,i, 3);
			executeMethods(action);
			
		}
	}
	public void executeMethods(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<methods.length;i++)
		{
			if(methods[i].getName().equals(action))
			{
				methods[i].invoke(keys);
			}
		}
	}

}
