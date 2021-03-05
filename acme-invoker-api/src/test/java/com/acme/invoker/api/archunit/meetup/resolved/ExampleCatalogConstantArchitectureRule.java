package com.acme.invoker.api.archunit.meetup.resolved;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.invoker.api.archunit.constant.ArchUnitNameConstant;
import com.acme.invoker.api.archunit.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class ExampleCatalogConstantArchitectureRule {
	
	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant = 
			classes() 
			.that().resideInAPackage("..constant")
			.should().haveSimpleNameEndingWith("Constant");

	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant_2 = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS);
	
	@ArchTest
	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant_3 = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS);

}
