package application.app.com.active_test1.daoEntity;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

@Table(name = "datos", id = "_id")
public class Datos extends Model {

    @Column(name = "integer")
    private Integer integer;
    @Column(name = "real")
    private Double real;
    @Column(name = "text")
    private String text;
    @Column(name = "numDate")
    private Date numDate;
    @Column(name = "numBool")
    private Boolean numBool;

    public Datos() {
    }

    public Datos(Integer integer, Double real, String text, Date numDate, Boolean numBool) {
        this.integer = integer;
        this.real = real;
        this.text = text;
        this.numDate = numDate;
        this.numBool = numBool;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getNumDate() {
        return numDate;
    }

    public void setNumDate(Date numDate) {
        this.numDate = numDate;
    }

    public Boolean getNumBool() {
        return numBool;
    }

    public void setNumBool(Boolean numBool) {
        this.numBool = numBool;
    }

    @Override
    public String toString() {
        return  integer +
                " " + real +
                " " + text + '\'' +
                " " + numDate +
                " " + numBool ;
    }
}
