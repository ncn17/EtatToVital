package cg.ncn.entities.etatcivil;
// Generated 9 juil. 2019 12:51:51 by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Modifiedproperty generated by hbm2java
 */
@Entity
@Table( name = "modifiedproperty", catalog = "etatcivildb" )
public class Modifiedproperty implements java.io.Serializable {

    private Integer idmodifiedProperty;
    private Mention mention;
    private String  keyModified;
    private String  oldValue;
    private String  newValue;
    private String  flag;

    public Modifiedproperty() {
    }

    public Modifiedproperty( Mention mention, String keyModified, String oldValue, String newValue, String flag ) {
        this.mention = mention;
        this.keyModified = keyModified;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.flag = flag;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "IDModifiedProperty", unique = true, nullable = false )
    public Integer getIdmodifiedProperty() {
        return this.idmodifiedProperty;
    }

    public void setIdmodifiedProperty( Integer idmodifiedProperty ) {
        this.idmodifiedProperty = idmodifiedProperty;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDMention" )
    public Mention getMention() {
        return this.mention;
    }

    public void setMention( Mention mention ) {
        this.mention = mention;
    }

    @Column( name = "KeyModified" )
    public String getKeyModified() {
        return this.keyModified;
    }

    public void setKeyModified( String keyModified ) {
        this.keyModified = keyModified;
    }

    @Column( name = "OldValue" )
    public String getOldValue() {
        return this.oldValue;
    }

    public void setOldValue( String oldValue ) {
        this.oldValue = oldValue;
    }

    @Column( name = "NewValue" )
    public String getNewValue() {
        return this.newValue;
    }

    public void setNewValue( String newValue ) {
        this.newValue = newValue;
    }

    @Column( name = "Flag" )
    public String getFlag() {
        return this.flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

}