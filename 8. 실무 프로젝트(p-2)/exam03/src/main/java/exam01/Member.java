package exam01;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data // @Tostirng, @Getter, @Setter, @EqualsAndHashcode
public class Member {
    private long USER_NO;
    private String USER_ID;
    private String USER_PW;
    private String USER_NM;
    private LocalDateTime REG_DT;
    private LocalDateTime MOD_DT;
}
