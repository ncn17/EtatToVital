package cg.ncn.entities.vital;
// Generated 9 juil. 2019 13:24:07 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ChthibiAttachment generated by hbm2java
 */
@Entity
@Table( name = "chthibi_attachment", catalog = "vitalstatistics" )
public class ChthibiAttachment implements java.io.Serializable {

    private Integer id;
    private int     iddistrict;
    private int     idannex;
    private int     idregister;
    private int     actnumber;
    private int     actyeargeorgian;
    private int     idtype;
    private Date    dateinsertion;
    private String  comment;
    private String  extension;

    public ChthibiAttachment() {
    }

    public ChthibiAttachment( int iddistrict, int idannex, int idregister, int actnumber, int actyeargeorgian,
            int idtype, Date dateinsertion, String comment ) {
        this.iddistrict = iddistrict;
        this.idannex = idannex;
        this.idregister = idregister;
        this.actnumber = actnumber;
        this.actyeargeorgian = actyeargeorgian;
        this.idtype = idtype;
        this.dateinsertion = dateinsertion;
        this.comment = comment;
    }

    public ChthibiAttachment( int iddistrict, int idannex, int idregister, int actnumber, int actyeargeorgian,
            int idtype, Date dateinsertion, String comment, String extension ) {
        this.iddistrict = iddistrict;
        this.idannex = idannex;
        this.idregister = idregister;
        this.actnumber = actnumber;
        this.actyeargeorgian = actyeargeorgian;
        this.idtype = idtype;
        this.dateinsertion = dateinsertion;
        this.comment = comment;
        this.extension = extension;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "ID", unique = true, nullable = false )
    public Integer getId() {
        return this.id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    @Column( name = "IDDISTRICT", nullable = false )
    public int getIddistrict() {
        return this.iddistrict;
    }

    public void setIddistrict( int iddistrict ) {
        this.iddistrict = iddistrict;
    }

    @Column( name = "IDANNEX", nullable = false )
    public int getIdannex() {
        return this.idannex;
    }

    public void setIdannex( int idannex ) {
        this.idannex = idannex;
    }

    @Column( name = "IDREGISTER", nullable = false )
    public int getIdregister() {
        return this.idregister;
    }

    public void setIdregister( int idregister ) {
        this.idregister = idregister;
    }

    @Column( name = "ACTNUMBER", nullable = false )
    public int getActnumber() {
        return this.actnumber;
    }

    public void setActnumber( int actnumber ) {
        this.actnumber = actnumber;
    }

    @Column( name = "ACTYEARGEORGIAN", nullable = false )
    public int getActyeargeorgian() {
        return this.actyeargeorgian;
    }

    public void setActyeargeorgian( int actyeargeorgian ) {
        this.actyeargeorgian = actyeargeorgian;
    }

    @Column( name = "IDTYPE", nullable = false )
    public int getIdtype() {
        return this.idtype;
    }

    public void setIdtype( int idtype ) {
        this.idtype = idtype;
    }

    @Temporal( TemporalType.TIMESTAMP )
    @Column( name = "DATEINSERTION", nullable = false, length = 19 )
    public Date getDateinsertion() {
        return this.dateinsertion;
    }

    public void setDateinsertion( Date dateinsertion ) {
        this.dateinsertion = dateinsertion;
    }

    @Column( name = "COMMENT", nullable = false, length = 65535 )
    public String getComment() {
        return this.comment;
    }

    public void setComment( String comment ) {
        this.comment = comment;
    }

    @Column( name = "EXTENSION", length = 10 )
    public String getExtension() {
        return this.extension;
    }

    public void setExtension( String extension ) {
        this.extension = extension;
    }

}
