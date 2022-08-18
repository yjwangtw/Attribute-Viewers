package com.attributeviewers.viewers;

import com.attributeviewers.viewers.viewer.locationsviewer.LocationsViewer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/viewer")
public class ViewerController {
    @GetMapping(value="/LocationsViewer/welcome")
    public String printWelcome(){
        return LocationsViewer.printWelcome();
    }

    @GetMapping(value="/LocationsViewer")
    public LocationsViewer locationsViewer(Integer dbId, Integer userId){
        return new LocationsViewer(dbId, userId);
    }
}
