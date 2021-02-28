package com.acme.invoker.api.archunit.meetup.work;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.constructors;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noFields;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.acme.invoker.api.archunit.meetup.resolved.ExampleCatalogConstantArchitectureRule;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;

public class WorkCheckUseImplementationOnMethodsTest {
	
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
		
		// Step 1: Add Local Rule "Check that classes residing in the "..constant" package (resideInAPackage) end in the suffix "Constant" (haveSimpleNameEndingWith) "
		 
		/**
		 *  NOTE
		 * 		Structure
		 * 			<Scope : classes() , fields() , noFields(), constructors(), ...>
		 * 			.that(). <DescribedPredicate_method_1>
		 * 			.and() | .or() <DescribedPredicate_method_x> | .and(<DescribedPredicate_class_x>) | .or(<DescribedPredicate_class_x>)
		 * 			.should(). <condition_1>
		 * 			.andShould() | .orShould()
		 */
		
		ArchRule rule = null;
		
		// Step 2 : Uncomment code
		
		//rule.check(importedClassesLocal);
		
		// Step 3 : Delete Assert
		
		assertTrue(Boolean.TRUE);
	}
	
	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant_2() {
		
		// Step 1: Add Local Rule "Check that classes residing in the "..constant" package (resideInAPackage) end in the suffix "Constant" (haveSimpleNameEndingWith) "
		
		ArchRule rule = null;
		
		// Step 2 : Uncomment code
		
		//rule.check(IMPORTED_CLASSES);
		
		// Step 3 : Delete Assert
		
		assertTrue(Boolean.TRUE);
	}

	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant_3() {
		
		// Step 1: Add External Rule "Check that classes residing in the "..constant" package (resideInAPackage) end in the suffix "Constant" (haveSimpleNameEndingWith) "
		
		/**
		 * NOTE
		 * 	* Uncomment code
		 *  * Create External Rule
		 */
		
		//ArchRule rule = WorkExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant;
		
		// Step 2 : Uncomment code
		
		//rule.check(IMPORTED_CLASSES);
		
		// Step 3 : Delete Assert
		
		assertTrue(Boolean.TRUE);
	}
	

	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant_4() {

		// Step 1: Uncomment code
		
		// WorkExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant.check(IMPORTED_CLASSES);
		
		// Step 3 : Delete Assert
		
		assertTrue(Boolean.TRUE);
	}

}