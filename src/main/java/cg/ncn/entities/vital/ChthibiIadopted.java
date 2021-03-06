package cg.ncn.entities.vital;
// Generated 9 juil. 2019 13:24:07 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ChthibiIadopted generated by hbm2java
 */
@Entity
@Table( name = "chthibi_iadopted", catalog = "vitalstatistics" )
public class ChthibiIadopted implements java.io.Serializable {

    private Integer id;
    private int     idbirth;
    private int     idtype;
    private String  content;
    private int     daygeorgianedition;
    private int     monthgeorgianedition;
    private int     yeargeorgianedition;
    private int     dayhijriedition;
    private int     monthhijriedition;
    private int     yearhijriedition;
    private int     iduser;
    private int     valid;
    private String  contentfr;
    private String  mentionofficerar;
    private String  mentionofficerfr;

    public ChthibiIadopted() {
    }

    public ChthibiIadopted( int idbirth, int idtype, String content, int daygeorgianedition, int monthgeorgianedition,
            int yeargeorgianedition, int dayhijriedition, int monthhijriedition, int yearhijriedition, int iduser,
            int valid ) {
        this.idbirth = idbirth;
        this.idtype = idtype;
        this.content = content;
        this.daygeorgianedition = daygeorgianedition;
        this.monthgeorgianedition = monthgeorgianedition;
        this.yeargeorgianedition = yeargeorgianedition;
        this.dayhijriedition = dayhijriedition;
        this.monthhijriedition = monthhijriedition;
        this.yearhijriedition = yearhijriedition;
        this.iduser = iduser;
        this.valid = valid;
    }

    public ChthibiIadopted( int idbirth, int idtype, String content, int daygeorgianedition, int monthgeorgianedition,
            int yeargeorgianedition, int dayhijriedition, int monthhijriedition, int yearhijriedition, int iduser,
            int valid, String contentfr, String mentionofficerar, String mentionofficerfr ) {
        this.idbirth = idbirth;
        this.idtype = idtype;
        this.content = content;
        this.daygeorgianedition = daygeorgianedition;
        this.monthgeorgianedition = monthgeorgianedition;
        this.yeargeorgianedition = yeargeorgianedition;
        this.dayhijriedition = dayhijriedition;
        this.monthhijriedition = monthhijriedition;
        this.yearhijriedition = yearhijriedition;
        this.iduser = iduser;
        this.valid = valid;
        this.contentfr = contentfr;
        this.mentionofficerar = mentionofficerar;
        this.mentionofficerfr = mentionofficerfr;
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

    @Column( name = "IDBIRTH", nullable = false )
    public int getIdbirth() {
        return this.idbirth;
    }

    public void setIdbirth( int idbirth ) {
        this.idbirth = idbirth;
    }

    @Column( name = "IDTYPE", nullable = false )
    public int getIdtype() {
        return this.idtype;
    }

    public void setIdtype( int idtype ) {
        this.idtype = idtype;
    }

    @Column( name = "CONTENT", nullable = false, length = 65535 )
    public String getContent() {
        return this.content;
    }

    public void setContent( String content ) {
        this.content = content;
    }

    @Column( name = "DAYGEORGIANEDITION", nullable = false )
    public int getDaygeorgianedition() {
        return this.daygeorgianedition;
    }

    public void setDaygeorgianedition( int daygeorgianedition ) {
        this.daygeorgianedition = daygeorgianedition;
    }

    @Column( name = "MONTHGEORGIANEDITION", nullable = false )
    public int getMonthgeorgianedition() {
        return this.monthgeorgianedition;
    }

    public void setMonthgeorgianedition( int monthgeorgianedition ) {
        this.monthgeorgianedition = monthgeorgianedition;
    }

    @Column( name = "YEARGEORGIANEDITION", nullable = false )
    public int getYeargeorgianedition() {
        return this.yeargeorgianedition;
    }

    public void setYeargeorgianedition( int yeargeorgianedition ) {
        this.yeargeorgianedition = yeargeorgianedition;
    }

    @Column( name = "DAYHIJRIEDITION", nullable = false )
    public int getDayhijriedition() {
        return this.dayhijriedition;
    }

    public void setDayhijriedition( int dayhijriedition ) {
        this.dayhijriedition = dayhijriedition;
    }

    @Column( name = "MONTHHIJRIEDITION", nullable = false )
    public int getMonthhijriedition() {
        return this.monthhijriedition;
    }

    public void setMonthhijriedition( int monthhijriedition ) {
        this.monthhijriedition = monthhijriedition;
    }

    @Column( name = "YEARHIJRIEDITION", nullable = false )
    public int getYearhijriedition() {
        return this.yearhijriedition;
    }

    public void setYearhijriedition( int yearhijriedition ) {
        this.yearhijriedition = yearhijriedition;
    }

    @Column( name = "IDUSER", nullable = false )
    public int getIduser() {
        return this.iduser;
    }

    public void setIduser( int iduser ) {
        this.iduser = iduser;
    }

    @Column( name = "VALID", nullable = false )
    public int getValid() {
        return this.valid;
    }

    public void setValid( int valid ) {
        this.valid = valid;
    }

    @Column( name = "CONTENTFR", length = 65535 )
    public String getContentfr() {
        return this.contentfr;
    }

    public void setContentfr( String contentfr ) {
        this.contentfr = contentfr;
    }

    @Column( name = "MENTIONOFFICERAR", length = 128 )
    public String getMentionofficerar() {
        return this.mentionofficerar;
    }

    public void setMentionofficerar( String mentionofficerar ) {
        this.mentionofficerar = mentionofficerar;
    }

    @Column( name = "MENTIONOFFICERFR", length = 128 )
    public String getMentionofficerfr() {
        return this.mentionofficerfr;
    }

    public void setMentionofficerfr( String mentionofficerfr ) {
        this.mentionofficerfr = mentionofficerfr;
    }

}
