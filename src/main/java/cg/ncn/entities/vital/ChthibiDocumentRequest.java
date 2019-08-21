package cg.ncn.entities.vital;
// Generated 9 juil. 2019 13:24:07 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ChthibiDocumentRequest generated by hbm2java
 */
@Entity
@Table( name = "chthibi_document_request", catalog = "vitalstatistics" )
public class ChthibiDocumentRequest implements java.io.Serializable {

    private Integer         id;
    private ChthibiAnnex    chthibiAnnex;
    private ChthibiDistrict chthibiDistrict;
    private ChthibiDocument chthibiDocument;
    private int             year;
    private String          lastnamefrench;
    private String          lastnamearabic;
    private String          firstnamefrench;
    private String          firstnamearabic;
    private String          email;
    private Date            date;
    private int             status;
    private int             number;
    private int             copies;

    public ChthibiDocumentRequest() {
    }

    public ChthibiDocumentRequest( ChthibiAnnex chthibiAnnex, ChthibiDistrict chthibiDistrict,
            ChthibiDocument chthibiDocument, int year, String lastnamefrench, String lastnamearabic,
            String firstnamefrench, String firstnamearabic, String email, Date date, int status, int number,
            int copies ) {
        this.chthibiAnnex = chthibiAnnex;
        this.chthibiDistrict = chthibiDistrict;
        this.chthibiDocument = chthibiDocument;
        this.year = year;
        this.lastnamefrench = lastnamefrench;
        this.lastnamearabic = lastnamearabic;
        this.firstnamefrench = firstnamefrench;
        this.firstnamearabic = firstnamearabic;
        this.email = email;
        this.date = date;
        this.status = status;
        this.number = number;
        this.copies = copies;
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

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDANNEX", nullable = false )
    public ChthibiAnnex getChthibiAnnex() {
        return this.chthibiAnnex;
    }

    public void setChthibiAnnex( ChthibiAnnex chthibiAnnex ) {
        this.chthibiAnnex = chthibiAnnex;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDDISTRICT", nullable = false )
    public ChthibiDistrict getChthibiDistrict() {
        return this.chthibiDistrict;
    }

    public void setChthibiDistrict( ChthibiDistrict chthibiDistrict ) {
        this.chthibiDistrict = chthibiDistrict;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDDOCUMENT", nullable = false )
    public ChthibiDocument getChthibiDocument() {
        return this.chthibiDocument;
    }

    public void setChthibiDocument( ChthibiDocument chthibiDocument ) {
        this.chthibiDocument = chthibiDocument;
    }

    @Column( name = "YEAR", nullable = false )
    public int getYear() {
        return this.year;
    }

    public void setYear( int year ) {
        this.year = year;
    }

    @Column( name = "LASTNAMEFRENCH", nullable = false, length = 128 )
    public String getLastnamefrench() {
        return this.lastnamefrench;
    }

    public void setLastnamefrench( String lastnamefrench ) {
        this.lastnamefrench = lastnamefrench;
    }

    @Column( name = "LASTNAMEARABIC", nullable = false, length = 128 )
    public String getLastnamearabic() {
        return this.lastnamearabic;
    }

    public void setLastnamearabic( String lastnamearabic ) {
        this.lastnamearabic = lastnamearabic;
    }

    @Column( name = "FIRSTNAMEFRENCH", nullable = false, length = 128 )
    public String getFirstnamefrench() {
        return this.firstnamefrench;
    }

    public void setFirstnamefrench( String firstnamefrench ) {
        this.firstnamefrench = firstnamefrench;
    }

    @Column( name = "FIRSTNAMEARABIC", nullable = false, length = 128 )
    public String getFirstnamearabic() {
        return this.firstnamearabic;
    }

    public void setFirstnamearabic( String firstnamearabic ) {
        this.firstnamearabic = firstnamearabic;
    }

    @Column( name = "EMAIL", nullable = false, length = 128 )
    public String getEmail() {
        return this.email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    @Temporal( TemporalType.TIMESTAMP )
    @Column( name = "DATE", nullable = false, length = 19 )
    public Date getDate() {
        return this.date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    @Column( name = "STATUS", nullable = false )
    public int getStatus() {
        return this.status;
    }

    public void setStatus( int status ) {
        this.status = status;
    }

    @Column( name = "NUMBER", nullable = false )
    public int getNumber() {
        return this.number;
    }

    public void setNumber( int number ) {
        this.number = number;
    }

    @Column( name = "COPIES", nullable = false )
    public int getCopies() {
        return this.copies;
    }

    public void setCopies( int copies ) {
        this.copies = copies;
    }

}