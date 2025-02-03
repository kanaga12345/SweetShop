package org.runner;

import org.execution.BasketPageValidation;
import org.execution.LoginPageValidation;
import org.execution.SweetPageValidation;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginPageValidation.class,
	SweetPageValidation.class,
	BasketPageValidation.class
})
public class SuiteLevelExecution {
	
	
	

}
