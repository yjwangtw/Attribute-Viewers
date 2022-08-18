package com.attributeviewers.viewers.viewer;

import com.attributeviewers.viewers.main.Arg;
import com.attributeviewers.viewers.main.DBA;
import com.attributeviewers.viewers.rightbar.RightbarFrame;

import java.util.Map;

public abstract class Viewer {
    private DBA dba;
    private Integer userId;

    public Viewer(@Arg("dbId") Integer dbId, @Arg("userId") Integer userId) {
        this.dba = new DBA(dbId);
        this.userId = userId;
    }

    public RightbarFrame getRightbarFrame() {
        return null;
    }

    public abstract QueryRows getQueryData(Integer startRowNum, Integer endRowNum, Map<String, Object> options);
}
