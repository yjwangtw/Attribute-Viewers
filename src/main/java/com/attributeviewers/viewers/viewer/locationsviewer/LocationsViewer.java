package com.attributeviewers.viewers.viewer.locationsviewer;

import com.attributeviewers.viewers.main.Arg;
import com.attributeviewers.viewers.main.DBA;
import com.attributeviewers.viewers.rightbar.RightbarFrame;
import com.attributeviewers.viewers.viewer.*;

import java.util.Map;

public class LocationsViewer extends Viewer {
    private DBA dba;
    private Integer userId;
    public LocationsViewer(@Arg("dbId") Integer dbId, @Arg("userId") Integer userId) {
        super(dbId, userId);
        this.dba = new DBA(dbId);
    }

    @Override
    public RightbarFrame getRightbarFrame() {
        return RightbarFrame.of()
                .toggle("isShowPermClosed", "Show Permanently Closed", true);
    }

    @Override
    public QueryRows getQueryData(Integer startRowNum, Integer endRowNum, Map<String, Object> options) {
        Boolean isShowClosed = (Boolean) options.get("isShowPermClosed");
        return dba.queryTable("locations", startRowNum, endRowNum)
                .apply(!isShowClosed, "where locations.status != " + LocationStatus.PERMCLOSE)
                .execute(userId);
    }

    public static String printWelcome() {
        return "Welcome to Locations Viewer";
    }
}
