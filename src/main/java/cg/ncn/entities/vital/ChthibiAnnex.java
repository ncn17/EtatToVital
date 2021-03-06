package cg.ncn.entities.vital;
// Generated 9 juil. 2019 13:24:07 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ChthibiAnnex generated by hbm2java
 */
@Entity
@Table( name = "chthibi_annex", catalog = "vitalstatistics" )
public class ChthibiAnnex implements java.io.Serializable {

    private Integer                     id;
    private int                         iddistrict;
    private String                      labelfrench;
    private String                      labelarabic;
    private int                         flag;
    private int                         defaultbirth;
    private int                         defaultdeath;
    private int                         defaultresident;
    private Set<ChthibiBirth>           chthibiBirths           = new HashSet<ChthibiBirth>( 0 );
    private Set<ChthibiDocumentRequest> chthibiDocumentRequests = new HashSet<ChthibiDocumentRequest>( 0 );

    public ChthibiAnnex() {
    }

    public ChthibiAnnex( int iddistrict, int flag, int defaultbirth, int defaultdeath, int defaultresident ) {
        this.iddistrict = iddistrict;
        this.flag = flag;
        this.defaultbirth = defaultbirth;
        this.defaultdeath = defaultdeath;
        this.defaultresident = defaultresident;
    }

    public ChthibiAnnex( int iddistrict, String labelfrench, String labelarabic, int flag, int defaultbirth,
            int defaultdeath, int defaultresident, Set<ChthibiBirth> chthibiBirths,
            Set<ChthibiDocumentRequest> chthibiDocumentRequests ) {
        this.iddistrict = iddistrict;
        this.labelfrench = labelfrench;
        this.labelarabic = labelarabic;
        this.flag = flag;
        this.defaultbirth = defaultbirth;
        this.defaultdeath = defaultdeath;
        this.defaultresident = defaultresident;
        this.chthibiBirths = chthibiBirths;
        this.chthibiDocumentRequests = chthibiDocumentRequests;
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

    @Column( name = "LABELFRENCH", length = 64 )
    public String getLabelfrench() {
        return this.labelfrench;
    }

    public void setLabelfrench( String labelfrench ) {
        this.labelfrench = labelfrench;
    }

    @Column( name = "LABELARABIC", length = 64 )
    public String getLabelarabic() {
        return this.labelarabic;
    }

    public void setLabelarabic( String labelarabic ) {
        this.labelarabic = labelarabic;
    }

    @Column( name = "FLAG", nullable = false )
    public int getFlag() {
        return this.flag;
    }

    public void setFlag( int flag ) {
        this.flag = flag;
    }

    @Column( name = "DEFAULTBIRTH", nullable = false )
    public int getDefaultbirth() {
        return this.defaultbirth;
    }

    public void setDefaultbirth( int defaultbirth ) {
        this.defaultbirth = defaultbirth;
    }

    @Column( name = "DEFAULTDEATH", nullable = false )
    public int getDefaultdeath() {
        return this.defaultdeath;
    }

    public void setDefaultdeath( int defaultdeath ) {
        this.defaultdeath = defaultdeath;
    }

    @Column( name = "DEFAULTRESIDENT", nullable = false )
    public int getDefaultresident() {
        return this.defaultresident;
    }

    public void setDefaultresident( int defaultresident ) {
        this.defaultresident = defaultresident;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "chthibiAnnex" )
    public Set<ChthibiBirth> getChthibiBirths() {
        return this.chthibiBirths;
    }

    public void setChthibiBirths( Set<ChthibiBirth> chthibiBirths ) {
        this.chthibiBirths = chthibiBirths;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "chthibiAnnex" )
    public Set<ChthibiDocumentRequest> getChthibiDocumentRequests() {
        return this.chthibiDocumentRequests;
    }

    public void setChthibiDocumentRequests( Set<ChthibiDocumentRequest> chthibiDocumentRequests ) {
        this.chthibiDocumentRequests = chthibiDocumentRequests;
    }

}
