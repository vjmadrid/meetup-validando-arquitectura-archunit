package com.acme.invoker.api.archunit.meetup.empty;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class EmptyCheckImportClassesTest {
	
	private static final int NUM_IMPORTED_CLASSES_C_WITH_OPTIONS = 10;
	
	JavaClasses IMPORTED_CLASSES_GLOBAL = new ClassFileImporter()
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
			.importPackages("com.acme.invoker.api");
	
	
	private void showImportedClasses(List<Object> importedClassesList) {
		for (Object value : importedClassesList) {
			JavaClass javaClass = (JavaClass) value;
			System.out.println("\t* "+javaClass.getFullName());
		}
	}
	
	@Test
	public void checkImportLocal() {
		System.out.println("\n*** ClassFileImporter Local ***");
		
		
		// Step 1 : Add local variable to methods for importing classes "importedClassesList"

		// Step 2 : Uncomment code
		
		/*
		List<Object> importedClassesList = Arrays.asList(importedClassesLocal.toArray());
		
		showImportedClasses(importedClassesList);
		
		assertNotNull(importedClassesLocal);
        assertEquals(NUM_IMPORTED_CLASSES_C_WITH_OPTIONS,importedClassesList.size());
        */
		
		// Step 3 : Delete Assert
		
		assertTrue(Boolean.TRUE);
 	}
	
	@Test
	public void checkImportGlobal() {
		System.out.println("\n*** ClassFileImporter Global ***");
		
		// Step 1 : Uncomment global attribute to methods for importing classes "IMPORTED_CLASSES_GLOBAL"
		
		// Step 2 : Uncomment code
		
		/*
		List<Object> importedClassesList = Arrays.asList(IMPORTED_CLASSES_GLOBAL.toArray());
		
		showImportedClasses(importedClassesList);
		
		assertNotNull(importedClassesList);
        assertEquals(NUM_IMPORTED_CLASSES_C_WITH_OPTIONS,importedClassesList.size());
        */
		
		// Step 3 : Delete Assert
		
		assertTrue(Boolean.TRUE);
	}

}