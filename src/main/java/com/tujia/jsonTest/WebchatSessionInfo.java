package com.tujia.jsonTest;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by lidongw_1 on 2018/10/30.
 */
public class WebchatSessionInfo {

    /**
     * 主键
     */
    @JsonProperty("id")
    @org.codehaus.jackson.annotate.JsonProperty("id")
    @JsonFilter("id")
    private int id;
    /**
     * 第三方主键
     */
    @JsonProperty("_id")
    @org.codehaus.jackson.annotate.JsonProperty("_id")
    @JsonFilter("_id")
    private String _id;
    /**
     * 访客id
     */
    private String sid;
    /**
     * 类型，默认webchat 在线客服
     */
    private String type;
    /**
     * 状态
     undeal待领取
     deal 已领取
     finish 已关闭
     changePeer 已流转
     */
    private String status;
    /**
     * 账户编号
     */
    private String account;
    /**
     * 实际的创建时间
     */
    private Date createTime;
    /**
     * 客户植入七陌代码中的accessId的值
     */
    private String accessId;
    /**
     * 平台来源
     pc 网站咨询
     wap wap咨询
     sdk app咨询
     weixin 微信咨询
     */
    private String platform;
    /**
     * 用户名称
     */
    private String sName;
    /**
     * 客户Id(没有关联客户返回“NA”)
     */
    private String customerId;
    /**
     * 搜索来源
     */
    private String seoSource;
    /**
     * 关键字
     */
    private String seoKeywords;
    /**
     * IP地址
     */
    private String ip;
    /**
     * 咨询页面url值
     */
    private String fromUrl;
    /**
     * 咨询页面title
     */
    private String urlTitle;
    /**
     * 地域
     */
    private String area;
    /**
     * 	所属技能组
     */
    private String toPeer;
    /**
     * 人工开始时间 时间戳
     */
    private long manualTime;
    /**
     * 	所属坐席
     */
    private String user;
    /**
     * 最后领取时间 时间戳
     */
    private Date lastClaimTime;
    /**
     * 坐席领取时间 格式 yyyy-MM-dd hh:mm:ss
     */
    private Date beginTime;
    /**
     * 坐席领取时间 时间戳
     */
    private Date agentClaimTime;
    /**
     * 坐席最后一下回复的时间
     */
    private Date lastAgentMsgTimeStamp;
    /**
     * 	第一次回复的时间
     */
    private Date firstReplyTime;
    /**
     * 客服回复消息数
     */
    private int replyMsgCount;
    /**
     * 	消息总数
     */
    private int totalMsgCount;
    /**
     * 	客户发送消息数
     */
    private int msgCount;
    /**
     * 客户最后一条消息的时间
     */
    private Date lastCustomerMsgTimeStamp;
    /**
     * 	流转前坐席
     */
    private String fromUser;
    /**
     * 	上次转接|抢接|转技能组时间
     */
    private Date lastRedirectTime;
    /**
     * 	流转前技能组
     */
    private String previousPeer;
    /**
     * 所属坐席名称
     */
    private String username;
    /**
     * 直接转坐席的时间
     */
    private Date lastRedirectUserTime;
    /**
     * 客户开始等待的时间戳
     */
    private Date startCustomerWaitTimeStamp;
    /**
     * 备注
     */
    private String remark;
    /**
     * 	结束类型
     */
    private String finishReason;
    /**
     * 	结束坐席
     */
    private String finishUser;
    /**
     * 	会话结束时间
     */
    private Date endTime;
    /**
     * 	扩展字段中数据
     */
    private String otherParams;
    /**
     * 本记录创建时间
     */
    private DateTime rcreatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSeoSource() {
        return seoSource;
    }

    public void setSeoSource(String seoSource) {
        this.seoSource = seoSource;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

    public String getUrlTitle() {
        return urlTitle;
    }

    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getToPeer() {
        return toPeer;
    }

    public void setToPeer(String toPeer) {
        this.toPeer = toPeer;
    }

    public long getManualTime() {
        return manualTime;
    }

    public void setManualTime(long manualTime) {
        this.manualTime = manualTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getLastClaimTime() {
        return lastClaimTime;
    }

    public void setLastClaimTime(Date lastClaimTime) {
        this.lastClaimTime = lastClaimTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getAgentClaimTime() {
        return agentClaimTime;
    }

    public void setAgentClaimTime(Date agentClaimTime) {
        this.agentClaimTime = agentClaimTime;
    }

    public Date getLastAgentMsgTimeStamp() {
        return lastAgentMsgTimeStamp;
    }

    public void setLastAgentMsgTimeStamp(Date lastAgentMsgTimeStamp) {
        this.lastAgentMsgTimeStamp = lastAgentMsgTimeStamp;
    }

    public Date getFirstReplyTime() {
        return firstReplyTime;
    }

    public void setFirstReplyTime(Date firstReplyTime) {
        this.firstReplyTime = firstReplyTime;
    }

    public int getReplyMsgCount() {
        return replyMsgCount;
    }

    public void setReplyMsgCount(int replyMsgCount) {
        this.replyMsgCount = replyMsgCount;
    }

    public int getTotalMsgCount() {
        return totalMsgCount;
    }

    public void setTotalMsgCount(int totalMsgCount) {
        this.totalMsgCount = totalMsgCount;
    }

    public int getMsgCount() {
        return msgCount;
    }

    public void setMsgCount(int msgCount) {
        this.msgCount = msgCount;
    }

    public Date getLastCustomerMsgTimeStamp() {
        return lastCustomerMsgTimeStamp;
    }

    public void setLastCustomerMsgTimeStamp(Date lastCustomerMsgTimeStamp) {
        this.lastCustomerMsgTimeStamp = lastCustomerMsgTimeStamp;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public Date getLastRedirectTime() {
        return lastRedirectTime;
    }

    public void setLastRedirectTime(Date lastRedirectTime) {
        this.lastRedirectTime = lastRedirectTime;
    }

    public String getPreviousPeer() {
        return previousPeer;
    }

    public void setPreviousPeer(String previousPeer) {
        this.previousPeer = previousPeer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLastRedirectUserTime() {
        return lastRedirectUserTime;
    }

    public void setLastRedirectUserTime(Date lastRedirectUserTime) {
        this.lastRedirectUserTime = lastRedirectUserTime;
    }

    public Date getStartCustomerWaitTimeStamp() {
        return startCustomerWaitTimeStamp;
    }

    public void setStartCustomerWaitTimeStamp(Date startCustomerWaitTimeStamp) {
        this.startCustomerWaitTimeStamp = startCustomerWaitTimeStamp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public String getFinishUser() {
        return finishUser;
    }

    public void setFinishUser(String finishUser) {
        this.finishUser = finishUser;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getOtherParams() {
        return otherParams;
    }

    public void setOtherParams(String otherParams) {
        this.otherParams = otherParams;
    }

    public DateTime getRcreatetime() {
        return rcreatetime;
    }

    public void setRcreatetime(DateTime rcreatetime) {
        this.rcreatetime = rcreatetime;
    }
}
