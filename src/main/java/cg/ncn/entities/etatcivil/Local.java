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
 * Local generated by hbm2java
 */
@Entity
@Table( name = "local", catalog = "etatcivildb" )
public class Local implements java.io.Serializable {

    private Integer   idlocal;
    private String    localAr;
    private String    localFr;
    private String    flag;
    private Set<User> users = new HashSet<User>( 0 );

    public Local() {
    }

    public Local( String localAr, String localFr, String flag, Set<User> users ) {
        this.localAr = localAr;
        this.localFr = localFr;
        this.flag = flag;
        this.users = users;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "IDLocal", unique = true, nullable = false )
    public Integer getIdlocal() {
        return this.idlocal;
    }

    public void setIdlocal( Integer idlocal ) {
        this.idlocal = idlocal;
    }

    @Column( name = "LocalAr" )
    public String getLocalAr() {
        return this.localAr;
    }

    public void setLocalAr( String localAr ) {
        this.localAr = localAr;
    }

    @Column( name = "LocalFr" )
    public String getLocalFr() {
        return this.localFr;
    }

    public void setLocalFr( String localFr ) {
        this.localFr = localFr;
    }

    @Column( name = "Flag" )
    public String getFlag() {
        return this.flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "local" )
    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers( Set<User> users ) {
        this.users = users;
    }

}