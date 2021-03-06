package cg.ncn.entities.etatcivil;
// Generated 9 juil. 2019 12:51:51 by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Person generated by hbm2java
 */
@Entity
@Table( name = "person", catalog = "etatcivildb" )
public class Person implements java.io.Serializable {

    private Integer     idperson;
    private Jobcategory jobcategory;
    private Person      personByIdfather;
    private Person      personByIdmother;
    private String      firstNameAr;
    private String      lastNameAr;
    private String      firstNameFr;
    private String      lastNameFr;
    private String      adressAr;
    private String      adressFr;
    private Integer     dayBirthGregorian;
    private Integer     monthBirthGregorian;
    private Integer     yearBirthGregorian;
    private Integer     dayBirthHijri;
    private Integer     monthBirthHijri;
    private Integer     yearBirthHijri;
    private String      birthPlaceAr;
    private String      birthPlaceFr;
    private String      gradeAr;
    private String      gradeFr;
    private String      nationalityAr;
    private String      nationalityFr;
    private String      jobAr;
    private String      jobFr;
    private String      cityResidenceAr;
    private String      cityResidenceFr;
    private Integer     gender;
    private Integer     isDead;
    private Integer     rank;
    private String      flag;
    private Set<Act>    acts               = new HashSet<Act>( 0 );
    private Set<Person> personsForIdfather = new HashSet<Person>( 0 );
    private Set<Person> personsForIdmother = new HashSet<Person>( 0 );

    public Person() {
    }

    public Person( Jobcategory jobcategory, Person personByIdfather, Person personByIdmother, String firstNameAr,
            String lastNameAr, String firstNameFr, String lastNameFr, String adressAr, String adressFr,
            Integer dayBirthGregorian, Integer monthBirthGregorian, Integer yearBirthGregorian, Integer dayBirthHijri,
            Integer monthBirthHijri, Integer yearBirthHijri, String birthPlaceAr, String birthPlaceFr, String gradeAr,
            String gradeFr, String nationalityAr, String nationalityFr, String jobAr, String jobFr,
            String cityResidenceAr, String cityResidenceFr, Integer gender, Integer isDead, Integer rank, String flag,
            Set<Act> acts, Set<Person> personsForIdfather, Set<Person> personsForIdmother ) {
        this.jobcategory = jobcategory;
        this.personByIdfather = personByIdfather;
        this.personByIdmother = personByIdmother;
        this.firstNameAr = firstNameAr;
        this.lastNameAr = lastNameAr;
        this.firstNameFr = firstNameFr;
        this.lastNameFr = lastNameFr;
        this.adressAr = adressAr;
        this.adressFr = adressFr;
        this.dayBirthGregorian = dayBirthGregorian;
        this.monthBirthGregorian = monthBirthGregorian;
        this.yearBirthGregorian = yearBirthGregorian;
        this.dayBirthHijri = dayBirthHijri;
        this.monthBirthHijri = monthBirthHijri;
        this.yearBirthHijri = yearBirthHijri;
        this.birthPlaceAr = birthPlaceAr;
        this.birthPlaceFr = birthPlaceFr;
        this.gradeAr = gradeAr;
        this.gradeFr = gradeFr;
        this.nationalityAr = nationalityAr;
        this.nationalityFr = nationalityFr;
        this.jobAr = jobAr;
        this.jobFr = jobFr;
        this.cityResidenceAr = cityResidenceAr;
        this.cityResidenceFr = cityResidenceFr;
        this.gender = gender;
        this.isDead = isDead;
        this.rank = rank;
        this.flag = flag;
        this.acts = acts;
        this.personsForIdfather = personsForIdfather;
        this.personsForIdmother = personsForIdmother;
    }

    @Id
    @GeneratedValue( strategy = IDENTITY )

    @Column( name = "IDPerson", unique = true, nullable = false )
    public Integer getIdperson() {
        return this.idperson;
    }

    public void setIdperson( Integer idperson ) {
        this.idperson = idperson;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "IDJobCategory" )
    public Jobcategory getJobcategory() {
        return this.jobcategory;
    }

    public void setJobcategory( Jobcategory jobcategory ) {
        this.jobcategory = jobcategory;
    }

    @ManyToOne( fetch = FetchType.EAGER )
    @JoinColumn( name = "IDFather" )
    public Person getPersonByIdfather() {
        return this.personByIdfather;
    }

    public void setPersonByIdfather( Person personByIdfather ) {
        this.personByIdfather = personByIdfather;
    }

    @ManyToOne( fetch = FetchType.EAGER )
    @JoinColumn( name = "IDMother" )
    public Person getPersonByIdmother() {
        return this.personByIdmother;
    }

    public void setPersonByIdmother( Person personByIdmother ) {
        this.personByIdmother = personByIdmother;
    }

    @Column( name = "FirstNameAr" )
    public String getFirstNameAr() {
        return this.firstNameAr;
    }

    public void setFirstNameAr( String firstNameAr ) {
        this.firstNameAr = firstNameAr;
    }

    @Column( name = "LastNameAr" )
    public String getLastNameAr() {
        return this.lastNameAr;
    }

    public void setLastNameAr( String lastNameAr ) {
        this.lastNameAr = lastNameAr;
    }

    @Column( name = "FirstNameFr" )
    public String getFirstNameFr() {
        return this.firstNameFr;
    }

    public void setFirstNameFr( String firstNameFr ) {
        this.firstNameFr = firstNameFr;
    }

    @Column( name = "LastNameFr" )
    public String getLastNameFr() {
        return this.lastNameFr;
    }

