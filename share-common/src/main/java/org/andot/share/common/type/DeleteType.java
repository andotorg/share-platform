package org.andot.share.common.type;

/**
 * 审核状态
 * @author gavin
 */
public enum DeleteType {
    /**
     * 删除
     */
    DELETE(1),

    /**
     * 正常
     */
    NORMAL(0);

    private int value;

    DeleteType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
