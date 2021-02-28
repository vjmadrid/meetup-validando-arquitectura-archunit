package com.acme.invoker.api.archunit.meetup.work;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.invoker.api.archunit.constant.ArchUnitNameConstant;
import com.acme.invoker.api.archunit.constant.ArchUnitPackageConstant;
import com.acme.invoker.api.archunit.meetup.resolved.ExampleCatalogConstantArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

// Step 1 : Uncomment code

//@AnalyzeClasses(packages = "com.acme.invoker.api", 
//	importOptions = { 
//			ImportOption.DoNotIncludeTests.class,
//			ImportOption.DoNotIncludeJars.class, 
//			ImportOption.DoNotIncludeArchives.class 
//	}
//)
public class WorkCheckUseAnnotationOnAttributesTest {
	
	// Step 2 : Add Annotation "@ArchTest"

	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant =  classes()
		    .that().resideInAPackage("..constant")
		    .should().haveSimpleNameEndingWith("Constant");
	
	// Step 3 : Create ArchRule with Annotation "@ArchTest" using using architecture constants "Check that classes residing in the "..constant" package (resideInAPackage) end in the suffix "Constant" (haveSimpleNameEndingWith) "
	
	/**
	 * NOTE
	 * 	* Use Package Constant : ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS
	 *  * Use Name Constant : ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS
	 */

	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant_2 =  null;
	
	// Step 4 : Uncomment code
//	@ArchTest
//	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant_3 =  
//		WorkExampleCatalogConstantArchitectureRule
//		.constant_classes_should_have_names_ending_with_the_word_constant;
	
}