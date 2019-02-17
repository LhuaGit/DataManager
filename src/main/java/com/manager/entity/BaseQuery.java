package com.manager.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lhua
 * @date 2019/1/29.
 */
public class BaseQuery implements Serializable {

    private int pageNo = 1;

    private int pageSize = 10;


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if (pageNo != null) {
            this.pageNo = pageNo;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null) {
            this.pageSize = pageSize;
        }
    }


}
