package com.attributeviewers.viewers.main;

import com.attributeviewers.viewers.viewer.QueryRows;

public class DBA {
    private Integer dbaId;

    public DBA(Integer dbaId) {
        this.dbaId = dbaId;
    }

    public DBA queryTable(String tableName, Integer startRowNum, Integer endRowNum) {
        return this;
    }

    public DBA apply(Boolean isTrue, String sql) {
        return this;
    }

    public QueryRows execute(Integer userId) {
        return new QueryRows();
    }
}
