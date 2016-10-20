/*
 * Created on 17 oct. 2016 ( Time 17:15:02 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package fr.lidadi.jee.eventmanager.dao.jpa;

import fr.lidadi.jee.eventmanager.dao.Entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "EVENT"
 *
 * @author Telosys Tools Generator
 *
 */

@javax.persistence.Entity
@Table(name="EVENT", schema="EVENTMANAGER" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="EventEntity.countAll", query="SELECT COUNT(x) FROM EventEntity x" ),
  @NamedQuery ( name="EventEntity.findAll", query="SELECT EE FROM EventEntity AS EE" )
} )
public class EventEntity implements Serializable, Entity {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Lob
    @Column(name="ID", nullable=false)
    private UUID id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", nullable=false, length=255)
    private String     name         ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="START_DATE")
    private Date       startDate    ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_DATE")
    private Date       endDate      ;

    @Temporal(TemporalType.DATE)
    @Column(name="PUBLISHING_DATE")
    private Date       publishingDate ;

    @Column(name="LOCATION", length=255)
    private String     location     ;

    @Temporal(TemporalType.DATE)
    @Column(name="UPDATED", nullable=false)
    private Date       updated      ;

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED", nullable=false)
    private Date       created      ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToMany(targetEntity=PersonnEntity.class)
    @JoinTable(name="EVENT_PERSONN_PARTICIPANTS", 
      joinColumns=@JoinColumn(name="EVENT_ID", referencedColumnName="ID"),
      inverseJoinColumns=@JoinColumn(name="PERSONN_ID", referencedColumnName="ID")
     ) 

    private List<PersonnEntity> listOfPersonn2;

    @OneToMany(mappedBy="event", targetEntity=SlugEntity.class)
    private List<SlugEntity> listOfSlug  ;

    @OneToMany(mappedBy="event", targetEntity=ParticipantEntity.class)
    private List<ParticipantEntity> listOfParticipant;

    @ManyToMany(targetEntity=PersonnEntity.class)
    @JoinTable(name="EVENT_PERSONN_OWNER", 
      joinColumns=@JoinColumn(name="EVENT_ID", referencedColumnName="ID"),
      inverseJoinColumns=@JoinColumn(name="PERSONN_ID", referencedColumnName="ID")
     ) 

    private List<PersonnEntity> listOfPersonn;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public EventEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( byte[] id ) {
        this.id = UUID.fromString(id.toString()) ;
    }
    public byte[] getId() {
        return this.id.toString().getBytes();
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : NAME ( VARCHAR ) 
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    //--- DATABASE MAPPING : START_DATE ( TIMESTAMP ) 
    public void setStartDate( Date startDate ) {
        this.startDate = startDate;
    }
    public Date getStartDate() {
        return this.startDate;
    }

    //--- DATABASE MAPPING : END_DATE ( TIMESTAMP ) 
    public void setEndDate( Date endDate ) {
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }

    //--- DATABASE MAPPING : PUBLISHING_DATE ( DATE ) 
    public void setPublishingDate( Date publishingDate ) {
        this.publishingDate = publishingDate;
    }
    public Date getPublishingDate() {
        return this.publishingDate;
    }

    //--- DATABASE MAPPING : LOCATION ( VARCHAR ) 
    public void setLocation( String location ) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    //--- DATABASE MAPPING : UPDATED ( DATE ) 
    public void setUpdated( Date updated ) {
        this.updated = updated;
    }
    public Date getUpdated() {
        return this.updated;
    }

    //--- DATABASE MAPPING : CREATED ( DATE ) 
    public void setCreated( Date created ) {
        this.created = created;
    }
    public Date getCreated() {
        return this.created;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfPersonn2( List<PersonnEntity> listOfPersonn2 ) {
        this.listOfPersonn2 = listOfPersonn2;
    }
    public List<PersonnEntity> getListOfPersonn2() {
        return this.listOfPersonn2;
    }

    public void setListOfSlug( List<SlugEntity> listOfSlug ) {
        this.listOfSlug = listOfSlug;
    }
    public List<SlugEntity> getListOfSlug() {
        return this.listOfSlug;
    }

    public void setListOfParticipant( List<ParticipantEntity> listOfParticipant ) {
        this.listOfParticipant = listOfParticipant;
    }
    public List<ParticipantEntity> getListOfParticipant() {
        return this.listOfParticipant;
    }

    public void setListOfPersonn( List<PersonnEntity> listOfPersonn ) {
        this.listOfPersonn = listOfPersonn;
    }
    public List<PersonnEntity> getListOfPersonn() {
        return this.listOfPersonn;
    }

    //----------------------------------------------------------------------
    // Get primary key
    //----------------------------------------------------------------------
    @Override
    public Object getPrimaryKey() {
        return getId();
    }

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        // attribute 'id' not usable (type = byte[])
        sb.append("]:"); 
        sb.append(name);
        sb.append("|");
        sb.append(startDate);
        sb.append("|");
        sb.append(endDate);
        sb.append("|");
        sb.append(publishingDate);
        sb.append("|");
        sb.append(location);
        sb.append("|");
        sb.append(updated);
        sb.append("|");
        sb.append(created);
        return sb.toString(); 
    } 

}