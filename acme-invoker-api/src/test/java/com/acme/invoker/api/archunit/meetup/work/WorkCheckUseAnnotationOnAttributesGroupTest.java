package com.acme.invoker.api.archunit.meetup.work;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.invoker.api", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class,
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class WorkCheckUseAnnotationOnAttributesGroupTest {
	
	// Step 1 : Uncomment Annotation "@ArchTest"

	// Step 2 : Add Group in External Class
	
	/**
	 * NOTE
	 * 	* ArchRules.in(XXXX)
	 *  * Use Group : WorkExampleCatalogConstantArchitectureRule.class
	 */
	
	//@ArchTest
	public static final ArchRules base_constant_architecture = null;

}
