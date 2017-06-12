/*
 * This file is generated by jOOQ.
*/
package io.vilya.eurus.core.entity.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import io.vilya.eurus.core.entity.DbVyCore;
import io.vilya.eurus.core.entity.Keys;
import io.vilya.eurus.core.entity.tables.records.PermRRoleRecord;


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
public class PermRRole extends TableImpl<PermRRoleRecord> {

    private static final long serialVersionUID = -273587983;

    /**
     * The reference instance of <code>DB_VY_CORE.perm_r_role</code>
     */
    public static final PermRRole PERM_R_ROLE = new PermRRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PermRRoleRecord> getRecordType() {
        return PermRRoleRecord.class;
    }

    /**
     * The column <code>DB_VY_CORE.perm_r_role.id</code>.
     */
    public final TableField<PermRRoleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm_r_role.perm_id</code>.
     */
    public final TableField<PermRRoleRecord, Integer> PERM_ID = createField("perm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm_r_role.role_id</code>.
     */
    public final TableField<PermRRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm_r_role.create_time</code>.
     */
    public final TableField<PermRRoleRecord, Date> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm_r_role.update_time</code>.
     */
    public final TableField<PermRRoleRecord, Date> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm_r_role.is_deleted</code>.
     */
    public final TableField<PermRRoleRecord, Boolean> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>DB_VY_CORE.perm_r_role</code> table reference
     */
    public PermRRole() {
        this("perm_r_role", null);
    }

    /**
     * Create an aliased <code>DB_VY_CORE.perm_r_role</code> table reference
     */
    public PermRRole(String alias) {
        this(alias, PERM_R_ROLE);
    }

    private PermRRole(String alias, Table<PermRRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private PermRRole(String alias, Table<PermRRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbVyCore.DB_VY_CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PermRRoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PERM_R_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PermRRoleRecord> getPrimaryKey() {
        return Keys.KEY_PERM_R_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PermRRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<PermRRoleRecord>>asList(Keys.KEY_PERM_R_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PermRRole as(String alias) {
        return new PermRRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PermRRole rename(String name) {
        return new PermRRole(name, null);
    }
}