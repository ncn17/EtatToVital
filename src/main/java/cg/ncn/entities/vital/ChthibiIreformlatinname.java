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
 * ChthibiIreformlatinname generated by hbm2java
 */
@Entity
@Table( name = "chthibi_ireformlatinname", catalog = "vitalstatistics" )
public class ChthibiIreformlatinname implements java.io.Serializable {

    private Integer id;
    private int     idbirth;
    private int     idtype;
    private int     field;
    private String  act;
    private String  by;
    private String  old;
    private String  new_;
    private Date    date;
    private int     daygeorgian;
    private int     monthgeorgian;
    private int     yeargeorgian;
    private int     dayhijri;
    private int     monthhijri;
    private int     yearhijri;
    private int     daygeorgianedition;
    private int     monthgeorgianedition;
    private int     yeargeorgianedition;
    private int     dayhijriedition;
    private int     monthhijriedition;
    private int     yearhijriedition;
    private int     iduser;
    private int     valid;
    private String  acttype;
    private String  byfr;
    private String  mentionofficerar;
    private String  mentionofficerfr;
    private int     reformtype;
    private String  acttypefr;

    public ChthibiIreformlatinname() {
    }

    public ChthibiIreformlatinname( int idbirth, int idtype, int field, String act, String by, String old, String new_,
            int daygeorgian, int monthgeorgian, int yeargeorgian, int dayhijri, int monthhijri, int yearhijri,
            int daygeorgianedition, int monthgeorgianedition, int yeargeorgianedition, int dayhijriedition,
            int monthhijriedition, int yearhijriedition, int iduser, int valid, String acttype, int reformtype,
            String acttypefr ) {
        this.idbirth = idbirth;
        this.idtype = idtype;
        this.field = field;
        this.act = act;
        this.by = by;
        this.old = old;
        this.new_ = new_;
        this.daygeorgian = daygeorgian;
        this.monthgeorgian = monthgeorgian;
        this.yeargeorgian = yeargeorgian;
        this.dayhijri = dayhijri;
        this.monthhijri = monthhijri;
        this.yearhijri = yearhijri;
        this.daygeorgianedition = daygeorgianedition;
        this.monthgeorgianedition = monthgeorgianedition;
        this.yeargeorgianedition = yeargeorgianedition;
        this.dayhijriedition = dayhijriedition;
        this.monthhijriedition = monthhijriedition;
        this.yearhijriedition = yearhijriedition;
        this.iduser = iduser;
        this.valid = valid;
        this.acttype = acttype;
        this.reformtype = reformtype;
        this.acttypefr = acttypefr;
    }

    public ChthibiIreformlatinname( int idbirth, int idtype, int field, String act, String by, String old, String new_,
            Date date, int daygeorgian, int monthgeorgian, int yeargeorgian, int dayhijri, int monthhijri,
            int yearhijri, int daygeorgianedition, int monthgeorgianedition, int yeargeorgianedition,
            int dayhijriedition, int monthhijriedition, int yearhijriedition, int iduser, int valid, String acttype,
            String byfr, String mentionofficerar, String mentionofficerfr, int reformtype, String acttypefr ) {
        this.idbirth = idbirth;
        this.idtype = idtype;
        this.field = field;
        this.act = act;
        this.by = by;
        this.old = old;
        this.new_ = new_;
        this.date = date;
        this.daygeorgian = daygeorgian;
        this.monthgeorgian = monthgeorgian;
        this.yeargeorgian = yeargeorgian;
        this.dayhijri = dayhijri;
        this.monthhijri = monthhijri;
        this.yearhijri = yearhijri;
        this.daygeorgianedition = daygeorgianedition;
        this.monthgeorgianedition = monthgeorgianedition;
        this.yeargeorgianedition = yeargeorgianedition;
        this.dayhijriedition = dayhijriedition;
        this.monthhijriedition = monthhijriedition;
        this.yearhijriedition = yearhijriedition;
        this.iduser = iduser;
        this.valid = valid;
        this.acttype = acttype;
        this.byfr = byfr;
        this.mentionofficerar = mentionofficerar;
        this.mentionofficerfr = mentionofficerfr;
        this.reformtype = reformtype;
        this.acttypefr = acttypefr;
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

    @Column( name = "FIELD", nullable = false )
    public int getField() {
        return this.field;
    }

    public void setField( int field ) {
        this.field = field;
    }

    @Column( name = "ACT", nullable = false, length = 128 )
    public String getAct() {
        return this.act;
    }

    public void setAct( String act ) {
        this.act = act;
    }

    @Column( name = "BY", nullable = false, length = 128 )
    public String getBy() {
        return this.by;
    }

    public void setBy( String by ) {
        this.by = by;
    }

    @Column( name = "OLD", nullable = false, length = 128 )
    public String getOld() {
        return this.old;
    }

    public void setOld( String old ) {
        this.old = old;
    }

    @Column( name = "NEW", nullable = false, length = 128 )
    public String getNew_() {
        return this.new_;
    }

    public void setNew_( String new_ ) {
        this.new_ = new_;
    }

    @Temporal( TemporalType.TIMESTAMP )
    @Column( name = "DATE", length = 19 )
    public Date getDate() {
        return this.date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    @Column( name = "DAYGEORGIAN", nullable = false )
    public int getDaygeorgian() {
        return this.daygeorgian;
    }

    public void setDaygeorgian( int daygeorgian ) {
        this.daygeorgian = daygeorgian;
    }

    @Column( name = "MONTHGEORGIAN", nullable = false )
    public int getMonthgeorgian() {
        return this.monthgeorgian;
    }

    public void setMonthgeorgian( int monthgeorgian ) {
        this.monthgeorgian = monthgeorgian;
    }

    @Column( name = "YEARGEORGIAN", nullable = false )
    public int getYeargeorgian() {
        return this.yeargeorgian;
    }

    public void setYeargeorgian( int yeargeorgian ) {
        this.yeargeorgian = yeargeorgian;
    }

    @Column( name = "DAYHIJRI", nullable = false )
    public int getDayhijri() {
        return this.dayhijri;
    }

    public void setDayhijri( int dayhijri ) {
        this.dayhijri = dayhijri;
    }

    @Column( name = "MONTHHIJRI", nullable = false )
    public int getMonthhijri() {
        return this.monthhijri;
    }

    public void setMonthhijri( int monthhijri ) {
        this.monthhijri = monthhijri;
    }

    @Column( name = "YEARHIJRI", nullable = false )
    public int getYearhijri() {
        return this.yearhijri;
    }

    public void setYearhijri( int yearhijri ) {
        this.yearhijri = yearhijri;
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

    @Column( name = "ACTTYPE", nullable = false, length = 128 )
    public String getActtype() {
        return this.acttype;
    }

    public void setActtype( String acttype ) {
        this.acttype = acttype;
    }

    @Column( name = "BYFR", length = 128 )
    public String getByfr() {
        return this.byfr;
    }

    public void setByfr( String byfr ) {
        this.byfr = byfr;
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

    @Column( name = "REFORMTYPE", nullable = false )
    public int getReformtype() {
        return this.reformtype;
    }

    public void setReformtype( int reformtype ) {
        this.reformtype = reformtype;
    }

    @Column( name = "ACTTYPEFR", nullable = false, length = 128 )
    public String getActtypefr() {
        return this.acttypefr;
    }

    public void setActtypefr( String acttypefr ) {
        this.acttypefr = acttypefr;
    }

}
