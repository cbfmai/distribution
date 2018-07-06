package com.mmtech.distribution.server.wechat.entity;

import java.io.Serializable;
import java.util.Date;

public class WechatQrcode implements Serializable {
    private Long id;

    private String actionName;

    private String actionInfo;

    private Integer sceneId;

    private String sceneStr;

    private String ticket;

    private String url;

    private String dataId;

    private String dataType;

    private String dataExpression;

    private String dataMsg;

    private Date expireTime;

    private Long createdUserId;

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public String getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(String actionInfo) {
        this.actionInfo = actionInfo == null ? null : actionInfo.trim();
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneStr() {
        return sceneStr;
    }

    public void setSceneStr(String sceneStr) {
        this.sceneStr = sceneStr == null ? null : sceneStr.trim();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getDataExpression() {
        return dataExpression;
    }

    public void setDataExpression(String dataExpression) {
        this.dataExpression = dataExpression == null ? null : dataExpression.trim();
    }

    public String getDataMsg() {
        return dataMsg;
    }

    public void setDataMsg(String dataMsg) {
        this.dataMsg = dataMsg == null ? null : dataMsg.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}