package com.acme.invoker.api.archunit.meetup.work;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.invoker.api.archunit.constant.ArchUnitNameConstant;
import com.acme.invoker.api.archunit.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class WorkExampleCatalogConstantArchitectureRule {
	
	// *** ArchRule Basic ***
	
	// Add code here
	
	
	
	// *** ArchRule using architecture constants ***
	
	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant_2 = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS);
	
	
	
	// *** ArchRule + ArchTest using architecture constants ***
	
	@ArchTest
	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant_3 = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS);

}
