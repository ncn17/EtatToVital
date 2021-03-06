package cg.ncn.entities.vital;
// Generated 9 juil. 2019 13:24:07 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ChthibiProfile generated by hbm2java
 */
@Entity
@Table( name = "chthibi_profile", catalog = "vitalstatistics" )
public class ChthibiProfile implements java.io.Serializable {

    private Integer id;
    private String  labelfrench;
    private String  labelarabic;
    private int     flag;

    public ChthibiProfile() {
    }

    public ChthibiProfile( int flag ) {
        this.flag = flag;
    }

    public ChthibiProfile( String labelfrench, String labelarabic, int flag ) {
        this.labelfrench = labelfrench;
        this.labelarabic = labelarabic;
        this.flag = flag;
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

}
