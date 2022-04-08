/*
 * This file is generated by jOOQ.
 */
package com.examples.jooq.generated.tables;


import com.examples.jooq.generated.Keys;
import com.examples.jooq.generated.Public;
import com.examples.jooq.generated.tables.records.CarpartRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Carpart extends TableImpl<CarpartRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.CARPART</code>
     */
    public static final Carpart CARPART = new Carpart();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarpartRecord> getRecordType() {
        return CarpartRecord.class;
    }

    /**
     * The column <code>PUBLIC.CARPART.ID</code>.
     */
    public final TableField<CarpartRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.CARPART.CAR_ID</code>.
     */
    public final TableField<CarpartRecord, Integer> CAR_ID = createField(DSL.name("CAR_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CARPART.NAME</code>.
     */
    public final TableField<CarpartRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CARPART.PRICE</code>.
     */
    public final TableField<CarpartRecord, BigDecimal> PRICE = createField(DSL.name("PRICE"), SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    private Carpart(Name alias, Table<CarpartRecord> aliased) {
        this(alias, aliased, null);
    }

    private Carpart(Name alias, Table<CarpartRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.CARPART</code> table reference
     */
    public Carpart(String alias) {
        this(DSL.name(alias), CARPART);
    }

    /**
     * Create an aliased <code>PUBLIC.CARPART</code> table reference
     */
    public Carpart(Name alias) {
        this(alias, CARPART);
    }

    /**
     * Create a <code>PUBLIC.CARPART</code> table reference
     */
    public Carpart() {
        this(DSL.name("CARPART"), null);
    }

    public <O extends Record> Carpart(Table<O> child, ForeignKey<O, CarpartRecord> key) {
        super(child, key, CARPART);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<CarpartRecord, Integer> getIdentity() {
        return (Identity<CarpartRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CarpartRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public List<ForeignKey<CarpartRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CONSTRAINT_4B);
    }

    private transient Car _car;

    /**
     * Get the implicit join path to the <code>PUBLIC.CAR</code> table.
     */
    public Car car() {
        if (_car == null)
            _car = new Car(this, Keys.CONSTRAINT_4B);

        return _car;
    }

    @Override
    public Carpart as(String alias) {
        return new Carpart(DSL.name(alias), this);
    }

    @Override
    public Carpart as(Name alias) {
        return new Carpart(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Carpart rename(String name) {
        return new Carpart(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Carpart rename(Name name) {
        return new Carpart(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, String, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
