
package com.example.model.db;

import com.example.model.db.CurrentWeatherCursor.Factory;
import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "CurrentWeather". Can be used for QueryBuilder and for referencing DB names.
 */
public final class CurrentWeather_ implements EntityInfo<CurrentWeather> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "CurrentWeather";

    public static final int __ENTITY_ID = 1;

    public static final Class<CurrentWeather> __ENTITY_CLASS = CurrentWeather.class;

    public static final String __DB_NAME = "CurrentWeather";

    public static final CursorFactory<CurrentWeather> __CURSOR_FACTORY = new Factory();

    @Internal
    static final CurrentWeatherIdGetter __ID_GETTER = new CurrentWeatherIdGetter();

    public final static CurrentWeather_ __INSTANCE = new CurrentWeather_();

    public final static io.objectbox.Property<CurrentWeather> id =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static io.objectbox.Property<CurrentWeather> temp =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, double.class, "temp");

    public final static io.objectbox.Property<CurrentWeather> humidity =
        new io.objectbox.Property<>(__INSTANCE, 2, 3, int.class, "humidity");

    public final static io.objectbox.Property<CurrentWeather> description =
        new io.objectbox.Property<>(__INSTANCE, 3, 4, String.class, "description");

    public final static io.objectbox.Property<CurrentWeather> main =
        new io.objectbox.Property<>(__INSTANCE, 4, 5, String.class, "main");

    public final static io.objectbox.Property<CurrentWeather> weatherId =
        new io.objectbox.Property<>(__INSTANCE, 5, 6, int.class, "weatherId");

    public final static io.objectbox.Property<CurrentWeather> windDeg =
        new io.objectbox.Property<>(__INSTANCE, 6, 7, double.class, "windDeg");

    public final static io.objectbox.Property<CurrentWeather> windSpeed =
        new io.objectbox.Property<>(__INSTANCE, 7, 8, double.class, "windSpeed");

    public final static io.objectbox.Property<CurrentWeather> storeTimestamp =
        new io.objectbox.Property<>(__INSTANCE, 8, 9, long.class, "storeTimestamp");

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<CurrentWeather>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        id,
        temp,
        humidity,
        description,
        main,
        weatherId,
        windDeg,
        windSpeed,
        storeTimestamp
    };

    public final static io.objectbox.Property<CurrentWeather> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<CurrentWeather> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<CurrentWeather>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<CurrentWeather> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<CurrentWeather> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<CurrentWeather> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class CurrentWeatherIdGetter implements IdGetter<CurrentWeather> {
        @Override
        public long getId(CurrentWeather object) {
            return object.getId();
        }
    }

}
