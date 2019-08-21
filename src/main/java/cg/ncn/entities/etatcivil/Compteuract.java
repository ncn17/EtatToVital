package cg.ncn.entities.etatcivil;
// Generated 9 juil. 2019 12:51:51 by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Compteuract generated by hbm2java
 */
@Entity
@Table( name = "compteuract", catalog = "etatcivildb" )
public class Compteuract implements java.io.Serializable {

    private Integer idcompteur;
    private Integer idBirth;

    public Compteuract() {
    }

    public Compteuract( Integer idBirth ) {
        this.idBirth = idBirth;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "idcompteur", unique = true, nullable = false )
    public Integer getIdcompteur() {
        return this.idcompteur;
    }

    public void setIdcompteur( Integer idcompteur ) {
        this.idcompteur = idcompteur;
    }

    @Column( name = "idBirth" )
    public Integer getIdBirth() {
        return this.idBirth;
    }

    public void setIdBirth( Integer idBirth ) {
        this.idBirth = idBirth;
    }

}
