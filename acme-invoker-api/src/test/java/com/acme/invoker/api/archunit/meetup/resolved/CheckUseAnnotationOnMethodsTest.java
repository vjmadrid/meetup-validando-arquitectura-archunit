package com.acme.invoker.api.archunit.meetup.resolved;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.invoker.api", 
	importOptions = {
		ImportOption.DoNotIncludeTests.class, 
		ImportOption.DoNotIncludeJars.class,
		ImportOption.DoNotIncludeArchives.class 
	}
)
public class CheckUseAnnotationOnMethodsTest {

	@ArchTest
	public static void constant_classes_should_have_names_ending_with_the_word_constant(JavaClasses classes) {

		ArchRule rule = ExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant;
		rule.check(classes);
	}

	@ArchTest
	public static void constant_classes_should_be_final(JavaClasses classes) {

		ExampleCatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant.check(classes);
	}

}