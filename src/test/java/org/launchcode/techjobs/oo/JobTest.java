package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.System.lineSeparator;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getName() instanceof String);
        assertEquals(job1.getName(), "Product Tester");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String firstChar = String.valueOf(job1.toString().charAt(0));
        String lastChar = String.valueOf(job1.toString().charAt(job1.toString().length()-1));
        assertEquals(firstChar, lineSeparator(), firstChar);
        assertEquals(lastChar, lineSeparator(), lastChar);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(), System.lineSeparator() + "ID: " + job1.getId() + System.lineSeparator() + "Name: " + job1.getName() + System.lineSeparator() + "Employer: " + job1.getEmployer() + System.lineSeparator() + "Location: " + job1.getLocation() + System.lineSeparator() + "Position Type: " + job1.getPositionType() + System.lineSeparator() + "Core Competency: " + job1.getCoreCompetency() + System.lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(), System.lineSeparator() + "ID: " + job1.getId() + System.lineSeparator() + "Name: " + job1.getName() + System.lineSeparator() + "Employer: Data not available" + System.lineSeparator() + "Location: " + job1.getLocation() + System.lineSeparator() + "Position Type: Data not available" + System.lineSeparator() + "Core Competency: " + job1.getCoreCompetency() + System.lineSeparator());
    }
}
