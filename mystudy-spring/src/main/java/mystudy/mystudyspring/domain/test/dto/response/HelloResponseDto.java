package mystudy.mystudyspring.domain.test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloResponseDto {

    private String value;
    private boolean success;

    @Builder.Default
    private LocalDateTime createdOn = LocalDateTime.now();

}