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
 * ChthibiIchangeparentname generated by hbm2java
 */
@Entity
@Table( name = "chthibi_ichangeparentname", catalog = "vitalstatistics" )
public class ChthibiIchangeparentname implements java.io.Serializable {

    private Integer id;
    private String  oldarabic;
    private String  newarabic;
    private int     who;
    private String  act;
    private String  actbyarabic;
    private int     actday;
    private int     actmonth;
    private int     actyear;
    private String  publiwherearabic;
    private int     publiday;
    private int     publimonth;
    private int     publiyear;
    private int     editdaygeorgian;
    private int     editmonthgeorgian;
    private int     edityeargeorgian;
    private int     editdayhijri;
    private int     editmonthhijri;
    private int     edityearhijri;
    private String  mentionofficerar;
    private String  mentionofficerfr;
    private String  oldfrench;
    private String  newfrench;
    private String  actbyfrench;
    private String  publiwherefrench;
    private int     idbirth;
    private int     iduser;
    private int     valid;
    private Date    date;
    private int     idtype;

    public ChthibiIchangeparentname() {
    }

    public ChthibiIchangeparentname( String oldarabic, String newarabic, int who, String act, String actbyarabic,
            int actday, int actmonth, int actyear, String publiwherearabic, int publiday, int publimonth, int publiyear,
            int editdaygeorgian, int editmonthgeorgian, int edityeargeorgian, int editdayhijri, int editmonthhijri,
            int edityearhijri, String oldfrench, String newfrench, String actbyfrench, int idbirth, int iduser,
            int valid, int idtype ) {
        this.oldarabic = oldarabic;
        this.newarabic = newarabic;
        this.who = who;
        this.act = act;
        this.actbyarabic = actbyarabic;
        this.actday = actday;
        this.actmonth = actmonth;
        this.actyear = actyear;
        this.publiwherearabic = publiwherearabic;
        this.publiday = publiday;
        this.publimonth = publimonth;
        this.publiyear = publiyear;
        this.editdaygeorgian = editdaygeorgian;
        this.editmonthgeorgian = editmonthgeorgian;
        this.edityeargeorgian = edityeargeorgian;
        this.editdayhijri = editdayhijri;
        this.editmonthhijri = editmonthhijri;
        this.edityearhijri = edityearhijri;
        this.oldfrench = oldfrench;
        this.newfrench = newfrench;
        this.actbyfrench = actbyfrench;
        this.idbirth = idbirth;
        this.iduser = iduser;
        this.valid = valid;
        this.idtype = idtype;
    }