    public void setLastNameFr( String lastNameFr ) {
        this.lastNameFr = lastNameFr;
    }

    @Column( name = "AdressAr" )
    public String getAdressAr() {
        return this.adressAr;
    }

    public void setAdressAr( String adressAr ) {
        this.adressAr = adressAr;
    }

    @Column( name = "AdressFr" )
    public String getAdressFr() {
        return this.adressFr;
    }

    public void setAdressFr( String adressFr ) {
        this.adressFr = adressFr;
    }

    @Column( name = "DayBirthGregorian" )
    public Integer getDayBirthGregorian() {
        return this.dayBirthGregorian;
    }

    public void setDayBirthGregorian( Integer dayBirthGregorian ) {
        this.dayBirthGregorian = dayBirthGregorian;
    }

    @Column( name = "MonthBirthGregorian" )
    public Integer getMonthBirthGregorian() {
        return this.monthBirthGregorian;
    }

    public void setMonthBirthGregorian( Integer monthBirthGregorian ) {
        this.monthBirthGregorian = monthBirthGregorian;
    }

    @Column( name = "YearBirthGregorian" )
    public Integer getYearBirthGregorian() {
        return this.yearBirthGregorian;
    }

    public void setYearBirthGregorian( Integer yearBirthGregorian ) {
        this.yearBirthGregorian = yearBirthGregorian;
    }

    @Column( name = "DayBirthHijri" )
    public Integer getDayBirthHijri() {
        return this.dayBirthHijri;
    }

    public void setDayBirthHijri( Integer dayBirthHijri ) {
        this.dayBirthHijri = dayBirthHijri;
    }

    @Column( name = "MonthBirthHijri" )
    public Integer getMonthBirthHijri() {
        return this.monthBirthHijri;
    }

    public void setMonthBirthHijri( Integer monthBirthHijri ) {
        this.monthBirthHijri = monthBirthHijri;
    }

    @Column( name = "YearBirthHijri" )
    public Integer getYearBirthHijri() {
        return this.yearBirthHijri;
    }

    public void setYearBirthHijri( Integer yearBirthHijri ) {
        this.yearBirthHijri = yearBirthHijri;
    }

    @Column( name = "BirthPlaceAr" )
    public String getBirthPlaceAr() {
        return this.birthPlaceAr;
    }

    public void setBirthPlaceAr( String birthPlaceAr ) {
        this.birthPlaceAr = birthPlaceAr;
    }

    @Column( name = "BirthPlaceFr" )
    public String getBirthPlaceFr() {
        return this.birthPlaceFr;
    }

    public void setBirthPlaceFr( String birthPlaceFr ) {
        this.birthPlaceFr = birthPlaceFr;
    }

    @Column( name = "GradeAr" )
    public String getGradeAr() {
        return this.gradeAr;
    }

    public void setGradeAr( String gradeAr ) {
        this.gradeAr = gradeAr;
    }

    @Column( name = "GradeFr" )
    public String getGradeFr() {
        return this.gradeFr;
    }

    public void setGradeFr( String gradeFr ) {
        this.gradeFr = gradeFr;
    }

    @Column( name = "NationalityAr" )
    public String getNationalityAr() {
        return this.nationalityAr;
    }

    public void setNationalityAr( String nationalityAr ) {
        this.nationalityAr = nationalityAr;
    }

    @Column( name = "NationalityFr" )
    public String getNationalityFr() {
        return this.nationalityFr;
    }

    public void setNationalityFr( String nationalityFr ) {
        this.nationalityFr = nationalityFr;
    }

    @Column( name = "JobAr" )
    public String getJobAr() {
        return this.jobAr;
    }

    public void setJobAr( String jobAr ) {
        this.jobAr = jobAr;
    }

    @Column( name = "JobFr" )
    public String getJobFr() {
        return this.jobFr;
    }

    public void setJobFr( String jobFr ) {
        this.jobFr = jobFr;
    }

    @Column( name = "CityResidenceAr" )
    public String getCityResidenceAr() {
        return this.cityResidenceAr;
    }

    public void setCityResidenceAr( String cityResidenceAr ) {
        this.cityResidenceAr = cityResidenceAr;
    }

    @Column( name = "CityResidenceFr" )
    public String getCityResidenceFr() {
        return this.cityResidenceFr;
    }

    public void setCityResidenceFr( String cityResidenceFr ) {
        this.cityResidenceFr = cityResidenceFr;
    }

    @Column( name = "Gender" )
    public Integer getGender() {
        return this.gender;
    }

    public void setGender( Integer gender ) {
        this.gender = gender;
    }

    @Column( name = "IsDead" )
    public Integer getIsDead() {
        return this.isDead;
    }

    public void setIsDead( Integer isDead ) {
        this.isDead = isDead;
    }

    @Column( name = "Rank" )
    public Integer getRank() {
        return this.rank;
    }

    public void setRank( Integer rank ) {
        this.rank = rank;
    }

    @Column( name = "Flag" )
    public String getFlag() {
        return this.flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "person" )
    public Set<Act> getActs() {
        return this.acts;
    }

    public void setActs( Set<Act> acts ) {
        this.acts = acts;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "personByIdfather" )
    public Set<Person> getPersonsForIdfather() {
        return this.personsForIdfather;
    }

    public void setPersonsForIdfather( Set<Person> personsForIdfather ) {
        this.personsForIdfather = personsForIdfather;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "personByIdmother" )
    public Set<Person> getPersonsForIdmother() {
        return this.personsForIdmother;
    }

    public void setPersonsForIdmother( Set<Person> personsForIdmother ) {
        this.personsForIdmother = personsForIdmother;
    }

}
