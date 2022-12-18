/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SeenamZaSodaSingha
 */
@Entity
@Table(name = "WEEKLY_DEATH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WeeklyDeath.findAll", query = "SELECT w FROM WeeklyDeath w"),
    @NamedQuery(name = "WeeklyDeath.findBySeq", query = "SELECT w FROM WeeklyDeath w WHERE w.seq = :seq"),
    @NamedQuery(name = "WeeklyDeath.findByYear", query = "SELECT w FROM WeeklyDeath w WHERE w.year = :year"),
    @NamedQuery(name = "WeeklyDeath.findByWeeknum", query = "SELECT w FROM WeeklyDeath w WHERE w.weeknum = :weeknum"),
    @NamedQuery(name = "WeeklyDeath.findByProvince", query = "SELECT w FROM WeeklyDeath w WHERE w.province = :province"),
    @NamedQuery(name = "WeeklyDeath.findByAge", query = "SELECT w FROM WeeklyDeath w WHERE w.age = :age"),
    @NamedQuery(name = "WeeklyDeath.findByAgeRange", query = "SELECT w FROM WeeklyDeath w WHERE w.ageRange = :ageRange"),
    @NamedQuery(name = "WeeklyDeath.findByOccupation", query = "SELECT w FROM WeeklyDeath w WHERE w.occupation = :occupation"),
    @NamedQuery(name = "WeeklyDeath.findByType", query = "SELECT w FROM WeeklyDeath w WHERE w.type = :type"),
    @NamedQuery(name = "WeeklyDeath.findByDeathCluster", query = "SELECT w FROM WeeklyDeath w WHERE w.deathCluster = :deathCluster"),
    @NamedQuery(name = "WeeklyDeath.findByUpdateDate", query = "SELECT w FROM WeeklyDeath w WHERE w.updateDate = :updateDate")})
public class WeeklyDeath implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEQ")
    private Integer seq;
    @Column(name = "YEAR__")
    private Integer year;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Size(max = 255)
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 255)
    @Column(name = "AGE_RANGE")
    private String ageRange;
    @Size(max = 255)
    @Column(name = "OCCUPATION")
    private String occupation;
    @Size(max = 255)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 255)
    @Column(name = "DEATH_CLUSTER")
    private String deathCluster;
    @Size(max = 255)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public WeeklyDeath() {
    }

    public WeeklyDeath(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeathCluster() {
        return deathCluster;
    }

    public void setDeathCluster(String deathCluster) {
        this.deathCluster = deathCluster;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WeeklyDeath)) {
            return false;
        }
        WeeklyDeath other = (WeeklyDeath) object;
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.WeeklyDeath[ seq=" + seq + " ]";
    }
    
}
