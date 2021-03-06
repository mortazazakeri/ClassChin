package jclasschin.entity;
// Generated Jun 20, 2014 4:27:44 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Schedule generated by hbm2java
 */
public class Schedule  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Integer numberOfPeriods;
     private Set periods = new HashSet(0);
     private Set ctacsses = new HashSet(0);

    public Schedule() {
    }

	
    public Schedule(String name) {
        this.name = name;
    }
    public Schedule(String name, Integer numberOfPeriods, Set periods, Set ctacsses) {
       this.name = name;
       this.numberOfPeriods = numberOfPeriods;
       this.periods = periods;
       this.ctacsses = ctacsses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumberOfPeriods() {
        return this.numberOfPeriods;
    }
    
    public void setNumberOfPeriods(Integer numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }
    public Set getPeriods() {
        return this.periods;
    }
    
    public void setPeriods(Set periods) {
        this.periods = periods;
    }
    public Set getCtacsses() {
        return this.ctacsses;
    }
    
    public void setCtacsses(Set ctacsses) {
        this.ctacsses = ctacsses;
    }




}


