package entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * author:wangzhongzhong
 * time:  2018/3/6
 */
public class Chart implements Serializable {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private String createDate;

    private Integer count;

    public Chart(String date, Integer count) {
        this.createDate = date;
        this.count = count;
    }

    public Chart() {
    }

    public String getDate() {
        return createDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setDate(String date) {
        this.createDate = date;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chart)) return false;

        Chart chart = (Chart) o;

        return getId() != null ? getId().equals(chart.getId()) : chart.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chart{");
        sb.append("id=").append(id);
        sb.append(", date=").append(createDate);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }


}
