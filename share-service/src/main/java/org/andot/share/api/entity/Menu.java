package org.andot.share.api.entity;

import java.io.Serializable;

public class Menu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_action.menu_action_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Integer menuActionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_action.menu_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_action.action_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private Integer actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table menu_action
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_action.menu_action_id
     *
     * @return the value of menu_action.menu_action_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Integer getMenuActionId() {
        return menuActionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_action.menu_action_id
     *
     * @param menuActionId the value for menu_action.menu_action_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setMenuActionId(Integer menuActionId) {
        this.menuActionId = menuActionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_action.menu_id
     *
     * @return the value of menu_action.menu_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_action.menu_id
     *
     * @param menuId the value for menu_action.menu_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_action.action_id
     *
     * @return the value of menu_action.action_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_action.action_id
     *
     * @param actionId the value for menu_action.action_id
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_action
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuActionId=").append(menuActionId);
        sb.append(", menuId=").append(menuId);
        sb.append(", actionId=").append(actionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_action
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
        Menu other = (Menu) that;
        return (this.getMenuActionId() == null ? other.getMenuActionId() == null : this.getMenuActionId().equals(other.getMenuActionId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getActionId() == null ? other.getActionId() == null : this.getActionId().equals(other.getActionId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_action
     *
     * @mbggenerated Thu Jan 10 10:32:10 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuActionId() == null) ? 0 : getMenuActionId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getActionId() == null) ? 0 : getActionId().hashCode());
        return result;
    }
}