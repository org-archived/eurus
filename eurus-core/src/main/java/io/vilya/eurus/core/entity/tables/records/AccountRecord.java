/*
 * This file is generated by jOOQ.
*/
package io.vilya.eurus.core.entity.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import io.vilya.eurus.core.entity.tables.Account;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record7<Integer, String, String, String, Date, Date, Boolean> {

    private static final long serialVersionUID = -1667906493;

    /**
     * Setter for <code>DB_VY_CORE.account.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>DB_VY_CORE.account.acc_username</code>. 用户名
     */
    public void setAccUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.acc_username</code>. 用户名
     */
    public String getAccUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_VY_CORE.account.acc_password</code>. 密码
     */
    public void setAccPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.acc_password</code>. 密码
     */
    public String getAccPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_VY_CORE.account.token</code>.
     */
    public void setToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.token</code>.
     */
    public String getToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_VY_CORE.account.create_time</code>. 记录创建时间
     */
    public void setCreateTime(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.create_time</code>. 记录创建时间
     */
    public Date getCreateTime() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>DB_VY_CORE.account.update_time</code>. 记录更新时间
     */
    public void setUpdateTime(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.update_time</code>. 记录更新时间
     */
    public Date getUpdateTime() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>DB_VY_CORE.account.is_deleted</code>. 记录是否被删除：0-否 1-是
     */
    public void setIsDeleted(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>DB_VY_CORE.account.is_deleted</code>. 记录是否被删除：0-否 1-是
     */
    public Boolean getIsDeleted() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Date, Date, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Date, Date, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Account.ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Account.ACCOUNT.ACC_USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Account.ACCOUNT.ACC_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Account.ACCOUNT.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Account.ACCOUNT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Account.ACCOUNT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Account.ACCOUNT.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAccPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value2(String value) {
        setAccUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value3(String value) {
        setAccPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value4(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value5(Date value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value6(Date value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value7(Boolean value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord values(Integer value1, String value2, String value3, String value4, Date value5, Date value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Integer id, String accUsername, String accPassword, String token, Date createTime, Date updateTime, Boolean isDeleted) {
        super(Account.ACCOUNT);

        set(0, id);
        set(1, accUsername);
        set(2, accPassword);
        set(3, token);
        set(4, createTime);
        set(5, updateTime);
        set(6, isDeleted);
    }
}
