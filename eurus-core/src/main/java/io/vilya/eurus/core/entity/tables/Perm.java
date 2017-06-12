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
import io.vilya.eurus.core.entity.tables.records.PermRecord;


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
public class Perm extends TableImpl<PermRecord> {

    private static final long serialVersionUID = 886411068;

    /**
     * The reference instance of <code>DB_VY_CORE.perm</code>
     */
    public static final Perm PERM = new Perm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PermRecord> getRecordType() {
        return PermRecord.class;
    }

    /**
     * The column <code>DB_VY_CORE.perm.id</code>.
     */
    public final TableField<PermRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm.perm_name</code>.
     */
    public final TableField<PermRecord, String> PERM_NAME = createField("perm_name", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm.perm_desc</code>.
     */
    public final TableField<PermRecord, String> PERM_DESC = createField("perm_desc", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm.create_time</code>.
     */
    public final TableField<PermRecord, Date> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm.update_time</code>.
     */
    public final TableField<PermRecord, Date> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>DB_VY_CORE.perm.is_deleted</code>.
     */
    public final TableField<PermRecord, Boolean> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>DB_VY_CORE.perm</code> table reference
     */
    public Perm() {
        this("perm", null);
    }

    /**
     * Create an aliased <code>DB_VY_CORE.perm</code> table reference
     */
    public Perm(String alias) {
        this(alias, PERM);
    }

    private Perm(String alias, Table<PermRecord> aliased) {
        this(alias, aliased, null);
    }

    private Perm(String alias, Table<PermRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PermRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PERM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PermRecord> getPrimaryKey() {
        return Keys.KEY_PERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PermRecord>> getKeys() {
        return Arrays.<UniqueKey<PermRecord>>asList(Keys.KEY_PERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Perm as(String alias) {
        return new Perm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Perm rename(String name) {
        return new Perm(name, null);
    }
}
