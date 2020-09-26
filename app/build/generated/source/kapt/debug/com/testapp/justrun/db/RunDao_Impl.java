package com.testapp.justrun.db;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.testapp.justrun.other.Converters;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RunDao_Impl implements RunDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RunEntites> __insertionAdapterOfRunEntites;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<RunEntites> __deletionAdapterOfRunEntites;

  public RunDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRunEntites = new EntityInsertionAdapter<RunEntites>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `running_table` (`id`,`img`,`timestamp`,`avgSpeedInKMH`,`distanceInMeters`,`timeInMillis`,`caloriesBurned`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunEntites value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final byte[] _tmp;
        _tmp = __converters.fromBitmap(value.getImg());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindBlob(2, _tmp);
        }
        stmt.bindLong(3, value.getTimestamp());
        stmt.bindDouble(4, value.getAvgSpeedInKMH());
        stmt.bindLong(5, value.getDistanceInMeters());
        stmt.bindLong(6, value.getTimeInMillis());
        stmt.bindLong(7, value.getCaloriesBurned());
      }
    };
    this.__deletionAdapterOfRunEntites = new EntityDeletionOrUpdateAdapter<RunEntites>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `running_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunEntites value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertRun(final RunEntites run, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRunEntites.insert(run);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteRun(final RunEntites run, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRunEntites.handle(run);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<RunEntites>> getAllRunSortedByDate() {
    final String _sql = "SELECT * FROM running_table ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<RunEntites>>() {
      @Override
      public List<RunEntites> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final List<RunEntites> _result = new ArrayList<RunEntites>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RunEntites _item;
            final Bitmap _tmpImg;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImg);
            _tmpImg = __converters.toBitmap(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new RunEntites(_tmpImg,_tmpTimestamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RunEntites>> getAllRunSortedByTimeInMillis() {
    final String _sql = "SELECT * FROM running_table ORDER BY timeInMillis DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<RunEntites>>() {
      @Override
      public List<RunEntites> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final List<RunEntites> _result = new ArrayList<RunEntites>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RunEntites _item;
            final Bitmap _tmpImg;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImg);
            _tmpImg = __converters.toBitmap(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new RunEntites(_tmpImg,_tmpTimestamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RunEntites>> getAllRunSortedByCaloriesBurned() {
    final String _sql = "SELECT * FROM running_table ORDER BY caloriesBurned DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<RunEntites>>() {
      @Override
      public List<RunEntites> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final List<RunEntites> _result = new ArrayList<RunEntites>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RunEntites _item;
            final Bitmap _tmpImg;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImg);
            _tmpImg = __converters.toBitmap(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new RunEntites(_tmpImg,_tmpTimestamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RunEntites>> getAllRunSortedByAvgSpeed() {
    final String _sql = "SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<RunEntites>>() {
      @Override
      public List<RunEntites> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final List<RunEntites> _result = new ArrayList<RunEntites>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RunEntites _item;
            final Bitmap _tmpImg;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImg);
            _tmpImg = __converters.toBitmap(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new RunEntites(_tmpImg,_tmpTimestamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RunEntites>> getAllRunSortedByDistance() {
    final String _sql = "SELECT * FROM running_table ORDER BY distanceInMeters DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<List<RunEntites>>() {
      @Override
      public List<RunEntites> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfAvgSpeedInKMH = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeedInKMH");
          final int _cursorIndexOfDistanceInMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceInMeters");
          final int _cursorIndexOfTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMillis");
          final int _cursorIndexOfCaloriesBurned = CursorUtil.getColumnIndexOrThrow(_cursor, "caloriesBurned");
          final List<RunEntites> _result = new ArrayList<RunEntites>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RunEntites _item;
            final Bitmap _tmpImg;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfImg);
            _tmpImg = __converters.toBitmap(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final float _tmpAvgSpeedInKMH;
            _tmpAvgSpeedInKMH = _cursor.getFloat(_cursorIndexOfAvgSpeedInKMH);
            final int _tmpDistanceInMeters;
            _tmpDistanceInMeters = _cursor.getInt(_cursorIndexOfDistanceInMeters);
            final long _tmpTimeInMillis;
            _tmpTimeInMillis = _cursor.getLong(_cursorIndexOfTimeInMillis);
            final int _tmpCaloriesBurned;
            _tmpCaloriesBurned = _cursor.getInt(_cursorIndexOfCaloriesBurned);
            _item = new RunEntites(_tmpImg,_tmpTimestamp,_tmpAvgSpeedInKMH,_tmpDistanceInMeters,_tmpTimeInMillis,_tmpCaloriesBurned);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Long> getTotalTimeInMillis() {
    final String _sql = "SELECT SUM(timeInMillis) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Long> getTotalCaloriesBurned() {
    final String _sql = "SELECT SUM(caloriesBurned) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Long> getTotalDistanceInMeter() {
    final String _sql = "SELECT SUM(distanceInMeters) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Long> getTotalAvgSpeedInKMH() {
    final String _sql = "SELECT SUM(avgSpeedInKMH) FROM running_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"running_table"}, false, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
