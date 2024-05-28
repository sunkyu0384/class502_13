package exam01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ex02 { // 모든 테스트 메서드 호출 전 단 한 번 실행 - 공통 초기화
    @BeforeAll
    static void init() {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


    @Test
    void test1() {

    }
}
