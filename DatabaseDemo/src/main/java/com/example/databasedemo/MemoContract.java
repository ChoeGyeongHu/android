package com.example.databasedemo;

import android.provider.BaseColumns;

/*
* 인스턴스로 만들게 아니라 상수를 정의해서 사용할 것이므로 생성자 접근을 막고,
* 상속을 하지 못하게 하기 위해 final 예약어를 걸어둔다.
* */
public final class MemoContract {
    private MemoContract() {
    }

    // table 정보
    public static class MemoEntry implements BaseColumns {
        public static final String TABLE_NAME = "memo";
        public static final String COLUMN_NAME_TILE = "title";
        public static final String COLUMN_NAME_CONTENTS = "contents";
    }
}
