package com.acme.invoker.api.archunit.meetup.work;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

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
public class WorkCheckLayeredTest {
	
	@ArchTest
	public static final ArchRule layered_architecture = 
	layeredArchitecture()
	

    // **************
    // *** Layers ***
	// **************
	.layer("Constant layer").definedBy("..constant")
	.layer("Util layer").definedBy("..util")
	.layer("Service layer").definedBy("..service..")
	

	// ******************
	// *** Conditions ***
	// ******************
	
	.whereLayer("Util layer").mayOnlyBeAccessedByLayers(
			"Util layer", "Service layer"
	);

}
