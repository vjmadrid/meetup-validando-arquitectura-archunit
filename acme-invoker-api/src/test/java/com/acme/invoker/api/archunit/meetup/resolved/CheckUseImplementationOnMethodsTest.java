package com.acme.invoker.api.archunit.meetup.resolved;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;

public class CheckUseImplementationOnMethodsTest {
	
	JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
			.importPackages("com.acme.invoker.api");
	
	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant() {
		JavaClasses importedClassesLocal = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
        		.importPackages("com.acme.invoker.api");
		
		ArchRule rule = classes()
			    .that().resideInAPackage("..constant")
			    .should().haveSimpleNameEndingWith("Constant");
		
		rule.check(importedClassesLocal);
	}
	
	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant_2() {
		ArchRule rule = classes()
			    .that().resideInAPackage("..constant")
			    .should().haveSimpleNameEndingWith("Constant");
		
		rule.check(IMPORTED_CLASSES);
	}

	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant_3() {
		ArchRule rule = ExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant;
		
		rule.check(IMPORTED_CLASSES);
	}
	

	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant_4() {

		ExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant.check(IMPORTED_CLASSES);
	}

}