    public ChthibiIchangeparentname( String oldarabic, String newarabic, int who, String act, String actbyarabic,
            int actday, int actmonth, int actyear, String publiwherearabic, int publiday, int publimonth, int publiyear,
            int editdaygeorgian, int editmonthgeorgian, int edityeargeorgian, int editdayhijri, int editmonthhijri,
            int edityearhijri, String mentionofficerar, String mentionofficerfr, String oldfrench, String newfrench,
            String actbyfrench, String publiwherefrench, int idbirth, int iduser, int valid, Date date, int idtype ) {
        this.oldarabic = oldarabic;
        this.newarabic = newarabic;
        this.who = who;
        this.act = act;
        this.actbyarabic = actbyarabic;
        this.actday = actday;
        this.actmonth = actmonth;
        this.actyear = actyear;
        this.publiwherearabic = publiwherearabic;
        this.publiday = publiday;
        this.publimonth = publimonth;
        this.publiyear = publiyear;
        this.editdaygeorgian = editdaygeorgian;
        this.editmonthgeorgian = editmonthgeorgian;
        this.edityeargeorgian = edityeargeorgian;
        this.editdayhijri = editdayhijri;
        this.editmonthhijri = editmonthhijri;
        this.edityearhijri = edityearhijri;
        this.mentionofficerar = mentionofficerar;
        this.mentionofficerfr = mentionofficerfr;
        this.oldfrench = oldfrench;
        this.newfrench = newfrench;
        this.actbyfrench = actbyfrench;
        this.publiwherefrench = publiwherefrench;
        this.idbirth = idbirth;
        this.iduser = iduser;
        this.valid = valid;
        this.date = date;
        this.idtype = idtype;
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

    @Column( name = "OLDARABIC", nullable = false, length = 256 )
    public String getOldarabic() {
        return this.oldarabic;
    }

    public void setOldarabic( String oldarabic ) {
        this.oldarabic = oldarabic;
    }

    @Column( name = "NEWARABIC", nullable = false, length = 256 )
    public String getNewarabic() {
        return this.newarabic;
    }

    public void setNewarabic( String newarabic ) {
        this.newarabic = newarabic;
    }

    @Column( name = "WHO", nullable = false )
    public int getWho() {
        return this.who;
    }

    public void setWho( int who ) {
        this.who = who;
    }

    @Column( name = "ACT", nullable = false, length = 128 )
    public String getAct() {
        return this.act;
    }

    public void setAct( String act ) {
        this.act = act;
    }

    @Column( name = "ACTBYARABIC", nullable = false, length = 128 )
    public String getActbyarabic() {
        return this.actbyarabic;
    }

    public void setActbyarabic( String actbyarabic ) {
        this.actbyarabic = actbyarabic;
    }

    @Column( name = "ACTDAY", nullable = false )
    public int getActday() {
        return this.actday;
    }

    public void setActday( int actday ) {
        this.actday = actday;
    }

    @Column( name = "ACTMONTH", nullable = false )
    public int getActmonth() {
        return this.actmonth;
    }

    public void setActmonth( int actmonth ) {
        this.actmonth = actmonth;
    }

    @Column( name = "ACTYEAR", nullable = false )
    public int getActyear() {
        return this.actyear;
    }

    public void setActyear( int actyear ) {
        this.actyear = actyear;
    }

    @Column( name = "PUBLIWHEREARABIC", nullable = false, length = 256 )
    public String getPubliwherearabic() {
        return this.publiwherearabic;
    }

    public void setPubliwherearabic( String publiwherearabic ) {
        this.publiwherearabic = publiwherearabic;
    }

    @Column( name = "PUBLIDAY", nullable = false )
    public int getPubliday() {
        return this.publiday;
    }

    public void setPubliday( int publiday ) {
        this.publiday = publiday;
    }

    @Column( name = "PUBLIMONTH", nullable = false )
    public int getPublimonth() {
        return this.publimonth;
    }

    public void setPublimonth( int publimonth ) {
        this.publimonth = publimonth;
    }

    @Column( name = "PUBLIYEAR", nullable = false )
    public int getPubliyear() {
        return this.publiyear;
    }

    public void setPubliyear( int publiyear ) {
        this.publiyear = publiyear;
    }

    @Column( name = "EDITDAYGEORGIAN", nullable = false )
    public int getEditdaygeorgian() {
        return this.editdaygeorgian;
    }

    public void setEditdaygeorgian( int editdaygeorgian ) {
        this.editdaygeorgian = editdaygeorgian;
    }

    @Column( name = "EDITMONTHGEORGIAN", nullable = false )
    public int getEditmonthgeorgian() {
        return this.editmonthgeorgian;
    }

    public void setEditmonthgeorgian( int editmonthgeorgian ) {
        this.editmonthgeorgian = editmonthgeorgian;
    }

    @Column( name = "EDITYEARGEORGIAN", nullable = false )
    public int getEdityeargeorgian() {
        return this.edityeargeorgian;
    }

    public void setEdityeargeorgian( int edityeargeorgian ) {
        this.edityeargeorgian = edityeargeorgian;
    }

    @Column( name = "EDITDAYHIJRI", nullable = false )
    public int getEditdayhijri() {
        return this.editdayhijri;
    }

    public void setEditdayhijri( int editdayhijri ) {
        this.editdayhijri = editdayhijri;
    }

    @Column( name = "EDITMONTHHIJRI", nullable = false )
    public int getEditmonthhijri() {
        return this.editmonthhijri;
    }

    public void setEditmonthhijri( int editmonthhijri ) {
        this.editmonthhijri = editmonthhijri;
    }

    @Column( name = "EDITYEARHIJRI", nullable = false )
    public int getEdityearhijri() {
        return this.edityearhijri;
    }

    public void setEdityearhijri( int edityearhijri ) {
        this.edityearhijri = edityearhijri;
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

    @Column( name = "OLDFRENCH", nullable = false, length = 256 )
    public String getOldfrench() {
        return this.oldfrench;
    }

    public void setOldfrench( String oldfrench ) {
        this.oldfrench = oldfrench;
    }

    @Column( name = "NEWFRENCH", nullable = false, length = 256 )
    public String getNewfrench() {
        return this.newfrench;
    }

    public void setNewfrench( String newfrench ) {
        this.newfrench = newfrench;
    }

    @Column( name = "ACTBYFRENCH", nullable = false, length = 128 )
    public String getActbyfrench() {
        return this.actbyfrench;
    }

    public void setActbyfrench( String actbyfrench ) {
        this.actbyfrench = actbyfrench;
    }

    @Column( name = "PUBLIWHEREFRENCH", length = 256 )
    public String getPubliwherefrench() {
        return this.publiwherefrench;
    }

    public void setPubliwherefrench( String publiwherefrench ) {
        this.publiwherefrench = publiwherefrench;
    }

    @Column( name = "IDBIRTH", nullable = false )
    public int getIdbirth() {
        return this.idbirth;
    }

    public void setIdbirth( int idbirth ) {
        this.idbirth = idbirth;
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

    @Temporal( TemporalType.TIMESTAMP )
    @Column( name = "DATE", length = 19 )
    public Date getDate() {
        return this.date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    @Column( name = "IDTYPE", nullable = false )
    public int getIdtype() {
        return this.idtype;
    }

    public void setIdtype( int idtype ) {
        this.idtype = idtype;
    }

}
