package com.cskaoyan.bean;

/**
 * 质量管理表操作结果类
 */
import java.util.List;

public class QualityManageVo {
    private int total;
    private List<UnqualifyApply> rows;

    @Override
    public String toString() {
        return "QualityManageVo{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<UnqualifyApply> getRows() {
        return rows;
    }

    public void setRows(List<UnqualifyApply> rows) {
        this.rows = rows;
    }
}
