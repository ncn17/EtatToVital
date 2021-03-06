package cg.ncn.entities.vital;
// Generated 9 juil. 2019 13:24:07 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ChthibiConfig generated by hbm2java
 */
@Entity
@Table( name = "chthibi_config", catalog = "vitalstatistics", uniqueConstraints = @UniqueConstraint( columnNames = "NAME" ) )
public class ChthibiConfig implements java.io.Serializable {

    private Integer id;
    private String  name;
    private String  content;

    public ChthibiConfig() {
    }

    public ChthibiConfig( String name, String content ) {
        this.name = name;
        this.content = content;
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

    @Column( name = "NAME", unique = true, nullable = false, length = 45 )
    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Column( name = "CONTENT", nullable = false, length = 45 )
    public String getContent() {
        return this.content;
    }

    public void setContent( String content ) {
        this.content = content;
    }

}
