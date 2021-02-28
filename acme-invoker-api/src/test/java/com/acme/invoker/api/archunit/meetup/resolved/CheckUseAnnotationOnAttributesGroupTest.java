package com.acme.invoker.api.archunit.meetup.resolved;

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
public class CheckUseAnnotationOnAttributesGroupTest {

	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(ExampleCatalogConstantArchitectureRule.class);

}
