package com.spartronics4915.frc2019.paths;

import java.util.ArrayList;
import java.util.List;

import com.spartronics4915.frc2019.paths.PathBuilder.Waypoint;
import com.spartronics4915.lib.control.Path;
import com.spartronics4915.lib.math.Pose2d;
import com.spartronics4915.lib.math.Rotation2d;
import com.spartronics4915.lib.math.Translation2d;

public class CrossBaselinePath implements PathContainer {

    ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();

    public CrossBaselinePath()
    {
        sWaypoints.add(new Waypoint(18,45,0,0));
        sWaypoints.add(new Waypoint(180,45,0,60));

    }

    @Override
    public Path buildPath()
    {
        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }

    @Override
    public List<Waypoint> getWaypoints()
    {
        return sWaypoints;
    }

    @Override
    public Pose2d getStartPose()
    {
        return new Pose2d(new Translation2d(18, 45), Rotation2d.fromDegrees(90.0));
    }

    @Override
    public boolean isReversed()
    {
        return false;
    }
    // WAYPOINT_DATA: [{"position":{"x":18,"y":45},"speed":0,"radius":0,"comment":""},{"position":{"x":180,"y":45},"speed":60,"radius":0,"comment":""}]
    // IS_REVERSED: false
    // FILE_NAME: CrossBaselinePath
}