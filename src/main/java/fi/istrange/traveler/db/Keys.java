/*
 * This file is generated by jOOQ.
*/
package fi.istrange.traveler.db;


import fi.istrange.traveler.db.tables.Card;
import fi.istrange.traveler.db.tables.CardUser;
import fi.istrange.traveler.db.tables.GroupCard;
import fi.istrange.traveler.db.tables.Match;
import fi.istrange.traveler.db.tables.PersonalCard;
import fi.istrange.traveler.db.tables.TravelerUser;
import fi.istrange.traveler.db.tables.UserCredentials;
import fi.istrange.traveler.db.tables.UserPhoto;
import fi.istrange.traveler.db.tables.records.CardRecord;
import fi.istrange.traveler.db.tables.records.CardUserRecord;
import fi.istrange.traveler.db.tables.records.GroupCardRecord;
import fi.istrange.traveler.db.tables.records.MatchRecord;
import fi.istrange.traveler.db.tables.records.PersonalCardRecord;
import fi.istrange.traveler.db.tables.records.TravelerUserRecord;
import fi.istrange.traveler.db.tables.records.UserCredentialsRecord;
import fi.istrange.traveler.db.tables.records.UserPhotoRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CardRecord> CARD_PKEY = UniqueKeys0.CARD_PKEY;
    public static final UniqueKey<GroupCardRecord> GROUP_CARD_PKEY = UniqueKeys0.GROUP_CARD_PKEY;
    public static final UniqueKey<MatchRecord> TRAVELER_MATCH_PK = UniqueKeys0.TRAVELER_MATCH_PK;
    public static final UniqueKey<PersonalCardRecord> PERSONAL_CARD_PKEY = UniqueKeys0.PERSONAL_CARD_PKEY;
    public static final UniqueKey<TravelerUserRecord> TRAVELER_USER_PKEY = UniqueKeys0.TRAVELER_USER_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CardRecord, TravelerUserRecord> CARD__CARD_OWNER_FK_FKEY = ForeignKeys0.CARD__CARD_OWNER_FK_FKEY;
    public static final ForeignKey<CardUserRecord, GroupCardRecord> CARD_USER__CARD_USER_CARD_ID_FKEY = ForeignKeys0.CARD_USER__CARD_USER_CARD_ID_FKEY;
    public static final ForeignKey<CardUserRecord, TravelerUserRecord> CARD_USER__CARD_USER_USERNAME_FKEY = ForeignKeys0.CARD_USER__CARD_USER_USERNAME_FKEY;
    public static final ForeignKey<GroupCardRecord, CardRecord> GROUP_CARD__GROUP_CARD_ID_FKEY = ForeignKeys0.GROUP_CARD__GROUP_CARD_ID_FKEY;
    public static final ForeignKey<MatchRecord, CardRecord> MATCH__MATCH_LIKER_ID_FKEY = ForeignKeys0.MATCH__MATCH_LIKER_ID_FKEY;
    public static final ForeignKey<MatchRecord, CardRecord> MATCH__MATCH_LIKED_ID_FKEY = ForeignKeys0.MATCH__MATCH_LIKED_ID_FKEY;
    public static final ForeignKey<PersonalCardRecord, CardRecord> PERSONAL_CARD__PERSONAL_CARD_ID_FKEY = ForeignKeys0.PERSONAL_CARD__PERSONAL_CARD_ID_FKEY;
    public static final ForeignKey<UserCredentialsRecord, TravelerUserRecord> USER_CREDENTIALS__USER_CREDENTIALS_USERNAME_FKEY = ForeignKeys0.USER_CREDENTIALS__USER_CREDENTIALS_USERNAME_FKEY;
    public static final ForeignKey<UserPhotoRecord, TravelerUserRecord> USER_PHOTO__USER_PHOTO_USERNAME_FKEY = ForeignKeys0.USER_PHOTO__USER_PHOTO_USERNAME_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CardRecord> CARD_PKEY = createUniqueKey(Card.CARD, "card_pkey", Card.CARD.ID);
        public static final UniqueKey<GroupCardRecord> GROUP_CARD_PKEY = createUniqueKey(GroupCard.GROUP_CARD, "group_card_pkey", GroupCard.GROUP_CARD.ID);
        public static final UniqueKey<MatchRecord> TRAVELER_MATCH_PK = createUniqueKey(Match.MATCH, "traveler_match_pk", Match.MATCH.LIKER_CARD_ID, Match.MATCH.LIKED_CARD_ID);
        public static final UniqueKey<PersonalCardRecord> PERSONAL_CARD_PKEY = createUniqueKey(PersonalCard.PERSONAL_CARD, "personal_card_pkey", PersonalCard.PERSONAL_CARD.ID);
        public static final UniqueKey<TravelerUserRecord> TRAVELER_USER_PKEY = createUniqueKey(TravelerUser.TRAVELER_USER, "traveler_user_pkey", TravelerUser.TRAVELER_USER.USERNAME);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<CardRecord, TravelerUserRecord> CARD__CARD_OWNER_FK_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.TRAVELER_USER_PKEY, Card.CARD, "card__card_owner_fk_fkey", Card.CARD.OWNER_FK);
        public static final ForeignKey<CardUserRecord, GroupCardRecord> CARD_USER__CARD_USER_CARD_ID_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.GROUP_CARD_PKEY, CardUser.CARD_USER, "card_user__card_user_card_id_fkey", CardUser.CARD_USER.CARD_ID);
        public static final ForeignKey<CardUserRecord, TravelerUserRecord> CARD_USER__CARD_USER_USERNAME_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.TRAVELER_USER_PKEY, CardUser.CARD_USER, "card_user__card_user_username_fkey", CardUser.CARD_USER.USERNAME);
        public static final ForeignKey<GroupCardRecord, CardRecord> GROUP_CARD__GROUP_CARD_ID_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.CARD_PKEY, GroupCard.GROUP_CARD, "group_card__group_card_id_fkey", GroupCard.GROUP_CARD.ID);
        public static final ForeignKey<MatchRecord, CardRecord> MATCH__MATCH_LIKER_ID_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.CARD_PKEY, Match.MATCH, "match__match_liker_id_fkey", Match.MATCH.LIKER_CARD_ID);
        public static final ForeignKey<MatchRecord, CardRecord> MATCH__MATCH_LIKED_ID_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.CARD_PKEY, Match.MATCH, "match__match_liked_id_fkey", Match.MATCH.LIKED_CARD_ID);
        public static final ForeignKey<PersonalCardRecord, CardRecord> PERSONAL_CARD__PERSONAL_CARD_ID_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.CARD_PKEY, PersonalCard.PERSONAL_CARD, "personal_card__personal_card_id_fkey", PersonalCard.PERSONAL_CARD.ID);
        public static final ForeignKey<UserCredentialsRecord, TravelerUserRecord> USER_CREDENTIALS__USER_CREDENTIALS_USERNAME_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.TRAVELER_USER_PKEY, UserCredentials.USER_CREDENTIALS, "user_credentials__user_credentials_username_fkey", UserCredentials.USER_CREDENTIALS.USERNAME);
        public static final ForeignKey<UserPhotoRecord, TravelerUserRecord> USER_PHOTO__USER_PHOTO_USERNAME_FKEY = createForeignKey(fi.istrange.traveler.db.Keys.TRAVELER_USER_PKEY, UserPhoto.USER_PHOTO, "user_photo__user_photo_username_fkey", UserPhoto.USER_PHOTO.USERNAME);
    }
}
