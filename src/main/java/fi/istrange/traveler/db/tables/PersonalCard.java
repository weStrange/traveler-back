/*
 * This file is generated by jOOQ.
*/
package fi.istrange.traveler.db.tables;


import fi.istrange.traveler.db.Keys;
import fi.istrange.traveler.db.Public;
import fi.istrange.traveler.db.tables.records.PersonalCardRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;


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
public class PersonalCard extends TableImpl<PersonalCardRecord> {

    private static final long serialVersionUID = -111917777;

    /**
     * The reference instance of <code>public.personal_card</code>
     */
    public static final PersonalCard PERSONAL_CARD = new PersonalCard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonalCardRecord> getRecordType() {
        return PersonalCardRecord.class;
    }

    /**
     * The column <code>public.personal_card.id</code>.
     */
    public final TableField<PersonalCardRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.personal_card.start_time</code>.
     */
    public final TableField<PersonalCardRecord, Date> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.personal_card.end_time</code>.
     */
    public final TableField<PersonalCardRecord, Date> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.personal_card.lon</code>.
     */
    public final TableField<PersonalCardRecord, Long> LON = createField("lon", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.personal_card.lat</code>.
     */
    public final TableField<PersonalCardRecord, Long> LAT = createField("lat", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.personal_card.username_fk</code>.
     */
    public final TableField<PersonalCardRecord, String> USERNAME_FK = createField("username_fk", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "");

    /**
     * Create a <code>public.personal_card</code> table reference
     */
    public PersonalCard() {
        this("personal_card", null);
    }

    /**
     * Create an aliased <code>public.personal_card</code> table reference
     */
    public PersonalCard(String alias) {
        this(alias, PERSONAL_CARD);
    }

    private PersonalCard(String alias, Table<PersonalCardRecord> aliased) {
        this(alias, aliased, null);
    }

    private PersonalCard(String alias, Table<PersonalCardRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<PersonalCardRecord> getPrimaryKey() {
        return Keys.PERSONAL_CARD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PersonalCardRecord>> getKeys() {
        return Arrays.<UniqueKey<PersonalCardRecord>>asList(Keys.PERSONAL_CARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PersonalCardRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PersonalCardRecord, ?>>asList(Keys.PERSONAL_CARD__PERSONAL_CARD_USERNAME_FK_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonalCard as(String alias) {
        return new PersonalCard(alias, this);
    }

    /**
     * Rename this table
     */
    public PersonalCard rename(String name) {
        return new PersonalCard(name, null);
    }
}
