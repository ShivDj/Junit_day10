package jUnitTestForUserRegistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void isCheck_firstNameTest_shouldReturn_True() {
		
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userFirstNameCheckRegex();
		assertEquals(true, result);
	}
	
	@Test
	public void isCheck_firstNameTest_shouldReturn_False() {
		
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userFirstNameCheckRegex();
		assertEquals(false, result);
	}
	@Test
	public void isCheck_lastNameTest_shouldReturn_true()
	{
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userLastNameCheckRegex();
		assertEquals(true, result);

	}
	@Test
	public void isCheck_lastNameTest_shouldReturn_False() {
		
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userLastNameCheckRegex();
		assertEquals(false, result);
	}
	
	@Test
    public void isCheck_EmailTest_shouldReturn_true()
	{
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userEmailCheckRegex();
		assertEquals(true, result);

	}
	@Test
	public void isCheck_EmailTest_shouldReturn_False() {
		
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userEmailCheckRegex();
		assertEquals(false, result);
	}

	
	@Test
	public void isCheck_ContactTest_shouldReturn_true()
	{
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userPhoneNumberCheckRegex();
		assertEquals(true, result);

	}
	@Test
	public void isCheck_ContactTest_shouldReturn_False() {
		
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userPhoneNumberCheckRegex();
		assertEquals(false, result);
	}

	@Test
	public void isCheck_PasswordTest_shouldReturn_true()
	{
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userPassWardCheckRegex();
		assertEquals(true, result);

	}
	@Test
	public void isCheck_PasswordTest_shouldReturn_False() {
		
		JUnitUserRegistrationCheck jUnit = new JUnitUserRegistrationCheck();
		boolean result=jUnit.userPassWardCheckRegex();
		assertEquals(false, result);
	}


}
