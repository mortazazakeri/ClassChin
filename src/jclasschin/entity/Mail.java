package jclasschin.entity;
// Generated Jun 20, 2014 4:27:44 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Mail generated by hbm2java
 */
public class Mail  implements java.io.Serializable {


     private Integer id;
     private Term term;
     private Person personByReceiverPersonId;
     private Person personBySenderPersonId;
     private String type;
     private String text;
     private Date date;
     private Boolean receiverDelete;
     private Boolean senderDelete;

    public Mail() {
    }

	
    public Mail(Person personByReceiverPersonId, Person personBySenderPersonId) {
        this.personByReceiverPersonId = personByReceiverPersonId;
        this.personBySenderPersonId = personBySenderPersonId;
    }
    public Mail(Term term, Person personByReceiverPersonId, Person personBySenderPersonId, String type, String text, Date date, Boolean receiverDelete, Boolean senderDelete) {
       this.term = term;
       this.personByReceiverPersonId = personByReceiverPersonId;
       this.personBySenderPersonId = personBySenderPersonId;
       this.type = type;
       this.text = text;
       this.date = date;
       this.receiverDelete = receiverDelete;
       this.senderDelete = senderDelete;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Term getTerm() {
        return this.term;
    }
    
    public void setTerm(Term term) {
        this.term = term;
    }
    public Person getPersonByReceiverPersonId() {
        return this.personByReceiverPersonId;
    }
    
    public void setPersonByReceiverPersonId(Person personByReceiverPersonId) {
        this.personByReceiverPersonId = personByReceiverPersonId;
    }
    public Person getPersonBySenderPersonId() {
        return this.personBySenderPersonId;
    }
    
    public void setPersonBySenderPersonId(Person personBySenderPersonId) {
        this.personBySenderPersonId = personBySenderPersonId;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Boolean getReceiverDelete() {
        return this.receiverDelete;
    }
    
    public void setReceiverDelete(Boolean receiverDelete) {
        this.receiverDelete = receiverDelete;
    }
    public Boolean getSenderDelete() {
        return this.senderDelete;
    }
    
    public void setSenderDelete(Boolean senderDelete) {
        this.senderDelete = senderDelete;
    }




}


