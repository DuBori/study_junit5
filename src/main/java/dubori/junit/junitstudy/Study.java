package dubori.junit.junitstudy;

import dubori.junit.junitstudy.Enum.StudyState;

import java.util.Arrays;

public class Study {

    private StudyState status;
    private int limit;

    public Study(int limit) {
        validateLimit(limit);
        this.limit = limit;
    }

    private void validateLimit(int limit) {
        if (limit < 0) {
            throw new NumberFormatException("limit의 값은 0보다 커야한다.");
        }
    }

    public StudyState getStatus() {
        status = StudyState.OK;
        return status;
    }

    public int getLimit() {
        return limit;
    }
}
