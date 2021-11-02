package org.ict.replayprj.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("rno")
    @Expose
    private Integer rno;
    @SerializedName("bno")
    @Expose
    private Integer bno;
    @SerializedName("reply")
    @Expose
    private String reply;
    @SerializedName("replyer")
    @Expose
    private String replyer;
    @SerializedName("replyDate")
    @Expose
    private Long replyDate;
    @SerializedName("updateDate")
    @Expose
    private Long updateDate;

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getReplyer() {
        return replyer;
    }

    public void setReplyer(String replyer) {
        this.replyer = replyer;
    }

    public Long getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Long replyDate) {
        this.replyDate = replyDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

}