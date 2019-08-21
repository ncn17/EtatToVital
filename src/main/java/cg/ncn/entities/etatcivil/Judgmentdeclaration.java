package cg.ncn.entities.etatcivil;
// Generated 9 juil. 2019 12:51:51 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Judgmentdeclaration generated by hbm2java
 */
@Entity
@Table( name = "judgmentdeclaration", catalog = "etatcivildb" )
public class Judgmentdeclaration implements java.io.Serializable {

    private int     idjudgmentDeclaration;
    private String  file;
    private String  judgmentNumber;
    private String  orderNumber;
    private String  permissionNumber;
    private String  courtAr;
    private String  courtFr;
    private Integer informationDayGregorian;
    private Integer informationMonthGregorian;
    private Integer informationYearGregorian;
    private Integer informationDayHijri;
    private Integer informationMonthHijri;
    private Integer informationYearHijri;
    private String  flag;

    public Judgmentdeclaration() {
    }

    public Judgmentdeclaration( int idjudgmentDeclaration ) {
        this.idjudgmentDeclaration = idjudgmentDeclaration;
    }

    public Judgmentdeclaration( int idjudgmentDeclaration, String file, String judgmentNumber, String orderNumber,
            String permissionNumber, String courtAr, String courtFr, Integer informationDayGregorian,
            Integer informationMonthGregorian, Integer informationYearGregorian, Integer informationDayHijri,
            Integer informationMonthHijri, Integer informationYearHijri, String flag ) {
        this.idjudgmentDeclaration = idjudgmentDeclaration;
        this.file = file;
        this.judgmentNumber = judgmentNumber;
        this.orderNumber = orderNumber;
        this.permissionNumber = permissionNumber;
        this.courtAr = courtAr;
        this.courtFr = courtFr;
        this.informationDayGregorian = informationDayGregorian;
        this.informationMonthGregorian = informationMonthGregorian;
        this.informationYearGregorian = informationYearGregorian;
        this.informationDayHijri = informationDayHijri;
        this.informationMonthHijri = informationMonthHijri;
        this.informationYearHijri = informationYearHijri;
        this.flag = flag;
    }

    @Id

    @Column( name = "IDJudgmentDeclaration", unique = true, nullable = false )
    public int getIdjudgmentDeclaration() {
        return this.idjudgmentDeclaration;
    }

    public void setIdjudgmentDeclaration( int idjudgmentDeclaration ) {
        this.idjudgmentDeclaration = idjudgmentDeclaration;
    }

    @Column( name = "File" )
    public String getFile() {
        return this.file;
    }

    public void setFile( String file ) {
        this.file = file;
    }

    @Column( name = "JudgmentNumber" )
    public String getJudgmentNumber() {
        return this.judgmentNumber;
    }

    public void setJudgmentNumber( String judgmentNumber ) {
        this.judgmentNumber = judgmentNumber;
    }

    @Column( name = "OrderNumber" )
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber( String orderNumber ) {
        this.orderNumber = orderNumber;
    }

    @Column( name = "PermissionNumber" )
    public String getPermissionNumber() {
        return this.permissionNumber;
    }

    public void setPermissionNumber( String permissionNumber ) {
        this.permissionNumber = permissionNumber;
    }

    @Column( name = "CourtAr" )
    public String getCourtAr() {
        return this.courtAr;
    }

    public void setCourtAr( String courtAr ) {
        this.courtAr = courtAr;
    }

    @Column( name = "CourtFr" )
    public String getCourtFr() {
        return this.courtFr;
    }

    public void setCourtFr( String courtFr ) {
        this.courtFr = courtFr;
    }

    @Column( name = "InformationDayGregorian" )
    public Integer getInformationDayGregorian() {
        return this.informationDayGregorian;
    }

    public void setInformationDayGregorian( Integer informationDayGregorian ) {
        this.informationDayGregorian = informationDayGregorian;
    }

    @Column( name = "InformationMonthGregorian" )
    public Integer getInformationMonthGregorian() {
        return this.informationMonthGregorian;
    }

    public void setInformationMonthGregorian( Integer informationMonthGregorian ) {
        this.informationMonthGregorian = informationMonthGregorian;
    }

    @Column( name = "InformationYearGregorian" )
    public Integer getInformationYearGregorian() {
        return this.informationYearGregorian;
    }

    public void setInformationYearGregorian( Integer informationYearGregorian ) {
        this.informationYearGregorian = informationYearGregorian;
    }

    @Column( name = "InformationDayHijri" )
    public Integer getInformationDayHijri() {
        return this.informationDayHijri;
    }

    public void setInformationDayHijri( Integer informationDayHijri ) {
        this.informationDayHijri = informationDayHijri;
    }

    @Column( name = "InformationMonthHijri" )
    public Integer getInformationMonthHijri() {
        return this.informationMonthHijri;
    }

    public void setInformationMonthHijri( Integer informationMonthHijri ) {
        this.informationMonthHijri = informationMonthHijri;
    }

    @Column( name = "InformationYearHijri" )
    public Integer getInformationYearHijri() {
        return this.informationYearHijri;
    }

    public void setInformationYearHijri( Integer informationYearHijri ) {
        this.informationYearHijri = informationYearHijri;
    }

    @Column( name = "Flag", length = 45 )
    public String getFlag() {
        return this.flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

}
