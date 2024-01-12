package com.tujia.ToStringMd5;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 *
 * @author lidongw_1
 * @date 2018/8/28
 */
public class QueryArticleRequest extends PageRequest {


    /**
     * 置顶
     */
    private Boolean isTop;

    /**
     * id list
     */
    private List<Long> ids;

    /**
     * 查询等级范围
     */
    private RangeGrade rangeGrade;

    /**
     * 文章状态
     */
    private Integer enumArticleState;


    /**
     * 文章审核状态
     *
     */
    private Integer enumAuditState;

    /**
     * 城市ID
     */
    private Integer cityId;

    /**
     * tagIds
     */
    private List<Long> tagIds;

    /**
     * 晚于当前时间
     */
    private Date afterPublishTime;

    /**
     * 早于当前时间
     */
    private Date beforePublishTime;

    /**
     * 作者ID
     */
    private Long authorUid;

    @ApiModelProperty(value = "用户昵称")
    private String userNickName;

    /**
     * 最少图片数
     */
    private Integer minImageNum;

    @ApiModelProperty(value = "发布时间")
    private DateTimeRange publishDateTime;


    @ApiModelProperty(value = "标签名")
    private String tagName;

    @ApiModelProperty(value = "1:一星 2:二星 3:三星 4:四星 5:五星 ")
    private Integer enumArticleGrade;


    private Integer enumArticleType;

    private DateTimeRange createDatetimeRange;

    @ApiModelProperty(value = "来源", hidden = false)
    private Integer enumArticleSource;

    @ApiModelProperty(value = "要排除的文章", hidden = false)
    private List<Long> excludeArticleIdList;

    @ApiModelProperty(value = "批量查询审核状态", hidden = false)
    private List<Integer> enumAuditStateList;

    /**
     * 是否有房屋
     */
    private Boolean haveUnit;

    /**
     * 大于等于当前分
     */
    private int gteArticleGrade;

    public QueryArticleRequest() {

    }




    public Integer getEnumArticleSource() {
        return enumArticleSource;
    }

    public void setEnumArticleSource(Integer enumArticleSource) {
        this.enumArticleSource = enumArticleSource;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean top) {
        isTop = top;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public RangeGrade getRangeGrade() {
        return rangeGrade;
    }

    public void setRangeGrade(RangeGrade rangeGrade) {
        this.rangeGrade = rangeGrade;
    }

    public Integer getEnumArticleState() {
        return enumArticleState;
    }

    public void setEnumArticleState(Integer enumArticleState) {
        this.enumArticleState = enumArticleState;
    }


    public Integer getEnumAuditState() {
        return enumAuditState;
    }

    public void setEnumAuditState(Integer enumAuditState) {
        this.enumAuditState = enumAuditState;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    public Date getAfterPublishTime() {
        return afterPublishTime;
    }

    public void setAfterPublishTime(Date afterPublishTime) {
        this.afterPublishTime = afterPublishTime;
    }

    public Date getBeforePublishTime() {
        return beforePublishTime;
    }

    public void setBeforePublishTime(Date beforePublishTime) {
        this.beforePublishTime = beforePublishTime;
    }

    public Long getAuthorUid() {
        return authorUid;
    }

    public void setAuthorUid(Long authorUid) {
        this.authorUid = authorUid;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Integer getMinImageNum() {
        return minImageNum;
    }

    public void setMinImageNum(Integer minImageNum) {
        this.minImageNum = minImageNum;
    }

    public DateTimeRange getPublishDateTime() {
        return publishDateTime;
    }

    public void setPublishDateTime(DateTimeRange publishDateTime) {
        this.publishDateTime = publishDateTime;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getEnumArticleGrade() {
        return enumArticleGrade;
    }

    public void setEnumArticleGrade(Integer enumArticleGrade) {
        this.enumArticleGrade = enumArticleGrade;
    }

    public Integer getEnumArticleType() {
        return enumArticleType;
    }

    public void setEnumArticleType(Integer enumArticleType) {
        this.enumArticleType = enumArticleType;
    }

    public DateTimeRange getCreateDatetimeRange() {
        return createDatetimeRange;
    }

    public void setCreateDatetimeRange(DateTimeRange createDatetimeRange) {
        this.createDatetimeRange = createDatetimeRange;
    }

    public List<Long> getExcludeArticleIdList() {
        return excludeArticleIdList;
    }

    public void setExcludeArticleIdList(List<Long> excludeArticleIdList) {
        this.excludeArticleIdList = excludeArticleIdList;
    }

    public List<Integer> getEnumAuditStateList() {
        return enumAuditStateList;
    }

    public void setEnumAuditStateList(List<Integer> enumAuditStateList) {
        this.enumAuditStateList = enumAuditStateList;
    }

    public Boolean getHaveUnit() {
        return haveUnit;
    }

    public void setHaveUnit(Boolean haveUnit) {
        this.haveUnit = haveUnit;
    }


    public int getGteArticleGrade() {
        return gteArticleGrade;
    }

    public void setGteArticleGrade(int gteArticleGrade) {
        this.gteArticleGrade = gteArticleGrade;
    }

    @Override
    public String toString() {
        return "QueryArticleRequest{" +
                "isTop=" + isTop + ", " +
                "ids=" + ids + ", " +
                "rangeGrade=" + rangeGrade + ", " +
                "enumArticleState=" + enumArticleState + ", " +
                "enumAuditState=" + enumAuditState + ", cityId=" + cityId + ", tagIds=" + tagIds + ", afterPublishTime=" + afterPublishTime + ", beforePublishTime=" + beforePublishTime + ", authorUid=" + authorUid + ", userNickName='" + userNickName + '\'' + ", minImageNum=" + minImageNum + ", publishDateTime=" + publishDateTime + ", tagName='" + tagName + '\'' + ", enumArticleGrade=" + enumArticleGrade + ", enumArticleType=" + enumArticleType + ", createDatetimeRange=" + createDatetimeRange + ", enumArticleSource=" + enumArticleSource + ", excludeArticleIdList=" + excludeArticleIdList + ", enumAuditStateList=" + enumAuditStateList + ", haveUnit=" + haveUnit + ", gteArticleGrade=" + gteArticleGrade + '}';
    }
}
