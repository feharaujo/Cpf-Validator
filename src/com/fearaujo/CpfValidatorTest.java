package com.fearaujo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CpfValidatorTest {

	
	@Test
	public void cpfTest(){
		
		// invalid cpfs
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
		
		// valid cpfs
		assertEquals(false, CpfValidator.isCPF("071.721.522-98"));
		assertEquals(false, CpfValidator.isCPF("847.781.803-72"));
		assertEquals(false, CpfValidator.isCPF("471.382.531-09"));
		assertEquals(false, CpfValidator.isCPF("434.896.155-73"));
		assertEquals(false, CpfValidator.isCPF("179.947.946-37"));
		assertEquals(false, CpfValidator.isCPF("328.179.426-20"));
		assertEquals(false, CpfValidator.isCPF("916.326.148-04"));
		assertEquals(false, CpfValidator.isCPF("761.859.339-69"));
		
	}

}
