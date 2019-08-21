package cg.ncn.entities.etatcivil;
// Generated 9 juil. 2019 12:51:51 by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Print generated by hbm2java
 */
@Entity
@Table( name = "print", catalog = "etatcivildb" )
public class Print implements java.io.Serializable {

    private Integer  idprint;
    private Document document;
    private User     user;
    private Integer  copies;
    private Date     date;
    private String   flag;

    public Print() {
    }

    public Print( Document document, User user, Integer copies, Date date, String flag ) {
        this.document = document;
        this.user = user;
        this.copies = copies;
        this.date = date;
        this.flag = flag;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "IDPrint", unique = true, nullable = false )
    public Integer getIdprint() {
        return this.idprint;
    }

    public void setIdprint( Integer idprint ) {
        this.idprint = idprint;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDDocument" )
    public Document getDocument() {
        return this.document;
    }

    public void setDocument( Document document ) {
        this.document = document;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDUser" )
    public User getUser() {
        return this.user;
    }

    public void setUser( User user ) {
        this.user = user;
    }

    @Column( name = "Copies" )
    public Integer getCopies() {
        return this.copies;
    }

    public void setCopies( Integer copies ) {
        this.copies = copies;
    }

    @Temporal( TemporalType.TIMESTAMP )
    @Column( name = "Date", length = 19 )
    public Date getDate() {
        return this.date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    @Column( name = "Flag" )
    public String getFlag() {
        return this.flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

}