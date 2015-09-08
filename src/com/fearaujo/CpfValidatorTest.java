package com.fearaujo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CpfValidatorTest {

	
	@Test
	public void cpfTest(){
		// invalid cpfs
		// cpfs invalidos
		assertEquals(false, CpfValidator.isCPF(null));
		assertEquals(false, CpfValidator.isCPF(""));
		assertEquals(false, CpfValidator.isCPF("0"));
		assertEquals(false, CpfValidator.isCPF("00000000000"));
		assertEquals(false, CpfValidator.isCPF("11111111111"));
		assertEquals(false, CpfValidator.isCPF("99999999999"));
		assertEquals(false, CpfValidator.isCPF("12345687911"));
		assertEquals(false, CpfValidator.isCPF("11488954644"));
		assertEquals(false, CpfValidator.isCPF("32132454544"));
		assertEquals(false, CpfValidator.isCPF("456567767657"));
		assertEquals(false, CpfValidator.isCPF("123.456.879-11"));
		assertEquals(false, CpfValidator.isCPF("114.889.546-44"));
		assertEquals(false, CpfValidator.isCPF("321.324.545-44"));
		assertEquals(false, CpfValidator.isCPF("456.567.767-57"));
		
		assertEquals(false, CpfValidator.isCPF("071.721.522-98"));
		assertEquals(false, CpfValidator.isCPF("847.781.803-72"));
		assertEquals(false, CpfValidator.isCPF("471.382.531-09"));
		assertEquals(false, CpfValidator.isCPF("434.896.155-73"));
		assertEquals(false, CpfValidator.isCPF("179.947.946-37"));
		assertEquals(false, CpfValidator.isCPF("328.179.426-20"));
		assertEquals(false, CpfValidator.isCPF("916.326.148-04"));
		assertEquals(false, CpfValidator.isCPF("761.859.339-69"));
		
		assertEquals(false, CpfValidator.isCPF("916.326.148-**"));
		assertEquals(false, CpfValidator.isCPF("761.859.339-##"));
		
		
		// valid cpfs
		// is not allowed special characters and masks
		// cpfs validos
		// nao e permitido caracteres especiais e mascaras
		assertEquals(true, CpfValidator.isCPF("07172152298"));
		assertEquals(true, CpfValidator.isCPF("84778180372"));
		assertEquals(true, CpfValidator.isCPF("47138253109"));
		assertEquals(true, CpfValidator.isCPF("43489615573"));
		assertEquals(true, CpfValidator.isCPF("17994794637"));
		assertEquals(true, CpfValidator.isCPF("32817942620"));
		assertEquals(true, CpfValidator.isCPF("91632614804"));
		assertEquals(true, CpfValidator.isCPF("76185933969"));
		
	}

}
