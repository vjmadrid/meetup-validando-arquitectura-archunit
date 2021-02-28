package com.acme.invoker.api.archunit.meetup.empty;

import com.acme.invoker.api.archunit.meetup.resolved.ExampleCatalogConstantArchitectureRule;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//Step 1 : Uncomment code

//@AnalyzeClasses(packages = "com.acme.invoker.api", 
//	importOptions = {
//		ImportOption.DoNotIncludeTests.class, 
//		ImportOption.DoNotIncludeJars.class,
//		ImportOption.DoNotIncludeArchives.class 
//	}
//)
public class EmptyCheckUseAnnotationOnMethodsTest {

	// Step 2 : Uncomment Annotation "@ArchTest"
	
	//@ArchTest
	public static void constant_classes_should_have_names_ending_with_the_word_constant(JavaClasses classes) {

		//Step 3 : Uncomment code
		
//		ArchRule rule = EmptyExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant;
//		rule.check(classes);
	}

	// Step 4 : Uncomment Annotation "@ArchTest"
	
	//@ArchTest
	public static void constant_classes_should_be_final(JavaClasses classes) {

		//Step 4 : Uncomment code
		
		//EmptyExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant.check(classes);
	}

}