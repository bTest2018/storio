package com.pushtorefresh.storio3.sqlite.annotations;

import android.content.ContentValues;
import android.support.annotation.NonNull;
import com.pushtorefresh.storio3.sqlite.operations.put.DefaultPutResolver;
import com.pushtorefresh.storio3.sqlite.queries.InsertQuery;
import com.pushtorefresh.storio3.sqlite.queries.UpdateQuery;
import java.lang.Override;

/**
 * Generated resolver for Put Operation.
 */
public class BoxedTypesMethodsConstructorStorIOSQLitePutResolver extends DefaultPutResolver<BoxedTypesMethodsConstructor> {
    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public InsertQuery mapToInsertQuery(@NonNull BoxedTypesMethodsConstructor object) {
        return InsertQuery.builder()
            .table("table")
            .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public UpdateQuery mapToUpdateQuery(@NonNull BoxedTypesMethodsConstructor object) {
        return UpdateQuery.builder()
            .table("table")
            .where("field4 = ?")
            .whereArgs(object.getField4())
            .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public ContentValues mapToContentValues(@NonNull BoxedTypesMethodsConstructor object) {
        ContentValues contentValues = new ContentValues(6);

        contentValues.put("field1", object.getField1());
        contentValues.put("field2", object.getField2());
        contentValues.put("field3", object.getField3());
        contentValues.put("field4", object.getField4());
        contentValues.put("field5", object.getField5());
        contentValues.put("field6", object.getField6());

        return contentValues;
    }
}