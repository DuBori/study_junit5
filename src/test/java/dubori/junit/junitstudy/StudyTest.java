package dubori.junit.junitstudy;

import dubori.junit.junitstudy.Enum.StudyState;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {
    @Test
    @DisplayName("공부 시작하기 :)")
    @Disabled
    void 테스트() {
        Study study = new Study(-10);
        assertNotNull(study);

        assertEquals(StudyState.OK, study.getStatus(), () ->"처음 만들면"+StudyState.OK+"상태다.");
        assertTrue(1 < 2);
        assertTrue(study.getLimit() > 0, " 스터디 최대 가능 인원은 0보다 커야한다.");
    }

    @Test
    @DisplayName("공부 시작하기 :)")
    @Disabled
    void 테스트2() {
        Study study = new Study(-10);
        assertNotNull(study);
        assertAll(
                () -> assertEquals(StudyState.OK, study.getStatus(), () ->"처음 만들면"+StudyState.OK+"상태다."),
                () -> assertTrue(1 > 2),
                () -> assertTrue(study.getLimit() > 0, " 스터디 최대 가능 인원은 0보다 커야한다.")
        );
    }
    @Test
    @DisplayName("Exception 테스트 케이스")
    @Disabled
    void 테스트3() {
        NumberFormatException numberFormatException = assertThrows(NumberFormatException.class, () -> new Study(-10));
        String message = numberFormatException.getMessage();
        System.out.println("message = " + message);
        assertEquals(message, "limit의 값은 0보다 커야한다.");
    }

    @Test
    @DisplayName("타임아웃 체크 테스트")
    @Disabled
    void 테스트4() {
        assertTimeout(Duration.ofMillis(10), () -> {
            new Study(10);
            Thread.sleep(3000);
        });
    }

    @Test
    @DisplayName("타임아웃 체크 테스트")
    void 테스트5() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });
    } // TODO ThreadLocal
}