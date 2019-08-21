package cg.ncn.entities.etatcivil;
// Generated 9 juil. 2019 12:51:51 by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Profile generated by hbm2java
 */
@Entity
@Table( name = "profile", catalog = "etatcivildb" )
public class Profile implements java.io.Serializable {

    private Integer   idprofile;
    private String    labelAr;
    private String    labelFr;
    private String    flag;
    private Set<User> users = new HashSet<User>( 0 );

    public Profile() {
    }

    public Profile( String labelAr, String labelFr, String flag, Set<User> users ) {
        this.labelAr = labelAr;
        this.labelFr = labelFr;
        this.flag = flag;
        this.users = users;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "IDProfile", unique = true, nullable = false )
    public Integer getIdprofile() {
        return this.idprofile;
    }

    public void setIdprofile( Integer idprofile ) {
        this.idprofile = idprofile;
    }

    @Column( name = "LabelAr" )
    public String getLabelAr() {
        return this.labelAr;
    }

    public void setLabelAr( String labelAr ) {
        this.labelAr = labelAr;
    }

    @Column( name = "LabelFr" )
    public String getLabelFr() {
        return this.labelFr;
    }

    public void setLabelFr( String labelFr ) {
        this.labelFr = labelFr;
    }

    @Column( name = "Flag" )
    public String getFlag() {
        return this.flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "profile" )
    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers( Set<User> users ) {
        this.users = users;
    }

}
