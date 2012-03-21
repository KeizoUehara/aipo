package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTTimelineLike was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTTimelineLike extends org.apache.cayenne.CayenneDataObject {

    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String TIMELINE_ID_PROPERTY = "timelineId";
    public static final String EIP_TTIMELINE_PROPERTY = "eipTTimeline";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String TIMELINE_LIKE_ID_PK_COLUMN = "TIMELINE_LIKE_ID";

    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setTimelineId(Integer timelineId) {
        writeProperty("timelineId", timelineId);
    }
    public Integer getTimelineId() {
        return (Integer)readProperty("timelineId");
    }
    
    
    public void setEipTTimeline(com.aimluck.eip.cayenne.om.portlet.EipTTimeline eipTTimeline) {
        setToOneTarget("eipTTimeline", eipTTimeline, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTTimeline getEipTTimeline() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTTimeline)readProperty("eipTTimeline");
    } 
    
    
    public void setTurbineUser(com.aimluck.eip.cayenne.om.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUser getTurbineUser() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
