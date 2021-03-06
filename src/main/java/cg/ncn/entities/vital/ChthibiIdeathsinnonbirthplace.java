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
 * ChthibiIdeathsinnonbirthplace generated by hbm2java
 */
@Entity
@Table( name = "chthibi_ideathsinnonbirthplace", catalog = "vitalstatistics" )
public class ChthibiIdeathsinnonbirthplace implements java.io.Serializable {

    private Integer id;
    private int     idbirth;
    private int     idtype;
    private String  who;
    private String  act;
    private Integer year;
    private String  officer;
    private Date    date;
    private int     daygeorgianedition;
    private int     monthgeorgianedition;
    private int     yeargeorgianedition;
    private int     dayhijriedition;
    private int     monthhijriedition;
    private int     yearhijriedition;
    private int     iduser;
    private int     valid;
    private String  whofr;
    private String  officerfr;
    private String  mentionofficerar;
    private String  mentionofficerfr;
    private Integer deathdaygeorgian;
    private Integer deathmonthgeorgian;
    private Integer deathyeargeorgian;
    private Integer deathdayhijri;
    private Integer deathmonthhijri;
    private Integer deathyearhijri;
    private int     sentdaygeorgian;
    private int     sentmonthgeorgian;
    private int     sentyeargeorgian;
    private int     sentdayhijri;
    private int     sentmonthhijri;
    private int     sentyearhijri;

    public ChthibiIdeathsinnonbirthplace() {
    }

    public ChthibiIdeathsinnonbirthplace( int idbirth, int idtype, String who, String officer, int daygeorgianedition,
            int monthgeorgianedition, int yeargeorgianedition, int dayhijriedition, int monthhijriedition,
            int yearhijriedition, int iduser, int valid, int sentdaygeorgian, int sentmonthgeorgian,
            int sentyeargeorgian, int sentdayhijri, int sentmonthhijri, int sentyearhijri ) {
        this.idbirth = idbirth;
        this.idtype = idtype;
        this.who = who;
        this.officer = officer;
        this.daygeorgianedition = daygeorgianedition;
        this.monthgeorgianedition = monthgeorgianedition;
        this.yeargeorgianedition = yeargeorgianedition;
        this.dayhijriedition = dayhijriedition;
        this.monthhijriedition = monthhijriedition;
        this.yearhijriedition = yearhijriedition;
        this.iduser = iduser;
        this.valid = valid;
        this.sentdaygeorgian = sentdaygeorgian;
        this.sentmonthgeorgian = sentmonthgeorgian;
        this.sentyeargeorgian = sentyeargeorgian;
        this.sentdayhijri = sentdayhijri;
        this.sentmonthhijri = sentmonthhijri;
        this.sentyearhijri = sentyearhijri;
    }

