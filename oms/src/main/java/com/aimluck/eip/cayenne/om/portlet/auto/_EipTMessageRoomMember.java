package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTMessageRoomMember was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTMessageRoomMember extends org.apache.cayenne.CayenneDataObject {

    public static final String AUTHORITY_PROPERTY = "authority";
    public static final String LOGIN_NAME_PROPERTY = "loginName";
    public static final String TARGET_USER_ID_PROPERTY = "targetUserId";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TMESSAGE_ROOM_PROPERTY = "eipTMessageRoom";

    public static final String ID_PK_COLUMN = "ID";

    public void setAuthority(String authority) {
        writeProperty("authority", authority);
    }
    public String getAuthority() {
        return (String)readProperty("authority");
    }
    
    
    public void setLoginName(String loginName) {
        writeProperty("loginName", loginName);
    }
    public String getLoginName() {
        return (String)readProperty("loginName");
    }
    
    
    public void setTargetUserId(Integer targetUserId) {
        writeProperty("targetUserId", targetUserId);
    }
    public Integer getTargetUserId() {
        return (Integer)readProperty("targetUserId");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setEipTMessageRoom(com.aimluck.eip.cayenne.om.portlet.EipTMessageRoom eipTMessageRoom) {
        setToOneTarget("eipTMessageRoom", eipTMessageRoom, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTMessageRoom getEipTMessageRoom() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTMessageRoom)readProperty("eipTMessageRoom");
    } 
    
    
}
