package com.service.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({DemoServiceTest.class,CalculatorServiceTest.class})
public class AllTestCase {

}