    public ChthibiIdeathsinnonbirthplace( int idbirth, int idtype, String who, String act, Integer year, String officer,
            Date date, int daygeorgianedition, int monthgeorgianedition, int yeargeorgianedition, int dayhijriedition,
            int monthhijriedition, int yearhijriedition, int iduser, int valid, String whofr, String officerfr,
            String mentionofficerar, String mentionofficerfr, Integer deathdaygeorgian, Integer deathmonthgeorgian,
            Integer deathyeargeorgian, Integer deathdayhijri, Integer deathmonthhijri, Integer deathyearhijri,
            int sentdaygeorgian, int sentmonthgeorgian, int sentyeargeorgian, int sentdayhijri, int sentmonthhijri,
            int sentyearhijri ) {
        this.idbirth = idbirth;
        this.idtype = idtype;
        this.who = who;
        this.act = act;
        this.year = year;
        this.officer = officer;
        this.date = date;
        this.daygeorgianedition = daygeorgianedition;
        this.monthgeorgianedition = monthgeorgianedition;
        this.yeargeorgianedition = yeargeorgianedition;
        this.dayhijriedition = dayhijriedition;
        this.monthhijriedition = monthhijriedition;
        this.yearhijriedition = yearhijriedition;
        this.iduser = iduser;
        this.valid = valid;
        this.whofr = whofr;
        this.officerfr = officerfr;
        this.mentionofficerar = mentionofficerar;
        this.mentionofficerfr = mentionofficerfr;
        this.deathdaygeorgian = deathdaygeorgian;
        this.deathmonthgeorgian = deathmonthgeorgian;
        this.deathyeargeorgian = deathyeargeorgian;
        this.deathdayhijri = deathdayhijri;
        this.deathmonthhijri = deathmonthhijri;
        this.deathyearhijri = deathyearhijri;
        this.sentdaygeorgian = sentdaygeorgian;
        this.sentmonthgeorgian = sentmonthgeorgian;
        this.sentyeargeorgian = sentyeargeorgian;
        this.sentdayhijri = sentdayhijri;
        this.sentmonthhijri = sentmonthhijri;
        this.sentyearhijri = sentyearhijri;
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

    @Column( name = "WHO", nullable = false, length = 128 )
    public String getWho() {
        return this.who;
    }

    public void setWho( String who ) {
        this.who = who;
    }

    @Column( name = "ACT", length = 128 )
    public String getAct() {
        return this.act;
    }

    public void setAct( String act ) {
        this.act = act;
    }

    @Column( name = "YEAR" )
    public Integer getYear() {
        return this.year;
    }

    public void setYear( Integer year ) {
        this.year = year;
    }

    @Column( name = "OFFICER", nullable = false, length = 128 )
    public String getOfficer() {
        return this.officer;
    }

    public void setOfficer( String officer ) {
        this.officer = officer;
    }

    @Temporal( TemporalType.TIMESTAMP )
    @Column( name = "DATE", length = 19 )
    public Date getDate() {
        return this.date;
    }

    public void setDate( Date date ) {
        this.date = date;
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

    @Column( name = "WHOFR", length = 128 )
    public String getWhofr() {
        return this.whofr;
    }

    public void setWhofr( String whofr ) {
        this.whofr = whofr;
    }

    @Column( name = "OFFICERFR", length = 128 )
    public String getOfficerfr() {
        return this.officerfr;
    }

    public void setOfficerfr( String officerfr ) {
        this.officerfr = officerfr;
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

    @Column( name = "DEATHDAYGEORGIAN" )
    public Integer getDeathdaygeorgian() {
        return this.deathdaygeorgian;
    }

    public void setDeathdaygeorgian( Integer deathdaygeorgian ) {
        this.deathdaygeorgian = deathdaygeorgian;
    }

    @Column( name = "DEATHMONTHGEORGIAN" )
    public Integer getDeathmonthgeorgian() {
        return this.deathmonthgeorgian;
    }

    public void setDeathmonthgeorgian( Integer deathmonthgeorgian ) {
        this.deathmonthgeorgian = deathmonthgeorgian;
    }

    @Column( name = "DEATHYEARGEORGIAN" )
    public Integer getDeathyeargeorgian() {
        return this.deathyeargeorgian;
    }

    public void setDeathyeargeorgian( Integer deathyeargeorgian ) {
        this.deathyeargeorgian = deathyeargeorgian;
    }

    @Column( name = "DEATHDAYHIJRI" )
    public Integer getDeathdayhijri() {
        return this.deathdayhijri;
    }

    public void setDeathdayhijri( Integer deathdayhijri ) {
        this.deathdayhijri = deathdayhijri;
    }

    @Column( name = "DEATHMONTHHIJRI" )
    public Integer getDeathmonthhijri() {
        return this.deathmonthhijri;
    }

    public void setDeathmonthhijri( Integer deathmonthhijri ) {
        this.deathmonthhijri = deathmonthhijri;
    }

    @Column( name = "DEATHYEARHIJRI" )
    public Integer getDeathyearhijri() {
        return this.deathyearhijri;
    }

    public void setDeathyearhijri( Integer deathyearhijri ) {
        this.deathyearhijri = deathyearhijri;
    }

    @Column( name = "SENTDAYGEORGIAN", nullable = false )
    public int getSentdaygeorgian() {
        return this.sentdaygeorgian;
    }

    public void setSentdaygeorgian( int sentdaygeorgian ) {
        this.sentdaygeorgian = sentdaygeorgian;
    }

    @Column( name = "SENTMONTHGEORGIAN", nullable = false )
    public int getSentmonthgeorgian() {
        return this.sentmonthgeorgian;
    }

    public void setSentmonthgeorgian( int sentmonthgeorgian ) {
        this.sentmonthgeorgian = sentmonthgeorgian;
    }

    @Column( name = "SENTYEARGEORGIAN", nullable = false )
    public int getSentyeargeorgian() {
        return this.sentyeargeorgian;
    }

    public void setSentyeargeorgian( int sentyeargeorgian ) {
        this.sentyeargeorgian = sentyeargeorgian;
    }

    @Column( name = "SENTDAYHIJRI", nullable = false )
    public int getSentdayhijri() {
        return this.sentdayhijri;
    }

    public void setSentdayhijri( int sentdayhijri ) {
        this.sentdayhijri = sentdayhijri;
    }

    @Column( name = "SENTMONTHHIJRI", nullable = false )
    public int getSentmonthhijri() {
        return this.sentmonthhijri;
    }

    public void setSentmonthhijri( int sentmonthhijri ) {
        this.sentmonthhijri = sentmonthhijri;
    }

    @Column( name = "SENTYEARHIJRI", nullable = false )
    public int getSentyearhijri() {
        return this.sentyearhijri;
    }

    public void setSentyearhijri( int sentyearhijri ) {
        this.sentyearhijri = sentyearhijri;
    }

}
