package com.fearaujo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CpfValidatorTest {

	
	@Test
	public void cpfTest(){
		
		// cpfs invalidos
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
		
		// cpfs validos
		// nao e permetido caracteres especiais
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
