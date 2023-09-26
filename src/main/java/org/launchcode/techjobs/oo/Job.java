package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.lang.System.lineSeparator;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String s = lineSeparator();

        String returnString = s;

        returnString += "ID: " + this.getId() + s;
        returnString += "Name: " + ((!this.getName().isEmpty()) ? (this.getName()) : ("Data not available")) + s;
        returnString += "Employer: " + ((!this.getEmployer().getValue().isEmpty()) ? (this.getEmployer()) : ("Data not available")) + s;
        returnString += "Location: " + ((!this.getLocation().getValue().isEmpty()) ? (this.getLocation()) : ("Data not available")) + s;
        returnString += "Position Type: " + ((!this.getPositionType().getValue().isEmpty()) ? (this.getPositionType()) : ("Data not available")) + s;
        returnString += "Core Competency: " + ((!this.getCoreCompetency().getValue().isEmpty()) ? (this.getCoreCompetency()) : ("Data not available")) + s;

        return returnString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
