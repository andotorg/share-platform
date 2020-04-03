package org.andot.share.api.entity;

import java.io.Serializable;
import java.util.Date;

public class OperatePower implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.operate_power_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Integer operatePowerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.operate_power_name
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private String operatePowerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.operate_power_type
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Byte operatePowerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.disabled
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Byte disabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.create_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.update_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_power.delete_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table operate_power
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.operate_power_id
     *
     * @return the value of operate_power.operate_power_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Integer getOperatePowerId() {
        return operatePowerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.operate_power_id
     *
     * @param operatePowerId the value for operate_power.operate_power_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setOperatePowerId(Integer operatePowerId) {
        this.operatePowerId = operatePowerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.operate_power_name
     *
     * @return the value of operate_power.operate_power_name
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public String getOperatePowerName() {
        return operatePowerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.operate_power_name
     *
     * @param operatePowerName the value for operate_power.operate_power_name
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setOperatePowerName(String operatePowerName) {
        this.operatePowerName = operatePowerName == null ? null : operatePowerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.operate_power_type
     *
     * @return the value of operate_power.operate_power_type
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Byte getOperatePowerType() {
        return operatePowerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.operate_power_type
     *
     * @param operatePowerType the value for operate_power.operate_power_type
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setOperatePowerType(Byte operatePowerType) {
        this.operatePowerType = operatePowerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.disabled
     *
     * @return the value of operate_power.disabled
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Byte getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.disabled
     *
     * @param disabled the value for operate_power.disabled
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.create_time
     *
     * @return the value of operate_power.create_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.create_time
     *
     * @param createTime the value for operate_power.create_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.update_time
     *
     * @return the value of operate_power.update_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.update_time
     *
     * @param updateTime the value for operate_power.update_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_power.delete_time
     *
     * @return the value of operate_power.delete_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_power.delete_time
     *
     * @param deleteTime the value for operate_power.delete_time
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_power
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operatePowerId=").append(operatePowerId);
        sb.append(", operatePowerName=").append(operatePowerName);
        sb.append(", operatePowerType=").append(operatePowerType);
        sb.append(", disabled=").append(disabled);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_power
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OperatePower other = (OperatePower) that;
        return (this.getOperatePowerId() == null ? other.getOperatePowerId() == null : this.getOperatePowerId().equals(other.getOperatePowerId()))
            && (this.getOperatePowerName() == null ? other.getOperatePowerName() == null : this.getOperatePowerName().equals(other.getOperatePowerName()))
            && (this.getOperatePowerType() == null ? other.getOperatePowerType() == null : this.getOperatePowerType().equals(other.getOperatePowerType()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_power
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperatePowerId() == null) ? 0 : getOperatePowerId().hashCode());
        result = prime * result + ((getOperatePowerName() == null) ? 0 : getOperatePowerName().hashCode());
        result = prime * result + ((getOperatePowerType() == null) ? 0 : getOperatePowerType().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        return result;
    }
}