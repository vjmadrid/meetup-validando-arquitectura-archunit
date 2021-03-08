package com.acme.invoker.api.archunit;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;;

@AnalyzeClasses(packages = "com.acme.invoker.api", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class,
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class ApiArchitectureTest {


//	@ArchTest
//	public static final ArchRules global_core_architecture = ArchRules.in(CatalogCoreGroupArchitectureRule.class);
//	
//	@ArchTest
//	public static final ArchRules global_spring_architecture = ArchRules.in(CatalogSpringGroupArchitectureRule.class);

}
