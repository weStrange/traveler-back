/*
 * This file is generated by jOOQ.
*/
package fi.istrange.traveler.db.tables;


import fi.istrange.traveler.db.Keys;
import fi.istrange.traveler.db.Public;
import fi.istrange.traveler.db.tables.records.TravelerUserRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TravelerUser extends TableImpl<TravelerUserRecord> {

    private static final long serialVersionUID = -1968376094;

    /**
     * The reference instance of <code>public.traveler_user</code>
     */
    public static final TravelerUser TRAVELER_USER = new TravelerUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TravelerUserRecord> getRecordType() {
        return TravelerUserRecord.class;
    }

    /**
     * The column <code>public.traveler_user.username</code>.
     */
    public final TableField<TravelerUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "");

    /**
     * The column <code>public.traveler_user.birth</code>.
     */
    public final TableField<TravelerUserRecord, Date> BIRTH = createField("birth", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.traveler_user.gender</code>.
     */
    public final TableField<TravelerUserRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>public.traveler_user.email</code>.
     */
    public final TableField<TravelerUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>public.traveler_user.phone</code>.
     */
    public final TableField<TravelerUserRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>public.traveler_user.address</code>.
     */
    public final TableField<TravelerUserRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>public.traveler_user.city</code>.
     */
    public final TableField<TravelerUserRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>public.traveler_user.country</code>.
     */
    public final TableField<TravelerUserRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>public.traveler_user.photo</code>.
     */
    public final TableField<TravelerUserRecord, Long> PHOTO = createField("photo", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.traveler_user.first_name</code>.
     */
    public final TableField<TravelerUserRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>public.traveler_user.last_name</code>.
     */
    public final TableField<TravelerUserRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * Create a <code>public.traveler_user</code> table reference
     */
    public TravelerUser() {
        this("traveler_user", null);
    }

    /**
     * Create an aliased <code>public.traveler_user</code> table reference
     */
    public TravelerUser(String alias) {
        this(alias, TRAVELER_USER);
    }

    private TravelerUser(String alias, Table<TravelerUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TravelerUser(String alias, Table<TravelerUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TravelerUserRecord> getPrimaryKey() {
        return Keys.TRAVELER_USER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TravelerUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TravelerUserRecord>>asList(Keys.TRAVELER_USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TravelerUser as(String alias) {
        return new TravelerUser(alias, this);
    }

    public TravelerUser rename(String name) {
        return new TravelerUser(name, null);
    }
}
