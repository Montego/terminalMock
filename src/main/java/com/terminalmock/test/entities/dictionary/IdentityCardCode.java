package com.terminalmock.test.entities.dictionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"D_IdentityCardTable\"")
public class IdentityCardCode {
    @Id
    @Column(name = "\"IdentityCardCode\"")
    private String identityCardCode;
    @Column(name = "\"IdentityCardNamemiddle\"")
    private String identityCardNamemiddle;
    @Column(name = "\"IdentityCardNameFull\"")
    private String identityCardNameFull;
    @Column(name = "\"IdentityCardNameShort\"")
    private String identityCardNameShort;
    @Column(name = "\"isUniversity\"")
    private int isUniversity;
    @Column(name = "\"isMandatory_Number\"")
    private int isMandatory_Number;
    @Column(name = "\"isMandatory_Series\"")
    private int isMandatory_Series;
    @Column(name = "\"Sort\"")
    private int sort;

    public IdentityCardCode() {
    }

    //конструктор для информативного заполения JSON
    public IdentityCardCode(boolean defValues) {

        if (defValues) {
            this.identityCardCode       = "";
            this.identityCardNamemiddle = "";
            this.identityCardNameFull   = "";
            this.identityCardNameShort  = "";
            this.isUniversity           = -1;
            this.isMandatory_Number     = -1;
            this.isMandatory_Series     = -1;
            this.sort                   = -1;
        }
    }

    public String getIdentityCardCode() {
        return this.identityCardCode;
    }

    public String getIdentityCardNamemiddle() {
        return this.identityCardNamemiddle;
    }

    public String getIdentityCardNameFull() {
        return this.identityCardNameFull;
    }

    public String getIdentityCardNameShort() {
        return this.identityCardNameShort;
    }

    public int getIsUniversity() {
        return this.isUniversity;
    }

    public int getIsMandatory_Number() {
        return this.isMandatory_Number;
    }

    public int getIsMandatory_Series() {
        return this.isMandatory_Series;
    }

    public int getSort() {
        return this.sort;
    }

    public void setIdentityCardCode(String identityCardCode) {
        this.identityCardCode = identityCardCode;
    }

    public void setIdentityCardNamemiddle(String identityCardNamemiddle) {
        this.identityCardNamemiddle = identityCardNamemiddle;
    }

    public void setIdentityCardNameFull(String identityCardNameFull) {
        this.identityCardNameFull = identityCardNameFull;
    }

    public void setIdentityCardNameShort(String identityCardNameShort) {
        this.identityCardNameShort = identityCardNameShort;
    }

    public void setIsUniversity(int isUniversity) {
        this.isUniversity = isUniversity;
    }

    public void setIsMandatory_Number(int isMandatory_Number) {
        this.isMandatory_Number = isMandatory_Number;
    }

    public void setIsMandatory_Series(int isMandatory_Series) {
        this.isMandatory_Series = isMandatory_Series;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IdentityCardCode)) return false;
        final IdentityCardCode other = (IdentityCardCode) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$identityCardCode = this.getIdentityCardCode();
        final Object other$identityCardCode = other.getIdentityCardCode();
        if (this$identityCardCode == null ? other$identityCardCode != null : !this$identityCardCode.equals(other$identityCardCode))
            return false;
        final Object this$identityCardNamemiddle = this.getIdentityCardNamemiddle();
        final Object other$identityCardNamemiddle = other.getIdentityCardNamemiddle();
        if (this$identityCardNamemiddle == null ? other$identityCardNamemiddle != null : !this$identityCardNamemiddle.equals(other$identityCardNamemiddle))
            return false;
        final Object this$identityCardNameFull = this.getIdentityCardNameFull();
        final Object other$identityCardNameFull = other.getIdentityCardNameFull();
        if (this$identityCardNameFull == null ? other$identityCardNameFull != null : !this$identityCardNameFull.equals(other$identityCardNameFull))
            return false;
        final Object this$identityCardNameShort = this.getIdentityCardNameShort();
        final Object other$identityCardNameShort = other.getIdentityCardNameShort();
        if (this$identityCardNameShort == null ? other$identityCardNameShort != null : !this$identityCardNameShort.equals(other$identityCardNameShort))
            return false;
        if (this.getIsUniversity() != other.getIsUniversity()) return false;
        if (this.getIsMandatory_Number() != other.getIsMandatory_Number()) return false;
        if (this.getIsMandatory_Series() != other.getIsMandatory_Series()) return false;
        if (this.getSort() != other.getSort()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IdentityCardCode;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $identityCardCode = this.getIdentityCardCode();
        result = result * PRIME + ($identityCardCode == null ? 43 : $identityCardCode.hashCode());
        final Object $identityCardNamemiddle = this.getIdentityCardNamemiddle();
        result = result * PRIME + ($identityCardNamemiddle == null ? 43 : $identityCardNamemiddle.hashCode());
        final Object $identityCardNameFull = this.getIdentityCardNameFull();
        result = result * PRIME + ($identityCardNameFull == null ? 43 : $identityCardNameFull.hashCode());
        final Object $identityCardNameShort = this.getIdentityCardNameShort();
        result = result * PRIME + ($identityCardNameShort == null ? 43 : $identityCardNameShort.hashCode());
        result = result * PRIME + this.getIsUniversity();
        result = result * PRIME + this.getIsMandatory_Number();
        result = result * PRIME + this.getIsMandatory_Series();
        result = result * PRIME + this.getSort();
        return result;
    }

    public String toString() {
        return "IdentityCardCode(identityCardCode=" + this.getIdentityCardCode() + ", identityCardNamemiddle=" + this.getIdentityCardNamemiddle() + ", identityCardNameFull=" + this.getIdentityCardNameFull() + ", identityCardNameShort=" + this.getIdentityCardNameShort() + ", isUniversity=" + this.getIsUniversity() + ", isMandatory_Number=" + this.getIsMandatory_Number() + ", isMandatory_Series=" + this.getIsMandatory_Series() + ", sort=" + this.getSort() + ")";
    }
}
