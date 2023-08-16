package dubori.junit.junitstudy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {
    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println(study);
    }
    @BeforeAll
    @Disabled
    static void create2() {
        System.out.println("모든 테스트 전에 실행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach()");
    }


}