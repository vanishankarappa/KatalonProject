package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object App_url
     
    /**
     * <p></p>
     */
    public static Object Uname
     
    /**
     * <p></p>
     */
    public static Object Pwd
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['App_url' : 'https://opensource-demo.orangehrmlive.com/', 'Uname' : 'Admin', 'Pwd' : 'hUKwJTbofgPU9eVlw/CnDQ=='])
        allVariables.put('QA', allVariables['default'] + ['App_url' : 'https://opensource-demo.orangehrmlive.com/', 'Uname' : 'AdminQA', 'Pwd' : 'hUKwJTbofgPU9eVlw/CnDQ=='])
        allVariables.put('Reg', allVariables['default'] + ['App_url' : 'https://opensource-demo.orangehrmlive.com/', 'Uname' : 'AdminReg', 'Pwd' : 'hUKwJTbofgPU9eVlw/CnDQ=='])
        allVariables.put('Stage', allVariables['default'] + ['App_url' : 'https://opensource-demo.orangehrmlive.com/', 'Uname' : 'AdminStage', 'Pwd' : 'hUKwJTbofgPU9eVlw/CnDQ=='])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        App_url = selectedVariables['App_url']
        Uname = selectedVariables['Uname']
        Pwd = selectedVariables['Pwd']
        
    }
}
